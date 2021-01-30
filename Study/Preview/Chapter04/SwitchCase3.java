package chapter4;

public class SwitchCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floor = 4;
		String where;
		
		switch(floor) {
		case 1: where = "1Ãþ ¾à±¹";
		break;
		case 2: where = "2Ãþ Á¤Çü¿Ü°ú";
		break;
		case 3: where = "3Ãþ ÇÇºÎ°ú";
		break;
		case 4: where = "4Ãþ Ä¡°ú";
		break;
		case 5: where = "5Ãþ Çï½º Å¬·´";
		break;
		default:
			where = "5Ãþ °Ç¹°";
			break;
		}
		System.out.println(where + "ÀÔ´Ï´Ù.");
	}

}
