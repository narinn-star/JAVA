package Chapter04;

class Sample{
	public int a;
	private int b;
	int c; // ����Ʈ ���� ����
}

public class AccessEx {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10; b�� private�� �����, Sample Ŭ���������� ��� �����ϴ�.
		sample.c = 10;
	}

}
