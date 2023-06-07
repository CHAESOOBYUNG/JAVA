package sec03.stream_pipelines;

import java.util.*;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("채수병", Member.MALE, 23),
			new Member("리즈", Member.FEMALE, 18),
			new Member("오타니", Member.MALE, 28),
			new Member("안유진", Member.FEMALE, 19)
		);
		
		double avgAge = list.stream()
			.filter(m -> m.getSex() == Member.MALE) //오리지널 스트림
			.mapToInt(Member :: getAge) //중간 처리 스트림
			.average() //최종 처리
			.getAsDouble();
		
		System.out.println("남자 평균 나이: " + avgAge);
	}
}
