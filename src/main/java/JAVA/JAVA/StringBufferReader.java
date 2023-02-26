package JAVA.JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringBufferReader {

	public static void main(String[] args) throws IOException {
		
		// Create a new String buffer object
		StringBuffer sb=new StringBuffer();
		
		// to accepct data from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Accecpt Surname
		System.out.print("Enter Suranme: ");
		String sur=br.readLine();
	    // Enter middle name
		System.out.print("Enter Midlle: ");
		String mid=br.readLine();
		
		//Enter firstName
		
		System.out.print("Enter FIRSTNAME: ");
		String fis=br.readLine();
		
		//Append sur to sb
		
		sb.append(sur);
		
		//Append  first to sur
		
		sb.append(fis);
		
		//Append  Middle Name
		sb.append(mid);
		
		//Display the name
		
		System.out.println(" Name of the Person:"+ sb);
		

	}

}
