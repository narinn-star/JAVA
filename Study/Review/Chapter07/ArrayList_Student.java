package Chapter07;

import java.util.*;

class Student{
	private String name;
	private String department;
	private String number;
	private double grade;
	public Student(String name, String department, String number, double grade) {
		this.name = name;
		this.department = department;
		this.number = number;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public String getDepart() {
		return department;
	}
	public String getNum() {
		return number;
	}
	public double getGrade() {
		return grade;
	}
	public void find(String name) {
		if(name.equals(this.name))
			System.out.println(this.name + ", " + this.department + ", " + this.number + ", " + this.grade);
	}
}

public class ArrayList_Student {
	public static void main(String[] args) {
		Student[] s = new Student[4];
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<Student>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i = 0; i<s.length; i++) {
			System.out.print(">> ");
			
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String number = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			s[i] = new Student(name, department, number, grade);
			student.add(s[i]);
		}
		
		for (int i = 0; i<student.size(); i++) {
			System.out.println("-----------------------------");
			Student a = student.get(i);
			System.out.println("이름 : " + a.getName());
			System.out.println("학과 : " + a.getDepart());
			System.out.println("학번 : " + a.getNum());
			System.out.println("학점 평균 : " + a.getGrade());
		}
		
		System.out.println("-----------------------------");
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.next();
			if (name.equals("그만")) {
				break;
			}
			for(int i = 0; i<student.size(); i++) {
				Student a = student.get(i);
				a.find(name);
			}
		}
		scanner.close();
	}
}