package JAVA.JAVA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateUsingMAP {

	public static void main(String[] args) {
		
		
		String str="ABBCCDDA";
		char[] a=str.toCharArray();
		Map<Character, Integer> count=new HashMap<Character,Integer>();
		
		for(char c:a)
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c));
			}
		}

		for(Entry<Character,Integer>entry:count.entrySet())
		{
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
			
		}


	}

}
