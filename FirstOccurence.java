package com.drucare;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstOccurence {

	public static void main(String[] args) {

		String str = "hemanath";
		 char le []=str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(Character chlet:le)
		{
			if(map.containsKey(chlet))
			{
				map.put(chlet, map.get(chlet)+1);
			}else
			{
				map.put(chlet, 1);
			}
		}
			
		
		
		for(Entry<Character, Integer> ch:map.entrySet())
		{
			System.out.println(ch.getKey()+" "+ch.getValue());
		}
//		for (Entry<Character, Integer> ch : map.entrySet()) {
//			System.out.println(ch.getKey() + " " + ch.getValue());
//		}

	}

//	public static Map<Character, Integer> charCount(String sentence) {
//
//		Map<Character, Integer> chmap = new HashMap<>();
//		for (Character ch : a) {
//			if (chmap.containsKey(ch)) {
//				chmap.put(ch,chmap.get(ch)+1);
//			} else {
//				chmap.put(ch, 1);
//			}
//		}
//
//		return chmap;
//	}

}
