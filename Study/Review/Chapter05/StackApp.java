package Chapter05;

import java.util.Scanner;

interface Stack{
	int length(); // ���� ���ÿ� ����� ���� ����
	int capacity(); // ������ ��ü ���� ������ ���� ����
	String pop(); // ������ ��(top)�� ����� �Ǽ� ����
	boolean push(String val); // ������ ��(top)�� �Ǽ� ���� 
}

class StringStack implements Stack{
	private int top;
	private int size;
	private String[] stack;
	
	StringStack(int size){
		this.size = size;
		top = this.size;
		stack = new String[this.size];
	}
	
	@Override
	public int length() {
		return size - top;
	}

	@Override
	public int capacity() {		
		return top;
	}

	@Override 
	public String pop() {
		int tmp = top;
		top++;
		return stack[tmp];
	}

	@Override
	public boolean push(String val) {
		if(top > 0) {
			stack[top -1] = val;
			top--;
			return true;
		}
		else {
			return false;			
		}
	}
}

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = scanner.nextInt();
		
		StringStack s = new StringStack(size);
		
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String val = scanner.next();
			
			if(val.equals("�׸�")) {
				int len = s.length();
				if(len == 0)
					System.out.println("����� ���ڿ��� �����ϴ�.");
				else {
					System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
					for(int i = 0; i<len; i++) {
						System.out.print(s.pop() + " ");
					}
				}
				break;
			}
			else {
				if(!s.push(val))
					System.out.println("������ �� ���� Ǫ�� �Ұ� !");
			}
		}
		scanner.close();
	}

}
