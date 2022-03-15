package day01;

public class SystemOut {

	public static void main(String[] args) {
		
		//main이라 쓰고 ctrl + space누르면 자동완성됩니다
		//sysout이라 쓰고 ctrl + space
		/* 
		 * 여러줄 주석.
		 * 실행단축키 - ctrl + f11
		 * 한줄주석- ctrl + /
		 * 여러줄주석- ctrl + shift + / 
		 * 되돌리기- ctrl + z
		 * 프로그램 코드이동- alt + 방향키
		 * 범위지정- shift + 방향키
		 * 코드삭제 - ctrl + d
		 */
		
		System.out.println("안녕하세요~");
		System.out.println("반갑습니다~");
		
		System.out.print("개행이 없는 출력문, ");
		System.out.print("가로로 출력할때 사용");
		
		//형식지정 출력문(문장에 구멍을 뚫어놓고, 필요한 값을 넣어쓰는 형식)
		/*
		 * 서식문자
		 * %d - 정수를 입력받음.
		 * %f - 실수를 입력받음.
		 * %s - 문자열을 입력받음.
		 * %c - 문자를 입력받음.
		 * \n - 줄바꿈
		 * \t - 8칸 띄어쓰기
		 */
		System.out.printf("\n오늘은 %d년 %d월 %d일", 2021, 11, 23);
		System.out.printf("\n원주율은 %f입니다", 3.14);
		System.out.printf("\n원주율은 %.2f입니다", 3.14);
		System.out.printf("\n제이름은 %s입니다", "홍길동");
		
		
		//숫자와 문자
		System.out.println();
		System.out.println("쌍따옴표 없이 적으면");
		System.out.println(123);
		System.out.println("123");
		
	}
	
}
