package JAVA.JAVA;

public class Calc implements Math {
	int a;
	int b;
	
	public Calc(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {
		Calc c=new Calc(20, 10);
		c.add(); 
		c.sub();
		c.mul();
		c.div();

	}

	public void add() {
		
		int sum=a+b;
		System.out.println("Print the sum:"+sum);
		
	}

	public void sub() {
		int sub=a-b;
		System.out.println("Print the SUB:"+sub);
		
		
	}

	public void mul() {
		int mul=a*b;
		System.out.println("Print the MUL:"+mul);
		
		
	}

	public void div() {
		int div=a/b;
		System.out.println("Print the DIV:"+div);
		
		
	}

}
