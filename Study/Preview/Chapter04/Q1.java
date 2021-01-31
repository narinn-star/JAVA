package chapter4;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		int sum = 0;
		char operator = '+';
		
		if(operator == '+')
			sum = num1 + num2;
		else if(operator == '-')
			sum = num1 - num2;
		else if(operator == '*')
			sum = num1 * num2;
		else if(operator == '/')
			sum = num1 * num2;
		else
			System.out.println("올바르지 않은 operator");
		
		System.out.println("if문 : " + sum);
		
		switch(operator) {
		case '+' : sum = num1 + num2;
		break;
		case '-' : sum = num1 - num2;
		break;
		case '*' : sum = num1 * num2;
		break;
		case '/' : sum = num1 / num2;
		break;
		default :
			System.out.println("올바르지 않은 operator");
		}
		
		System.out.println("switch문 : " + sum);
	}

}
