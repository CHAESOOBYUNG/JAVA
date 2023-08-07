package sec06.exam03_constructor_references;

import java.util.function.*;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new; //Member(String id) 생성자 참조
		Member member1 = function1.apply("angel"); //매개값 1개
		
		BiFunction<String, String,Member> function2 = Member :: new; //Member(String name, String id) 생성자 참조
		Member member2 = function2.apply("LAA", "angel"); //매개값 2개
	}
}
