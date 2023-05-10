package sec03.exam05_deep_clone;

import java.util.*;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// Object clone() 재정의 -> ctrl + space -> clone() 클릭
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone(); // Object의 clone() 얕은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
}
