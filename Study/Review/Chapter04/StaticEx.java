package Chapter04;

class ArrayUtil{
	public static int[] a;
	public static int[] b;
	public static int [] concat(int[] a, int[] b) {
		
		/* �迭 a�� b�� ������ ���ο� �迭 ���� */
	}
	public static void print(int []a) {
		// �迭 a ���
	}
}

public class StaticEx {
	public static void main(String[] args) {
		int [] array1 = {1,5,7,9};
		int [] array2 = {3,6,-1,100,77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}