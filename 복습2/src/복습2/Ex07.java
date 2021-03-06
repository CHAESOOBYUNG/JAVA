package 복습2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//List는 순서대로 저장
		//ArrayList<String> list= new ArrayList<>();
		List<String> list = new ArrayList<>();
		list.add("김지원");
		System.out.println(list.get(0)); 
		
		//Map은 키와 값을 동시에 저장
		//HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "김지원");
		System.out.println(map.get(1));
		
		System.out.println("------------------------------------");
		
		//람다로 반복문 (x의 매개변수 1~9)
		IntStream.rangeClosed(1, 10).forEach( (x) -> {
			System.out.println(x);
		} );
		
		
		
	}
}
