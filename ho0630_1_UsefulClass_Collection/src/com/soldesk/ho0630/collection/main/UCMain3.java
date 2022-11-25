package com.soldesk.ho0630.collection.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

import com.soldesk.ho0630.collection.split.Split;

public class UCMain3 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("D:/ho/mise/weather2.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			String line = null;
			Split data = null;
//			while((line = br.readLine()) != null) {
//				data = new Split(line);
//				data.show();
//			}
			
			ArrayList<Split> weathers = new ArrayList<Split>();
			while ((line = br.readLine()) != null) {
				weathers.add(new Split(line));
			}
			int sum = 0;
			
			for (int i = 0; i < weathers.size(); i++) {
				sum += weathers.get(i).getHumidity();
			}
			System.out.println(sum / (double) weathers.size());
			
			weathers.sort(new Comparator<Split>() {

				@Override
				public int compare(Split o1, Split o2) {
					Double n1 = o1.getTemp();
					Double n2 = o2.getTemp();
					return n2.compareTo(n1);
				}
			});
			
			weathers.get(0).show();
			
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
