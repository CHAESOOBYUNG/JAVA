package sec05.exam07_andthen_compose;

import java.util.function.*;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("ConsumerA: " + m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> { 
			System.out.println("ConsumerB: " + m.getId()); 
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB); //consumerA -> consumerB
		consumerAB.accept(new Member("홍길동", "hong", null));
	}
}
