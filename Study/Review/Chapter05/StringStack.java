package Chapter05;

import java.util.Scanner;

interface Stack{
	int length(); // ���� ���ÿ� ����� ���� ����
	int capacity(); // ������ ��ü ���� ������ ���� ����
	String pop(); // ������ ��(top)�� �Ǽ� ����
	boolean push(String val); // ������ ��(top)�� ����� �Ǽ� ����
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
			return "�������";
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
		
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		s = new StringStack(scanner.nextInt());
		
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String str = scanner.next();
			
			if(str.equals("�׸�"))
				break;
			
			boolean result = s.push(str);
			if(result==false)
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		for(int i = 0; i<s.length(); i++) {
			System.out.print(s.pop() + " ");
			System.out.print(i + " ");
		}
		scanner.close();
	}
}