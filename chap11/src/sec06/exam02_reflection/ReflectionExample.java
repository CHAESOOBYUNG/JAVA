package sec06.exam02_reflection;

import java.lang.reflect.*;

public class ReflectionExample {
	public static void main(String[] args) throws Exception { //JVM에서 예외처리하도록 떠넘김
			Class class1 = Class.forName("sec06.exam02_reflection.Car");
			
			System.out.println("[클래스 이름]");
			System.out.println(class1.getName());
			System.out.println();
	
			System.out.println("[생성자 정보]");
			//생성자 이름과 매개 변수 정보를 출력
			Constructor[] constructors = class1.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				System.out.print(constructor.getName() + "(");
				Class[] parameters = constructor.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
			System.out.println();
			
			System.out.println("[필드 정보]");
			//필드 타입과 필드 이름을 출력
			Field[] fields = class1.getDeclaredFields();
			for(Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
			System.out.println();
			
			System.out.println("[메소드 정보]");
			//메소드 이름과 매개 변수를 출력
			Method[] methods = class1.getDeclaredMethods();
			for(Method method : methods) {
				System.out.print(method.getReturnType().getSimpleName() + " ");
				System.out.print(method.getName() + "("); // "(" - Car 클래스의 '('를 의미  
				Class[] parameters = method.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
	}

	private static void printParameters(Class[] parameters) {
		//매개 변수 정보를 출력하는 공통 코드
		for(int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i < (parameters.length-1)) {System.out.print(",");}
		} 
	}
}
