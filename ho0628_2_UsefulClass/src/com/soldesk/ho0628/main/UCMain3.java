package com.soldesk.ho0628.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UCMain3 {
	public static void main(String[] args) {
		HttpURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			FileOutputStream fos = new FileOutputStream("D:/ho/mise/subway.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);

			String date = null;
			for (int y = 2015; y < 2022; y++) {

				for (int m = 1; m < 13; m++) {
					for (int d = 1; d < 32; d++) {
						date = String.format("%d%02d%02d", y, m, d);

						URL u = new URL(
								"http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/CardSubwayStatsNew/1/620/" + date);
						huc = (HttpURLConnection) u.openConnection();
						InputStream is = huc.getInputStream();
						InputStreamReader isr = new InputStreamReader(is, "utf-8");

						JSONParser jp = new JSONParser();
						JSONObject jo = (JSONObject) jp.parse(isr);
						JSONObject cssn = (JSONObject) jo.get("CardSubwayStatsNew");

						if (cssn != null) {

							JSONArray r = (JSONArray) cssn.get("row");
							JSONObject station = null;
							String when = null;
							for (int i = 0; i < r.size(); i++) {
								station = (JSONObject) r.get(i);
								when = station.get("USE_DT") + "";
								bw.write(when.substring(0, 4) + ",");
								bw.write(when.substring(4, 6) + ",");
								bw.write(when.substring(6, 8) + ",");

								bw.write(station.get("LINE_NUM") + ",");
								bw.write(station.get("SUB_STA_NM") + ",");
								bw.write(station.get("RIDE_PASGR_NUM") + ",");
								bw.write(station.get("ALIGHT_PASGR_NUM") + "\r\n");
								bw.flush();
							}
							System.out.println(date + "³¡");
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
