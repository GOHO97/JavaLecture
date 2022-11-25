package ho0711csv;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import com.soldesk.ho.db.manager.HoDBManager;

public class CSVM {
	
	private final static CSVM M = new CSVM();
	
	private CSVM() {
		// TODO Auto-generated constructor stub
	}
	
	public static CSVM getM() {
		return M;
	}

	public String selectData() {
		BufferedWriter bw = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			
			FileOutputStream fos = new FileOutputStream("D:/ho/mise/mosquito.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			
			String sql = "select * from jul08_mosquito_ho";
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,HH");
			
			
			while (rs.next()) {
				bw.write(sdf.format(rs.getDate("m_date")) + ",");
				bw.write(rs.getDouble("m_water") + ",");
				bw.write(rs.getDouble("m_house") + ",");
				bw.write(rs.getDouble("m_park") + "\r\n");
				bw.flush();
			} return "성공";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "실패";
		} finally {
			HoDBManager.bye(con, ptmt, rs);
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
}
			
	
