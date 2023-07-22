package com.drucare;

import java.util.*;
import java.util.List;
import java.util.Map.Entry;

public class UniqueData {

	public static void main(String[] args) {
          List<String> nameslist= Arrays.asList("Sam","Peter","ballon","Sam");
          
          HashSet<String> uniquelist= new HashSet <>(nameslist);
          System.out.println(uniquelist);

          
          
//          Map<String,Integer>map= new HashMap<>();
//          
//          for(String words:uniquelist)
//          {
//        	  map.put(words,1);
//          }
//          
//          Set<Entry<String, Integer>> map1= map.entrySet();
//          for(Set<Entry<String, Integer>> words:map1)
//          {
//        	  System.out.println(words.);
//          }
          
          

	}

}
