package JAVA.JAVA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCount {

	public static void main(String[] args) {
		
		String str="ABCDDFFFFGGGG";
		
		 char[] a= str.toCharArray();
		 
		 Map<Character,Integer> CountDuplicate=new HashMap<Character, Integer>();
		 
		 for(char c:a)
		 {
			 if(CountDuplicate.containsKey(c))
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         				 CountDuplicate.put(c, CountDuplicate.get(c)+1);
			 else
			 {
				 CountDuplicate.put(c, 1);
			 }
		 }
		
		 System.out.println(" Print the Duplicate Values----");
		for(Entry<Character, Integer> entry:CountDuplicate.entrySet())
		{
			if(entry.getValue()>1)
				//System.out.println(" Print the Duplicate Values----");
				System.out.println(entry.getKey() + ":" +entry.getValue());
		}
		 
	

	
}
}

