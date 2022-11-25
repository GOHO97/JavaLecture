package com.ho.last.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.soldesk.ho.db.manager.HoDBManager;

public class BaeminDAO {
	private int allMenuCount;
	private int menuPerPage;
	private int pageCount;
	
	private static final BaeminDAO BDA = new BaeminDAO();

	private BaeminDAO() {
		menuPerPage = 3;
	}

	public static BaeminDAO getBda() {
		return BDA;
	}

	public String regShop(ShopInfo si) {

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "insert into JUL07_SHOP_HO values" + "(?, ?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, si.getS_name());
			pstmt.setString(2, si.getS_call());

			if (pstmt.executeUpdate() >= 1) {
				return "성공★(찡긋)";
			} else {
				return "실패";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "실패(ㅜ_ㅜ)";
		} finally {
			HoDBManager.bye(con, pstmt, null);
		}
	}

	public String regMenu(MenuInfo mi) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "insert into JUL07_MENU_HO values" + "(jul07_menu_ho_seq.nextval, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, mi.getM_name());
			pstmt.setInt(2, mi.getM_price());
			pstmt.setString(3, mi.getM_s_name());

			if (pstmt.executeUpdate() >= 1) {
				allMenuCount++;
				return "성공★(찡긋)";
			} else {
				return "실패";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "실패(ㅜ_ㅜ)";
		} finally {
			HoDBManager.bye(con, pstmt, null);
		}
	}

	public String showShop() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "select s_name from jul07_shop_ho" + " order by s_name";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			StringBuffer sb = new StringBuffer();
			String s = "";
			while (rs.next()) {
				s = String.format("%s\r\n", rs.getString("s_name"));
				sb.append(s);
			}
			return sb.toString();

		} catch (Exception e) {
			return "실패(ㅜ_ㅜ)";
		} finally {
			HoDBManager.bye(con, pstmt, rs);
		}
	}

	public String showMenu() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "select m_name from jul07_menu_ho" + " order by m_name";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			StringBuffer sb = new StringBuffer();
			String s = "";
			while (rs.next()) {
				s = String.format("%s\r\n", rs.getString("m_name"));
				sb.append(s);
			}
			return sb.toString();

		} catch (Exception e) {
			return "실패(ㅜ_ㅜ)";
		} finally {
			HoDBManager.bye(con, pstmt, rs);
		}
	}

	public void setAllMenuCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql = "select count(*) from JUL07_MENU_HO";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			rs.next();
			allMenuCount = rs.getInt("count(*)");
			System.out.println(allMenuCount);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HoDBManager.bye(con, pstmt, rs);
		}
	}

	public String getPageCount() {
		//16 / 3 = 5.1 (올림필요)
		//allMenuCount / menuPerPage => 5
		// allMenuCount / (double) menuPerPage => 5.1
		//math.ceil(allMenuCount / (double) menuPerPage) => 6.0
		//(int) math.ceil(allMenuCount / (double) menuPerPage) => 6
		pageCount = (int) Math.ceil(allMenuCount / (double) menuPerPage);
		
		return String.format("페이지 번호[1 ~ %d]", pageCount);
	}

	public ArrayList<MenuInfo> showPageMenu(int pageNum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String addr = "jdbc:oracle:thin:@192.168.0.100:1521:xe";
			con = HoDBManager.hi(addr, "lp2011a", "rudgh6401");
			String sql ="select *"
					+ "from( "
					+ "	select rownum as rn, m_name, m_price, m_s_name "
					+ "	from( "
					+ "		select m_name, m_price, m_s_name "
					+ "		from JUL07_MENU_HO "
					+ "		order by m_name, m_price "
					+ "	) "
					+ ") "
					+ "where rn >= ? and rn <= ?";
			pstmt = con.prepareStatement(sql);
			
			int start = (pageNum - 1) * menuPerPage + 1;
			int end = start + menuPerPage - 1;
			
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			
			ArrayList<MenuInfo> menus = new ArrayList<MenuInfo>();
			MenuInfo m = null;
			
			while (rs.next()) {
				m = new MenuInfo();
				m.setM_name(rs.getString("m_name"));
				m.setM_price(rs.getInt("m_price"));
				m.setM_s_name(rs.getString("m_s_name"));
				menus.add(m);
			}
			return menus;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HoDBManager.bye(con, pstmt, rs);
		}
	}

}