package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * toString() - 객체 주소를 문자열로 반환
		 * (멤버변수를 문자열로 반환시키도록 오버라이딩해서 많이 사용) 
		 * hashCode() - 객체의 숫자값 반환
		 * getClass() - 현재 실행 객체의 클래스 정보반환
		 * equals() - 같은 객체인지 주소값 비교
		 * clone() - 객체 복사
		 * finalize() - 가비지컬렉터가 실행될때 자동으로 실행되는 메서드
		 */
				
		Person kim = new Person("김길동");
		
		String result = kim.toString();
		System.out.println(result);
		
		int hashcode = kim.hashCode();
		System.out.println(hashcode);
		
		Class<?> c = kim.getClass(); //반환유형
		System.out.println(c);
		
		//오버라이딩 해서 name이 같으면 true반환.
		Person park = new Person("박찬호");
		
		boolean bool = kim.equals(park);
		System.out.println("같은이름?:" + bool);
	
		try {
			Person clonePerson = (Person)kim.clone();
			System.out.println("복제인간:" + clonePerson.getName());
			
		} catch (Exception e) {
			
		}
		
		
		
		
		
	}
}
