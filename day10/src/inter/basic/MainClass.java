package inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체생성 불가.
//		Inter1 i1 = new Inter1();
		
		Basic b = new Basic();
		b.method01();
		b.method02();
		b.method03();
		
		System.out.println("------------------------");
		//인터페이스도 타입이 될 수 있습니다.
		Inter1 i1 = b; //Inter1 i1 = new Basic();
		
		i1.method01();
//		i1.method02();
//		i1.method03();
		
		System.out.println("------------------------");

		Inter2 i2 = b;
//		i2.method01();
		i2.method02();
//		i2.method03();
		
		System.out.println("------------------------");
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(b);
		//인터페이스도 상호 형변환이 가능합니다.
		Inter1 ii = (Inter1)i2;
		Basic bb = (Basic)i2;
		
		
		
	}
}
