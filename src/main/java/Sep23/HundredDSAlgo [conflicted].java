package Sep23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HundredDSAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// duplicateStrings("preetam");
		// anagrams("triangle", "integral");
		System.out.println(reverseRecursion("preetam"));

	}
	public static void purmutation(String input)
	{
		char[] charArray= input.toCharArray();
		int length=input.length();
		ArrayList<String> list = new ArrayList<String>();
		list.add(input);
		for(int i=0;i<input.length();i++)
		{
			char[] tempArray= new char[length-1];
			if(i==(length-1))
			{
				tempArray[0]=charArray[0];
			}
		}
	}
	
	
	
	public static String reverseRecursion(String input) {
		// base case to handle one char string and empty string
		if (input.length() < 2) {
			return input;
		}

		return reverseRecursion(input.substring(1)) + input.charAt(0);

	}
	
	

	public static void duplicateStrings(String input) {
		Map<Character, Integer> map = characterCount(input);

		// map.forEach((k,v)-> System.out.println("Key = "+k+" and value = "+v));
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " is duplicate with " + entry.getValue() + " values");

			}
		}
	}

	public static void anagrams(String input1, String input2) {

		if (input1.length() != input2.length()) {
			System.out.println("Not Anagrams");
		}

		Map<Character, Integer> map1 = characterCount(input1);
		Map<Character, Integer> map2 = characterCount(input2);
		boolean flag = true;
		for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
			if (entry.getValue() != map2.get(entry.getKey())) {
				// System.out.println(entry.getKey() + " is duplicate with " + entry.getValue()
				// + " values");
				flag = false;

			}

		}
		if (flag) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}

	}

	public static Map<Character, Integer> characterCount(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);

			} else {
				map.put(input.charAt(i), 1);
			}
		}
		return map;
	}

}
