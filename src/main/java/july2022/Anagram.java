package july2022;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "HEART";
		String s1 = "EARTH";
		
		Map<Character,Integer> map1=mapr(s);
		Map<Character,Integer> map2=mapr(s1);
		System.out.println(map1.equals(map2));
		
		//Set<Entry<Character, Integer>> itr = map1.entrySet();
		
		for (Character key : map1.keySet()) {
				System.out.println(key + ":" + map1.get(key));
		}
		
		
		
		

	}
	public static Map<Character,Integer> mapr(String s)
	{
		Map<Character,Integer> map = new TreeMap();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		return map;
		
	}

}
