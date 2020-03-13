package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PATB1029 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String before = br.readLine();
		String after = br.readLine();
		br.close();
		//a-z：97-122，A-Z：65-90
		LinkedHashMap<Object,Integer>  map1= new LinkedHashMap<Object,Integer>();
		for(int i=0;i<before.length();i++) {
			if(!map1.containsKey(Character.toUpperCase(before.charAt(i)))) {
				map1.put(Character.toUpperCase(before.charAt(i)), i);
			}
		}
		LinkedHashMap<Object,Integer>  map2= new LinkedHashMap<Object,Integer>();
		for(int i=0;i<after.length();i++) {
			if(!map2.containsKey(Character.toUpperCase(after.charAt(i)))) {
				map2.put(Character.toUpperCase(after.charAt(i)), i);
			}
		}
		Iterator<Entry<Object, Integer>> it = map1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Integer> entry = (Map.Entry<Object, Integer>) it.next();
            //System.out.println("key:" + entry.getKey() + "   value:" + entry.getValue());
            if(!map2.containsKey(entry.getKey())) {
            	System.out.print(entry.getKey());
            }
        }

		
	}

}
