package Chapter05;

import java.util.Scanner;

interface Stack{
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱(top)에 실수 저장
	boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}

public class StringStack implements Stack{
	private String arr[];
	private int top;
	
	public StringStack(int num) {
		arr = new String[num];
		top = 0;
	}
	public int length() {
		return top;
	}
	@Override
	public int capacity() {
		return arr.length;
	}
	@Override
	public String pop() {
		if (top < 0)
			return "비어있음";
		else {
			String str = arr[top-1];
			top--;
			return str;
		}
	}
	@Override
	public boolean push(String val) {
		if(top == arr.length)
			return false;
		else {
			arr[top] = val;
			top++;
			return true;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringStack s;
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		s = new StringStack(scanner.nextInt());
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = scanner.next();
			
			if(str.equals("그만"))
				break;
			
			boolean result = s.push(str);
			if(result==false)
				System.out.println("스택이 꽉 차서 푸시 불가!");
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int i = 0; i<s.length(); i++) {
			System.out.print(s.pop() + " ");
			System.out.print(i + " ");
		}
		scanner.close();
	}
}