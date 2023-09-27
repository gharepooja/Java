package HashMap;

import java.util.HashMap;
//import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _2_HashMap {
	
	public static void main(String[] args) {
		
	   Map<String,Integer> marks = new HashMap<String,Integer>();
	   
	   
	
//		HashMap<String,Integer> marks = new HashMap<String,Integer>();
		
		marks.put("Math", 100);
		marks.put("Reasoning", 150);
		marks.put("English", 80);
		
		
		System.out.println(marks.size());
	
		for(Entry<String, Integer> e : marks.entrySet())
		{
			System.out.println(e.getKey()+" , "+e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
