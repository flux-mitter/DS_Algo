package Sep23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Test1");
		map.put(2, "Test2");
		map.put(3, "Test3");
		map.put(4, "Test4");
		map.put(5, "Test5");
		
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry =(Map.Entry)itr.next();
			System.out.println(entry.getKey()+ " value "+ entry.getValue());
		}
		System.out.println();
		for(Map.Entry entry: map.entrySet())
		{
			System.out.println(entry.getKey()+ " value "+ entry.getValue());
		}

	}

}
