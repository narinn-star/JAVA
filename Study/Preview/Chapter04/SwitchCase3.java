package chapter4;

public class SwitchCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floor = 4;
		String where;
		
		switch(floor) {
		case 1: where = "1�� �౹";
		break;
		case 2: where = "2�� �����ܰ�";
		break;
		case 3: where = "3�� �Ǻΰ�";
		break;
		case 4: where = "4�� ġ��";
		break;
		case 5: where = "5�� �ｺ Ŭ��";
		break;
		default:
			where = "5�� �ǹ�";
			break;
		}
		System.out.println(where + "�Դϴ�.");
	}

}
