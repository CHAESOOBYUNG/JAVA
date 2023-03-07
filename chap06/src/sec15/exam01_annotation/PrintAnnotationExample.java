package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			// System.out.println(method.getName());
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "] ");
				
				//구분선 출력
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());	
				}
				System.out.println();
				
				
				try {
					//메소드 호출
					method.invoke(new Service());
					/* Service service = new Service();
					service.method1(); -> method.invoke(new Service());*/
				} catch (Exception e) {
					System.out.println();
				}
				
				
				/* System.out.println(method.getName() + ": ");
				System.out.println("value= "+ printAnnotation.value());
				System.out.println("number= "+ printAnnotation.number());
				System.out.println(); */ 
						
				// System.out.println(method.getName() + "에는 적용되어 있음");
			} /* else {
				System.out.println(method.getName() + "에는 적용되어 있지 않음");
			} */
		}
		
	}
	
}
