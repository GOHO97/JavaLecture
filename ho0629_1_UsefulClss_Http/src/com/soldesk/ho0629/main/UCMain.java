package com.soldesk.ho0629.main;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UCMain {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		Scanner k = new Scanner(System.in);
		System.out.print("뭐 먹을건데 : ");
		String keyword = k.next();

		try {
			keyword = URLEncoder.encode(keyword, "utf-8");
			String s = "https://dapi.kakao.com/v2/local/search/keyword.json?x=127.0267165&y=37.5053765&radius=2000&query="
					+ keyword;
			URL u = new URL(s);
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK f97c35a2dec2c919adebacba62e5bae2");
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(isr);
			JSONArray doc = (JSONArray) jo.get("documents");
			JSONObject sickdang = null;
			
			for (int i = 0; i < doc.size(); i++) {
				sickdang = (JSONObject) doc.get(i); // 내가 쓴 반복문의 값을 저장해주는 역할
				System.out.println(sickdang.get("address_name") + "");
				System.out.println(sickdang.get("place_name") + "");
				System.out.println(sickdang.get("phone") + "");
				
			}
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		k.close();
		huc.disconnect();
	}
}
