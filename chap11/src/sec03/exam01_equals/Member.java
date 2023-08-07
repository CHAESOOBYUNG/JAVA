package sec03.exam01_equals;

public class Member /* extends Object */ {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// equals() 메소드 재정의 -> ctrl + space -> equals(Object obj) 클릭
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //매개값이 Member 타입인지 확인
			//Member 타입으로 강제 타입 변환하고 id 필드값이 동일한지 검사한 후, 동일하다면 true를 리턴
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false; //매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴
	}
	
	//hashCode() 메소드 재정의 -> ctrl + space -> hashCode() 클릭
	//id가 동일한 문자열인 경우 같은 해시 코드를 리턴
	@Override
	public int hashCode() {
		return id.hashCode(); // id 해시코드 값 리턴
	}
}
