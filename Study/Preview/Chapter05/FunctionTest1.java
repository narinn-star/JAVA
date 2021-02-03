package chapter5;

public class FunctionTest1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10, num2 = 20;
		
		int sum1 = add(num1,num2);
		int sum2 = sub(num1,num2);
		int sum3 = mul(num1,num2);
		double sum4 = div(num1,num2);
		
		System.out.println(num1 + " + " + num2 + " = " + sum1);
		System.out.println(num1 + " - " + num2 + " = " + sum2);
		System.out.println(num1 + " * " + num2 + " = " + sum3);
		System.out.println(num1 + " / " + num2 + " = " + sum4);
	}
	
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static double div(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}
	
}
