package api.lang.strbuffer;

public class StringBufferEx {

	public static void main(String[] args) {
		
		//StringBuffer, StringBuilder는 기능상 같습니다.
		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");
		
		System.out.println(str);
		System.out.println(sb);
		
		//차이점
		str = str + " program";
		sb.append(" program");
		
		System.out.println(str);
		System.out.println(sb);
		
		System.out.println("------------------------------");
		//문자열 뒤에 추가 append
		sb.append("ing");
		System.out.println(sb);
		
		//문자열 중간에 추가 insert
		sb.insert(5, "study ");
		System.out.println(sb);
		
		//문자열 변경 replace
		sb.replace(5, 10, "is");
		System.out.println(sb);
		
		//문자열 삭제 delete
		sb.delete(5, 8);
		System.out.println(sb);
		
		//문자열 거꾸로 reverse
		sb.reverse();
		System.out.println(sb);
		
		//StringBuffer 비교 String
		//문자열의 형태로 변경
		if(sb.toString().equals("gnimargorp avaj") ) {
			System.out.println("문자가 같음");
		}
		
		
		
		
		
		
		
	}
}
