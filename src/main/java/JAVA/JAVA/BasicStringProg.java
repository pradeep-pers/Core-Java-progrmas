package JAVA.JAVA;

public class BasicStringProg {

	public static void main(String[] args) {
		
		String str1="A BOOK ON JAVA";
		
		String str2=" I like it";
		char str3[]= { 'D', 'r','e','a','m'};
		
		String str4=new String(str3);
		
		// display all the 3 strings
		
		System.out.println("-----Print the  Strings-------");
		
		System.out.println(" String1:" +str1);
		System.out.println(" String2:" +str2);
		System.out.println(" String3:" +str4);
		
		//System.out.println(" String:" +str3);  //Output will  String:[C@7852e922
		
		
		//  Find the Length of the  Strings
		
		System.out.println(" -----Length of the Strings-------");
		
		System.out.println( "Length of str1:" +str1.length());
		System.out.println( "Length of str2:" +str2.length());
		System.out.println( "Length of str4:" +str4.length());
		
		
		//  Concatenate two Strings
		
		System.out.println("----Concatenate two Strings-------"); 
		
		System.out.println(" STR1 and STR2 Joined= "+ str1.concat(str2));
		
		// Test if string str1 starts with A
		
		System.out.println("------  Strats With-----------");
		
		boolean x=str1.startsWith("A");
		if(x)
		{
			System.out.println(" String Str1 Starts with A:");
		}
		else
		{
			System.out.println(" String Str1  not Starts with A:");
		}
		
		//  Convert to Uppercase and  Lowercase
		
		System.out.println("----Convert to Uppercase and  Lowercase------");
		
		System.out.println(" Str1 to Uppercase:"+str1.toLowerCase());
		System.out.println("Str2 to LowerCase: "+str2.toUpperCase());
		System.out.println("Str4 to UPPERCase: "+str4.toUpperCase());
		
	}

}
