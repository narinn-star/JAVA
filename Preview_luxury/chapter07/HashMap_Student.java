package chapter07;

import java.util.*;

class Student2{
	private String name;
	private String major;
	private int number;
	private double score;
	Student2(String name, String major, int number, double score){
		this.name = name;
		this.major = major;
		this.number = number;
		this.score = score;
	}
	public String getName() { return name; }
	public String getMajor() { return major; }
	public int getNumber() { return number; }
	public double getScore() { return score; }
}

public class HashMap_Student {
	public static void main(String[] args) {
		Student2[] student = new Student2[4];
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student2> list = new HashMap<>(); 
		
		System.out.println("학생 이름, 학과 ,학번, 학점평균 입력하세요.");
		for(int i = 0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			int number = Integer.parseInt(st.nextToken().trim());
			double score = Double.parseDouble(st.nextToken().trim());
			
			student[i] = new Student2(name, major, number, score);
			list.put(name, student[i]);
		}
		
		Set<String> keys = list.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("=========================");
			Student2 s = list.get(name);
			System.out.println("이름 : " + s.getName());
			System.out.println("학과 : " + s.getMajor());
			System.out.println("학번 : " + s.getNumber());
			System.out.println("학점평균 : " + s.getScore());
		}
		
		System.out.println("========================");
		while(true) {
			System.out.print("학생 이름 >> ");
			String sname = scanner.next();
			if(sname.equals("그만"))
				break;
			Student2 s = list.get(sname);
			if(sname.equals(s.getName())) {
				System.out.println(s.getName() + ", " + s.getMajor() + ", " + s.getNumber() + ", " + s.getScore());
			}
		}
		scanner.close();
	}
}