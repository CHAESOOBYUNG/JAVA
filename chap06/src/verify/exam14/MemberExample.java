package verify.exam14;

public class MemberExample {
	
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");
		System.out.println("user1 이름: " + user1.name);
		System.out.println("user1 아이디: " + user1.id);
		System.out.println("user2 이름: " + user2.name);
		System.out.println("user2 아이디: " + user2.id);
	}
	
}
