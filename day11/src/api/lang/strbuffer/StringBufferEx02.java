package api.lang.strbuffer;

public class StringBufferEx02 {

	public static void main(String[] args) {
		
		//String과 StringBuffer의 속도비교
		
		long start = System.currentTimeMillis();
		
//		String str = "";
//		for(int i = 1; i <= 300000; i++) {
//			str += "A";
//		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 1; i <= 300000; i++) {
			sb.append("A");
		}
		
		
		long end = System.currentTimeMillis();
		
		
		System.out.println("실행시간:" + (end-start)* 0.001 );
		
		
		
		
		
	}
}
