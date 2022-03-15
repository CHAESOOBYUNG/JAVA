package quiz18;

public class Validation {
	/* 주민번호 검증메서드 masking(String)
	 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
	 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
	 * 
	 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
	 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
	 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
	 * 4. 남, 여에 대한 정보를 출력해줍니다.
	 *  
	 * masking메서드를 만들어주세요 
	 * 검증데이터 950101-1000000 -> 남자 -> 950101-*******
	 * 검증데이터 9501012000000 -> 여자 -> 950101-*******
	 * 검증데이터 950101-5000000 -> 예외
	 * 검증데이터 9501015000000 -> 예외
	 * 검증데이터 950101511111 -> 예외
	 * 
	 * 힌트) 1. -제거 (13자리 고정인덱스)
	 *      2. 6번째 인덱스의 값 확인
	 *      3. 원본문자열의 substring절삭 + "*".repeat(6)
	 */
	
	public static String masking(String ssn) throws Exception {
		
		ssn = ssn.replace("-", ""); //-제거
		if(ssn.length() != 13) {
			System.out.println("주민번호는 13자리 입니다");
			throw new Exception();
		} else {
			switch ( ssn.charAt(6) ) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
			default: //1,2,3,4가 아닌경우
				System.out.println("7번째 자리수는 1~4입니다");
				throw new Exception();
			}
		}

		
		
		return ssn.substring(0, 6) + "-*******";
	}
	
}
