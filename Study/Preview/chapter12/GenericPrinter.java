package chapter12;

public class GenericPrinter<T> {
private T material; //T자료형으로 선언한 변수


	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}
