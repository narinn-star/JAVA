package Chapter04;

class StaticSample{
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public static void f() {
		m = 5;
	}
}

public class Ex {
	public static void main(String[] args) {
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.n = 5;
		s1.g();
		//System.out.println(s1.m); //20
		//System.out.println(s1.n); //5
		s1.m = 50; //static
		//System.out.println(s1.m); //50
		//System.out.println(s1.n); //5
		s2 = new StaticSample();
		s2.n = 8;
		s2.h();
		//System.out.println(s1.m); //30
		//System.out.println(s2.m); //30
		s2.f(); //static
		System.out.println(s1.m); //5
		//System.out.println(s2.m); //5
	}

}
