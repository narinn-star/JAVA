package chapter6;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 30000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2硲識");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi kakaoTaxi = new Taxi("朝朝神");
		studentEdward.takeTaxi(kakaoTaxi);
		studentEdward.showInfo();
		kakaoTaxi.showInfo();
	}
}
