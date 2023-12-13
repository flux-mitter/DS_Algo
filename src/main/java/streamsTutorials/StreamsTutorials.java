package streamsTutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsTutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arr = new ArrayList<String>();
		arr.add("abc");
		arr.add("cda");
		arr.add("aab");
		arr.add("xyz");

//		arr.forEach(ar -> {
//			System.out.println(ar);
//		});
		
		//List<String> str=arr.stream().filter(ar-> ar.contains("a")).collect(Collectors.toList());
		List<String> str = arr.stream().filter(sub->sub.contains("a")).collect(Collectors.toList());
		str.forEach( st -> 
		{System.out.println(st);});
	}

}
