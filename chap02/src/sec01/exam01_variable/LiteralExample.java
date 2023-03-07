package sec01.exam01_variable;

public class LiteralExample {
	public static void main(String[] args) {
		//정수 리터럴
		int var1 = 10; //10진수
		System.out.println(var1);
		
		int var2 = 010; //8진수
		System.out.println(var2);
		
		int var3 = 0x10; //16진수
		System.out.println(var3);
		
		//실수 리터럴
		double var4 = 0.25; //실수
		System.out.println(var4);
		
		double var5 = 2E5; //가수와 지수
		System.out.println(var5);
		
		//문자 리터럴
		char var6 = 'A'; //문자 리터럴
		System.out.println(var6);
		
		char var7 = '한'; //문자 리터럴 (한글)
		System.out.println(var7);
		
		System.out.println('\t' + "들여쓰기"); // '\t' - 들여쓰기 문자
		System.out.println("대한" + '\n' + "민국"); // "" - 문자열 // '\n', '\r' - 줄 바꿈
		System.out.println("This" + '\'' + "s Java"); // '\'' - 작은 따옴표
		System.out.println("이것은" + '\"' + "중요" + '\"' + "합니다"); // '\"' - 큰 따옴표
		System.out.println("이것은" + '\\' + "300입니다"); // '\\' - \기호(원화 기호)
		
		char var8 = '\u0041'; // 16진수에 해당하는 유니코드 -> 65 = 'A'
		System.out.println(var8);
		
		// 문자열 리터럴
		System.out.println("대한" + "민국"); // + - 문자열과 문자열을 결합하는 기호(문자열 결합 연산자)
		System.out.println("Java" + 8); // 위와 동일
		
		String var9 = "자바";
		System.out.println(var9);
		
		// 논리 리터럴
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var10);
		System.out.println(var11);
		
	}
}
