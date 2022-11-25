package com.soldesk.ho0628.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// 1. HTTP ��� �ɾ �ܼ� ���
// 2. JSON�Ľ� �ؼ� �ܼ� ���
// 3. 1 ~ 5�� ������ ���Ͽ�
// 4. �Ϸ�ġ
// 5. �Ѵ�ġ
// 6. �ϳ�ġ
public class UCMain4 {
	public static void main(String[] args) {
		HttpURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			String startEnd = null;
			String date = null;

			for (int m = 1; m < 13; m++) {
				for (int d = 1; d < 32; d++) {
					date = String.format("%d%02d%02d", 2015, m, d);

					for (int num = 1; num < 39002; num += 1000) {
						startEnd = String.format("%d/%d/", num, num + 999);

						FileOutputStream fos = new FileOutputStream("D:/ho/mise/bus.csv", true);
						OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
						bw = new BufferedWriter(osw);

						URL u = new URL(
								"http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/CardBusStatisticsServiceNew/"
										+ startEnd + date);
						huc = (HttpURLConnection) u.openConnection();
						InputStream is = huc.getInputStream();
						InputStreamReader isr = new InputStreamReader(is, "utf-8");

						// json �Ľ� ���� ���
						JSONParser jp = new JSONParser();
						// �Կ� ���� ������ - �����͸� ���� - �ν�
						JSONObject jo = (JSONObject) jp.parse(isr);
						// �� jo���� �� �Ķ� �κ� ã�Ƴ� ��
						JSONObject cbssn = (JSONObject) jo.get("CardBusStatisticsServiceNew");

						if (cbssn != null) {
							JSONArray r = (JSONArray) cbssn.get("row");
							JSONObject station = null;
							String when = null;
							for (int i = 0; i < r.size(); i++) {
								station = (JSONObject) r.get(i);
								when = station.get("USE_DT") + "";
								bw.write(when.substring(0, 4) + ",");
								bw.write(when.substring(4, 6) + ",");
								bw.write(when.substring(6, 8) + ",");

								bw.write(station.get("BUS_ROUTE_NM") + ",");
								bw.write(station.get("BUS_STA_NM") + ",");
								bw.write(station.get("RIDE_PASGR_NUM") + ",");
								bw.write(station.get("ALIGHT_PASGR_NUM") + "\r\n");
								bw.flush();
							}
						}
					}
					System.out.println(date);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		huc.disconnect();
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
