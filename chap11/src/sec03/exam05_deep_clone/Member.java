package sec03.exam05_deep_clone;

import java.util.*;

public class Member implements Cloneable {
	public String name;
	public int age;
	
	//참조 타입 필드(깊은 복제 대상)
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	//Object clone() 재정의 -> ctrl + space -> clone() 클릭
	//clone() 메소드의 재정의
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone(); // Object의 clone() 얕은 복제(호출)
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); //재정의된 clone() 메소드 호출
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
}
