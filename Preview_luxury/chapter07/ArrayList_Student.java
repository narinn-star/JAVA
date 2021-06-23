package chapter07;

import java.util.*;

class Student1{
	private String name;
	private String major;
	private int number;
	private double score;
	
	Student1(String name, String major, int number, double score){
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

public class ArrayList_Student {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student1> list = new ArrayList<>();
		
		Student1[] lists = new Student1[4];
		System.out.println("�л� �̸�, �а�, �й�, ��������� �Է��ϼ���.");
		for(int i = 0; i<4; i++) {
			System.out.print(">> ");
			
			String line = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(line, ",");
			
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			int number = Integer.parseInt(st.nextToken().trim());
			double score = Double.parseDouble(st.nextToken().trim());
			
			lists[i] = new Student1(name, major, number, score);
			list.add(lists[i]);			
		}
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println("========================");
			Student1 s = list.get(i);
			System.out.println("�̸� : " + s.getName());
			System.out.println("�а� : " + s.getMajor());
			System.out.println("�й� : " + s.getNumber());
			System.out.println("������� : " + s.getScore());
		}
		
		System.out.println("========================");
		while(true) {
			System.out.print("�л� �̸� >> ");
			String sname = scanner.next();
			if(sname.equals("�׸�"))
				break;
			for(int i = 0; i<list.size(); i++) {
				Student1 s = list.get(i);
				if(sname.equals(s.getName())) {
					System.out.println(s.getName() + ", " + s.getMajor() + ", " + s.getNumber() + ", " + s.getScore());
				}
			}
		}
		scanner.close();
	}
}