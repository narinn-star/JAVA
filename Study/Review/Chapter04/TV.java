package Chapter04;

public class TV {
	
	String brand;
	int year;
	int inch;
	
	TV(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(brand + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}

	public static void main(String[] args) {
		 TV myTV = new TV("LG", 2017, 32); //LG���� ���� 2017�� 32��ġ 
		 myTV.show();
	}

}
