package com.soldesk.ho0701.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

import com.soldesk.ho0701.kakao.KakaoChat;

public class UCMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("D:/ho/mise/kakaoTalkChats.txt");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);
			
			
			HashMap<String, Integer> chCount = new HashMap<String, Integer>();
			
			String line = null;
			StringTokenizer st = null;
			String word = null;
			int sum = 0;
			while ((line = br.readLine()) != null) {
				if (line.contains(" : ")) {
					line = line.split(" : ")[1];
					st = new StringTokenizer(line, " ");
					while (st.hasMoreTokens()) {
						word = st.nextToken();
						if(chCount.containsKey(word)) {
							sum = chCount.get(word);
							chCount.put(word, sum + 1);
						}else {
							chCount.put(word, 1);
						}
					}
				}
			}
			Set<String> words = chCount.keySet();
			ArrayList<String> words2 = new ArrayList<String>(words);
			ArrayList<KakaoChat> kkc = new ArrayList<KakaoChat>();
			for (String w : words2) {
				kkc.add(new KakaoChat(w, chCount.get(w))); 
			}
			
			kkc.sort(new Comparator<KakaoChat>() {

				@Override
				public int compare(KakaoChat o1, KakaoChat o2) {
					Integer o1Count = o1.getCount();
					Integer o2Count = o2.getCount();
					return o2Count.compareTo(o1Count);
				}
			});
			
			for (KakaoChat kc : kkc) {
				if (kc.getCount() > 2) {
					kc.show();
				}
			}
			
			
			
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
