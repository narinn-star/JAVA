package Chapter05;

public class IPTV extends ColorTV{
	private String ip;
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	@Override
	public void printProperty() {
		System.out.println("���� IPTV�� " + ip + "�ּ��� " + getSize() + "��ġ " + getColor() + "�÷�");
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}
