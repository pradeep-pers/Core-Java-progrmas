package JAVA.JAVA;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String str="aaaabbbbcccccddddffffggggjjjjj";
		char a[]=str.toCharArray();
		int k=a.length;
		
		for(int i=0; i<k; i++)
		{
			for(int j=i+1; j<k; j++)
			{
				if (a[i]==a[j])
				{
					System.out.println( "Duplicate founds are: " +a[j]);
				}
			}
		}
		
	}

}
