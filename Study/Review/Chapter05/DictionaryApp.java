package Chapter05;

abstract class PairMap{
	protected String keyArray[]; // key���� �����ϴ� �迭
	protected String valueArray[]; //value ���� �����ϴ� �迭
	abstract String get(String key); //key ���� ���� value ����. ������ null ����
	abstract void put(String key, String value); //key�� value�� ������ ����. ������ key�� ������ ���� value�� ����
	abstract String delete(String key); // key���� ���� ������(value�� �Բ�) ����. ������ value�� ����
	abstract int length(); // ���� ����� �������� ���� ����
}

class Dictionary extends PairMap{
	protected int cnt = 0;
	public Dictionary(int num) {
		keyArray = new String[num];
		valueArray = new String[num];
	}

	@Override
	String get(String key) {
		for (int i = 0; i<cnt; i++) {
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		int i;
		for(i = 0; i<cnt; i++) {
			keyArray[i] = key;
			valueArray[i] = value;
		}
		
		if (i == cnt) {
			
		}
	}

	@Override
	String delete(String key) {
		return null;
	}

	@Override
	int length() {
		return 0;
	}
}

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����"); // Ȳ���� ������ ����
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����")); // ������ ������ ����
	}
}