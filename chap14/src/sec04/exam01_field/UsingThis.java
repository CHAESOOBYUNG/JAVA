package sec04.exam01_field;

public class UsingThis {
	public int outterField = 10;
	
	class Inner { 
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface fi = () -> {
				//outterField
				System.out.println("outterField: " + outterField);
				System.out.println("outterField: " + UsingThis.this.outterField + "\n"); 
				//바깥 객체의 참조 얻기 -> 클래스명.this 사용
				
				//innerField
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
				//람다식 내부 this -> inner 객체 참조
			};
			fi.method();
		}
	}
}
