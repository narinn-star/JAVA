package chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Class perClass = Class.forName("java.lang.String");
		
		Constructor[] cons = perClass.getConstructors();
		for (Constructor c: cons) {
			System.out.println(c);
		}
		System.out.println();
		
		Field[] fields = perClass.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		System.out.println();
		
		Method[] methods = perClass.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
			
	}

}
