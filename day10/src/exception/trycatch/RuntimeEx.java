package exception.trycatch;

public class RuntimeEx {

	public static void main(String[] args) {
		
		//실행예외
		//ArrayIndex
//		int[] arr = {1,2,3 };
//		System.out.println(arr[3]);
		
		//ClassCast
//		String s = (String)new Object();
		
		//NumberFormat
//		Integer.parseInt("hello");
		
		//NullPointer
		System.out.println(1);
		String s = null;
		s.charAt(0);

		System.out.println(2);
		
		System.out.println(3);
		System.out.println("프로그램정상종료");
		
		
	}
}
