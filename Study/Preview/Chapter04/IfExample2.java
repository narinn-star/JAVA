package chapter4;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 75;
		int charge;
		if(age < 8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ�");
		}
		else if (age <14) {
			charge = 2000;
			System.out.println("�ʵ��л�");
		}
		else if( age <20) {
			charge = 2500;
			System.out.println("��,����л�");
		}
		else if (age < 60){
			charge = 3000;
			System.out.println("�Ϲ���");
		}
		else {
			charge = 0;
			System.out.println("��ο��");
		}
		System.out.println("������ " + charge + "��");
	}

}
