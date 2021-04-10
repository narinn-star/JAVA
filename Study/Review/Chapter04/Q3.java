package Chapter04;

class Song{
	private String title; //�뷡 ����
	private String artist; //����
	private int year; //�߸� ����
	private String country; //����
	
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
		System.out.println(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
	}
}

public class Q3 {

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "������");
		s.show();
	}

}
