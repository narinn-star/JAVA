package Chapter04;

class Song{
	private String title; //노래 제목
	private String artist; //가수
	private int year; //발매 연도
	private String country; //국적
	
	Song(){
		this("title", "artist", 0000, "country");
	}
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

public class Q3 {

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s.show();
	}

}
