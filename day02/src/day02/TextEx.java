package day02;

public class TextEx {

	public static void main(String[] args) {
		
		//단일문자 저장하는 char
		char c1 = 'A';
		char c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
		
		//전세계 문자를 표현하는 유니코드
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00'; //유니코드문자 저장		
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println(c3 + " " + c4 + " " + c5);
		
		System.out.println("--------------------------------");
		
		String s1 = "hello";
		String s2 = " world";
		String s3 = " java";
		
		System.out.println(s1 + s2 + s3);
		System.out.println("문자열의 길이:" +  s1.length() );
		
		
		//문자열과 다른 데이터타입의 연산
		System.out.println(100 + 200);
		System.out.println("100" + 200);
		System.out.println(100 + 200 + "world");
		System.out.println("world" + 100 + 200);
		
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10);
		
		
	}
}
