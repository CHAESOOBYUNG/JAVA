package sec11.exam01_arrays;

public class Member implements Comparable<Member> {
	String name;
	
	Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) { //유니코드 비교
		return name.compareTo(o.name); 
	}
	/* compareTo() 메소드 리턴값 
	   오름차순 - 자신 < 매개값 -> 음수 / 자신 = 매개값 -> 0 / 자신 > 매개값 -> 양수 
	   내림차순 - 자신 < 매개값 -> 양수 / 자신 = 매개값 -> 0 / 자신 > 매개값 -> 음수
	*/
	
	
}
