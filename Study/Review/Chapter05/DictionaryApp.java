package Chapter05;

abstract class PairMap{
	protected String keyArray[]; // key들을 저장하는 배열
	protected String valueArray[]; //value 들을 저장하는 배열
	abstract String get(String key); //key 값을 가진 value 리턴. 없으면 null 리턴
	abstract void put(String key, String value); //key와 value를 싸으로 저장. 기존에 key가 있으면 값을 value로 수정
	abstract String delete(String key); // key값을 가진 아이템(value와 함께) 삭제. 삭제된 value값 리턴
	abstract int length(); // 현재 저장된 아이템의 개수 리턴
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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태"); // 황기태 아이템 삭제
		System.out.println("황기태의 값은 " + dic.get("황기태")); // 삭제된 아이템 접근
	}
}