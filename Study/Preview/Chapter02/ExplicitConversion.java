package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // iNum3 = 1 + 0 => 1
		int iNum4 = (int)(dNum1 + fNum2); // iNum4 = 1.2 + 0.9 => (int)2.1 => 2
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
