package Sep23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HundredDSAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		duplicateStrings("preetam");
//		anagrams("triangle", "integral");
//		System.out.println(reverseRecursion("preetam"));
//		permutation("1234");
//		reverseWordOfSentence("public static void main");
	

	}
	
	public static void removeDuplicate(String[] input)
	{
		Set<String> set= new HashSet<String>();
		for(int i=0;i<=input.length;i++)
		{
			set.add(input[i]);
		}
		
		Iterator itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void reverseWordOfSentence(String input)
	{
		String[] split= input.split(" ");
		for(int i=0;i<split.length;i++)
		{
			String temp="";
			for(int j=split[i].length()-1;j>=0;j--)
			{
				temp=temp+split[i].charAt(j);
			}
			split[i]=temp;
		}
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]+" ");
		}
	}
	
	public static void permutation(String input)
	{
		char[] charArray= input.toCharArray();
		int length=input.length();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<input.length();i++)
		{
			char[] tempArray= new char[length];
			String temp;
			for(int j=0;j<input.length();j++)
			{
				
				if(j==(length-1))
				{					
					tempArray[0]=input.charAt(j);
				}
				else
				{
					tempArray[j+1]=input.charAt(j);
				}
				
			}
			input=new String(tempArray);
			temp=new String(tempArray);
			list.add(temp);
			temp=null;
		}
		for (String string : list) {
			System.out.print(string+" ,");
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
