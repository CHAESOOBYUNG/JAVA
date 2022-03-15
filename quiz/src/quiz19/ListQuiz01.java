package quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//list에 1~20까지 정수를 순서대로 저장. add()
		for(int i = 1; i<=20; i++) {
			list.add(i);
		}
		System.out.println(list.toString());
		//list에 저장된 값을 반복문으로 순서대로 출력. get()
		
		for(int i = 0;i <list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println("\n------------------------------------");
		
		for(int a : list) {
			System.out.print(a+ " ");
		}
		
		
		
		
	}
}
