package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. Random객체 이용해서 1~45까지 랜덤수를 생성
		 * 2. set계열 컬렉션을 이용해서 6개의 로또번호를 만들어내는 코드를 작성.
		 * 
		 */
		Random ran = new Random(); //랜덤객체

		Set <Integer> set = new HashSet<>();

		while(set.size() != 6) {

			int r = ran.nextInt(45) + 1; //0~44 + 1
			set.add(r);


			System.out.println(set.toString());
		}
	}
}
