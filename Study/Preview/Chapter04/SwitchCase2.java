package chapter4;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.println("�ݸ޴�");
			break;
		case "Silver":
			System.out.println("���޴�");
			break;
		case "Bronze":
			System.out.println("���޴�");
			break;
			default:
				System.out.println("�޴� ����");
				break;
		}
	}

}
