package static_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("일반변수:" + c1.a);
		System.out.println("정적변수:" + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("일반변수:" + c2.a);
		System.out.println("정적변수:" + c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("일반변수:" + c3.a);
		System.out.println("정적변수:" + c3.b);
		
		/*
		 * static은 클래스 밖에 1개 생성됩니다.
		 * 객체생성 없이 클래스이름.변수명
		 * 으로 바로 사용할 수 있습니다.
		 */
		
		Count.b++; //4
		Count.b = 100;
		
		//System.out.println(Math.PI);
		
		
		
	}
}
