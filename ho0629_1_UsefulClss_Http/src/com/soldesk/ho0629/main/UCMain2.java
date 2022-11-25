package com.soldesk.ho0629.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UCMain2 {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			
			FileOutputStream fos = new FileOutputStream("D:/ho/mise/weather.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw); 
			
			URL u = new URL("https://api.openweathermap.org/data/2.5/weather?lat=37.5053765&lon=127.0267165&appid=baff8f3c6cbc28a4024e336599de28c4&lang=kr&units=metric");
			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			
			JSONArray ja = (JSONArray) jo.get("weather");
			JSONObject weather = (JSONObject) ja.get(0);
			JSONObject main = (JSONObject) jo.get("main");
			
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,hh");
			String now2 = sdf.format(now);
			
			bw.write(now2 + ",");
			bw.write(weather.get("description") + ",");
			bw.write(main.get("temp") + ",");
			bw.write(main.get("humidity") + "\r\n");
			bw.flush();
			
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
