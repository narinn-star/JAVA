package chapter5;

public class Person3 {
	String name;
	float height;
	float weight;

	
	public Person3(String pname) {	
		name = pname;
	}
	
	public Person3() {} //: 디폴트 생성자 - 매개변수가 없으며 구현 코드도 없음.				
	//			   					  - 이처럼 직접 작성하지 않아도 자동으로 만들어짐.
	
	public Person3(String pname, float h, float w) {
		name = pname;
		height = h;
		weight = w;
	}
						
}
