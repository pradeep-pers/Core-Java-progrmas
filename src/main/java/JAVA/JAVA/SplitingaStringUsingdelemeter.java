package JAVA.JAVA;

public class SplitingaStringUsingdelemeter {

	public static void main(String[] args) {
		
		
		String str="Hello this isbookonjava";
		
		// Declare a String Type array to store pieces
		
		String s[];
		
		// Split the  String where spaces are found
		
		s=str.split(" ");
		
		//display the pieces from s
		
		for(int i=0; i<s.length; i++)       
		{
			System.out.println(" Print the Pieces where spaces are found:" + s[i]);
		}

	}

}
