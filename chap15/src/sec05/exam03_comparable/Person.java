package sec05.exam03_comparable;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Comparable<Person> 오버라이딩
	@Override
	public int compareTo(Person o) { //오름차순
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
	
}
