package com.soldesk.ho0630.collection.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;

import com.soldesk.ho0630.collection.subway.Subway;

public class UCMain4 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("D:/ho/mise/subway.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			
			ArrayList<Subway> subways = new ArrayList<Subway>();
			String line = null;
			while((line = br.readLine()) != null) {
				subways.add(new Subway(line));
			}
				
			
			
			subways.sort(new Comparator<Subway>() {

				@Override
				public int compare(Subway o1, Subway o2) {
					Double r1 = o1.getRider() + o1.getUnrider();
					Double r2 = o2.getRider() + o2.getUnrider();
					return r2.compareTo(r1);
				}
				
			});
			subways.get(0).print();
			
			long rideSum = 0;
			long unrideSum = 0;
			for (int i = 0; i < subways.size(); i++) {
				rideSum += subways.get(i).getRider();
				unrideSum += subways.get(i).getUnrider();
			}
			DecimalFormat df = new DecimalFormat("#,###");
			System.out.println(df.format(rideSum));
			System.out.println(df.format(unrideSum));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
