package sec03.exam01_equals;

public class Member /* extends Object */ {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// equals() 메소드 재정의 -> ctrl + space -> equals(Object obj) 클릭
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	//hashCode() 메소드 재정의 -> ctrl + space -> hashCode() 클릭
	@Override
	public int hashCode() {
		return id.hashCode(); // id 해시코드 값 리턴
	}
}
