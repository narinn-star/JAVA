package chapter10;

public interface Queue {
	void enQueue(String title); //배열 맨 마지막에 추가
	String deQueue(); // 배열 맨 처음 항목 반환
	int getSize(); // 현제 Queue에 있는 개수 반환
}
