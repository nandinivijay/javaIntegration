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
	public static int subtraction(int a,int b) {
		int sub;
		return  sub=a-b;
  

	}

	public static int add(int b,int c) {
		a=b+c;
		return a;	}
	

	public static int add3(int b,int c,int d) {
		a=b+c+d;
		return a;	}

	
	public static int product3(int a,int b,int c)
	{
	return a*b*c;	
	
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
System.out.println(multiply(3,6));
System.out.println(subtraction(10,20));
System.out.println("sum is : " +add(5,10));
System.out.println("sum is : " +add3(5,10,5));
System.out.println("product  is : " +product3(5,10,5));
division();
	}
	

	

}
