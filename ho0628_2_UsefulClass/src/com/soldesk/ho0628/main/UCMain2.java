package com.soldesk.ho0628.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class UCMain2 {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		Scanner k = new Scanner(System.in);
		System.out.print("¹¹ : ");
		String q = k.next();
		try {
			q = URLEncoder.encode(q, "utf-8");
			String s = "https://openapi.naver.com/v1/search/news.xml?sort=sim&display=100&query=" + q;
			URL u = new URL(s);
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("X-Naver-Client-Id", "hDC5lYO9N9IbJg63cS_u");
			huc.addRequestProperty("X-Naver-Client-Secret", "dksK6IXgpK");
			InputStream is = huc.getInputStream();

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			String t = null;
			boolean data = false;
			int what = xpp.getEventType();
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					t = xpp.getName();
					if (t.equals("item")) {
						data = true;
					}
				} else if (what == XmlPullParser.TEXT) {
					if (t.equals("title")) {
						System.out.println(StringCleaner.clean(xpp.getText()));
					} else if (t.equals("description")) {
						System.out.println(StringCleaner.clean(xpp.getText()));
					}
				} else if (what == XmlPullParser.END_TAG) {
			
				}
				xpp.next();
				what = xpp.getEventType();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
		k.close();
	}
}
