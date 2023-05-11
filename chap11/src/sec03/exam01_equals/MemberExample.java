package sec03.exam01_equals;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		/* equals() 메소드를 재정의하지 않았을 경우 위의 if문 결과값과 동일함.   
		  if(obj1 == obj2) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		} */
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
		
		/* equals() 메소드를 재정의 하지 않았을 때 결과값
		   obj1과 obj2는 동등하지 않습니다.
		   obj1과 obj3은 동등하지 않습니다.
		   
		   equals() 메소드를 재정의 했을 때 결과값
		   obj1과 obj2는 동등합니다.
		   obj1과 obj3은 동등하지 않습니다.
		 */
	}
}
