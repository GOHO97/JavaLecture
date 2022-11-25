package ho0628.main;

import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class USMain {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		try {
			URL u = new URL("https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1150057000");
			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			
			String t = null;
			int what = xpp.getEventType(); 
			while(what != XmlPullParser.END_DOCUMENT) {
				if(what == XmlPullParser.START_TAG) {
					t = xpp.getName();
				}else if (what == XmlPullParser.TEXT) {
					if(t.equals("hour")) {
						System.out.printf("~%s시까지", xpp.getText());
					} else if (t.equals("temp")) {
						System.out.printf("%s도", xpp.getText());
					} else if (t.equals("wfKor")) {
						System.out.println(xpp.getText());
					}
				} else if (what == XmlPullParser.END_TAG) {
					t = "";
				}
				xpp.next();
				what = xpp.getEventType();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
	}
}
