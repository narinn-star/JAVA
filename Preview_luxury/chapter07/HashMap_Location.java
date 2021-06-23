package chapter07;

import java.util.*;

class Location{
	private String city;
	private int longt;
	private int lat;
	Location(String city, int longt, int lat){
		this.city = city;
		this.longt = longt;
		this.lat = lat;
	}
	public String getCity() { return city; }
	public int getLongt() {return longt;}
	public int getLat() { return lat; }
}

public class HashMap_Location {
	public static void main(String[] args) {
		Location[] lc = new Location[4];
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Location> country = new HashMap<>();
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i = 0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			int longt = Integer.parseInt(st.nextToken().trim());
			int lat = Integer.parseInt(st.nextToken().trim());
			
			lc[i] = new Location(city, longt, lat);
			country.put(city, lc[i]);
		}
		
		Set<String> keys = country.keySet();
		Iterator<String> it = keys.iterator();
		
		System.out.println("=============================");
		while(it.hasNext()) {
			String city = it.next();
			Location l = country.get(city);
			System.out.println(l.getCity() + "\t" + l.getLongt() + "\t" + l.getLat());
		}
		
		System.out.println("=============================");
		while(true) {
			System.out.print("도시 이름 >> ");
			String c = scanner.next();
			if(c.equals("그만"))
				break;
			Location l = country.get(c);
			if(l == null)
				System.out.println(c + "는 없습니다.");
			else
				System.out.println(l.getCity() + "\t" + l.getLongt() + "\t" + l.getLat());
		}
		scanner.close();
	}
}