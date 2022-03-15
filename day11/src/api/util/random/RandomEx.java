package api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		//랜덤수를 다양하게 사용할 수 있는 Random클래스
		Random ran = new Random();
		
		double d = ran.nextDouble(); //0~1미만 실수
		System.out.println(d); //Math.random()
		
		int x = ran.nextInt();
		System.out.println("정수범위의 랜덤값:" +x);
		
		int y = ran.nextInt(10);
		System.out.println("0~10미만 랜덤값:" + y);
		 
		//yopy0817@gmail.com (7번)
		
		
	}
}
