package sec02.exam04_long;

public class LongExample {
	
	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L; // L - 8byte로 해석
		
		// long var3 = 100000000000; // 컴파일 에러 int 값으로 해석
		
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}
	
}
