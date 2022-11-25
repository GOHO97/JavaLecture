package com.soldesk.ho0628.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class UCMain {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		HttpURLConnection huc = null;
		try {
			FileOutputStream fos = new FileOutputStream("D:/ho/mise/dust.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);
			
			URL u = new URL("http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/RealtimeCityAir/1/25/");
			huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("MMdd,HH");
			String now2 = sdf.format(now);
			System.out.println(now2);
			
			String t = null;
			int what = xpp.getEventType(); 
			while(what != XmlPullParser.END_DOCUMENT) {
				if(what == XmlPullParser.START_TAG) {
					t = xpp.getName();
				}else if (what == XmlPullParser.TEXT) {
					if(t.equals("MSRSTE_NM")) {
						bw.write(now2);
						bw.write(xpp.getText() + ",");
					} else if (t.equals("PM10")) {
						bw.write(xpp.getText() + ",");
					} else if (t.equals("PM25")) {
						bw.write(xpp.getText() + ",");
					} else if (t.equals("IDEX_NM")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}
				}else if (what == XmlPullParser.END_TAG) {
					t = "";
				}
				xpp.next();
				what = xpp.getEventType();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
