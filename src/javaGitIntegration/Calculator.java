package javaGitIntegration;

public class Calculator {
	static int  a;



	public Calculator() 
	{
		

	}
	
	public static void division()
	{
		int q = 0;
		int x=12,y=3;
		q=x/y;
		System.out.println(q);
	}

	
	
		
		// TODO Auto-generated constructor stub
	public static int multiply(int a,int b)
	{
		int mul=a*b;
		return mul;



	}

	public static int add(int b,int c) {
		a=b+c;
		return a;	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
  System.out.println(multiply(3,6));

		System.out.println("sum is : " +add(5,10));
		division();


	}
	

}
