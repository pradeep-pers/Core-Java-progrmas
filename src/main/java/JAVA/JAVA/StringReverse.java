package JAVA.JAVA;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="WELCOME";
		String rev="";
		int n=str.length();
		System.out.println(" Print the Orginal String:"+str);
		System.out.println(" Print the Length of the String:"+n);
		
		
		for(int i=n-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
        
		System.out.println("-----------------------------");
		System.out.println(" Print the Reverss of the String :"+rev);
		
	}

}
