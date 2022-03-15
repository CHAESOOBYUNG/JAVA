package api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		//Math클래스는 수학관련 기능을 포함하고 있고, static메서드로 구현되어있습니다.
		double d = Math.random();
		System.out.println(d);
		
		int result = Math.abs(-5);
		System.out.println("절대값:" +result);
		
		double result2 = Math.ceil(3.14);
		System.out.println("올림값:" + result2);
		
		double result3 = Math.floor(3.14);
		System.out.println("내림값:" + result3);
		
		long result4 = Math.max(100L, 30L);
		System.out.println("큰수비교:" + result4);
		
		double result5 = Math.round(3.6);
		System.out.println("반올림:" + result5);
	
		/* 1줄짜리 코드(몫을 이용하면 됩니다)
		 * 
		 * Math.ceil()을 사용해서 1~10이 전달되면 1을 반환하는 page메서드를 생성
		 * 11~20 -> 2를 반환
		 * 21~30 -> 3을 반환
		 */
		System.out.println(page(1) );
		System.out.println(page(11) );
	}
	
	public static int page(int num) {
		return (int)Math.ceil(num / 10.0 );
	}
	
	
	
	
	
}
