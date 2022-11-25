package com.soldesk.ho0630.collection.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;

import com.soldesk.ho0630.collection.subway.Subway;

public class UCMain10 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("D:/ho/mise/subway.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			
			String line = null;
			HashMap<String, Long> subwayInfo = new HashMap<String, Long>();
			Subway ssd = null;
			long sum = 0;
			while ((line = br.readLine()) != null) {
				ssd = new Subway(line);
				sum = (long) (ssd.getRider() + ssd.getUnrider());
				
				if(subwayInfo.containsKey(ssd.getLineNum())) {
					sum += subwayInfo.get(ssd.getLineNum());
					subwayInfo.put(ssd.getLineNum(), sum);
				} else {
					subwayInfo.put(ssd.getLineNum(), sum);
				}
			}
			Set<String> no = subwayInfo.keySet();
			ArrayList<String> no2 = new ArrayList<String>(no);
			no2.sort(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					
					return o1.compareTo(o2);
				}
			});
			for (String s : no2) {
				System.out.printf("%s : %d\n", s, subwayInfo.get(s));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
