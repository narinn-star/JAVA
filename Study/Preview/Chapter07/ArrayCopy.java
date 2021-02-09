package chapter7;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = { 1, 2, 3, 4, 5 };

		System.arraycopy(array1, 0, array2, 1, 4); // (복사할 배열, 복사할 첫 위치, 대상 배열, 붙여넣을 첫 위치, 복사할 요소 개수)
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

	}

}
