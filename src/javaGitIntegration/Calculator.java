package javaGitIntegration;

public class Calculator {
	static int  a;
	public Calculator() {
		
		
	}
	
	public static int add(int b,int c) {
		a=b+c;
		return a;
	}

	public static void main(String[] args) {
		System.out.println("sum is : " +add(5,10));

	}

}
