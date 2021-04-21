package Chapter04;

class ArrayUtil {
	public static int[] a;
	public static int[] b;

	public static int[] concat(int[] a, int[] b) {
		int clen = a.length + b.length;
		int alen = a.length;
		int[] c = new int[clen];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[alen++] = b[i];
		}
		return c;
		/* 배열 a와 b를 연결한 새로운 배열 리턴 */
	}

	public static void print(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		// 배열 a 출력
	}
}

public class StaticEx {
	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}