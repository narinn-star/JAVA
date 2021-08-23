package chapter13;

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard(); //������ ���� ������ ����
		
		//������ ���� �� �������� �ּҸ� �˷��ش�. �� ������� �����ǿ� ���ÿ� �����Ѵ�.
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		
		//�� �����带 ����
		th1.start();
		th2.start();
	}
}

//���� �������� �������� �ùķ��̼��ϴ� Ŭ����
//�� StudentThread �����忡 ���� ���� ���ٵ�
class SharedBoard {
	private int sum = 0; //������ ��
	synchronized public void add() {
		int n = sum;
		Thread.yield(); //���� ���� ���� ������ �纸
		n += 10;
		sum = n; 
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	public int getSum() {
		return sum;
	}
}

//�л��� �ùķ��̼��ϴ� ������ Ŭ����
class StudentThread extends Thread {
	private SharedBoard board;
	
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	//�������� 10�� �����Ͽ� ī����
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			board.add();
		}
	}
}