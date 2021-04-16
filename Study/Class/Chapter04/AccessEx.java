package Chapter04;

class Sample{
	public int a;
	private int b;
	int c; // 디폴트 접근 지정
}

public class AccessEx {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10; b는 private의 멤버로, Sample 클래스에서만 사용 가능하다.
		sample.c = 10;
	}

}
