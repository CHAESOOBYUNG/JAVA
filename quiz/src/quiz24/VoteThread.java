package quiz24;

import java.util.Random;

public class VoteThread implements Runnable{

	/*
	 * run()메서드 안에서는 랜덤값을 이용해서 개표 진행상황을 화면에 출력
	 * 조건: 개표율이 100% 넘어가면 안됩니다.
	 */
	private int sum = 0; //개표율
	private Random ran = new Random();
	private StringBuffer sb = new StringBuffer();


	@Override
	public void run() {

		while(true) {
			int r = ran.nextInt(10) + 1;
			sum += r; //sum에 누적

			if(100 > sum) { //개표율이 100미만
				//출력문 생성
				for(int i =1; i<=r; i++) {
					sb.append("*"); //sb 끝에 랜덤하게 나온 *추가
				}
				
				//결과출력
				System.out.println(Thread.currentThread().getName() + "개표율:" + sum + "%:" +sb);
				
			} else { //개표율이 100보다 클때 
				
				//sb가 가진 *의 크기를 100으로 조정
				//sum = 100;
				sb.delete(0, sum);
				sum = 100;
				
				for(int i = 1; i <=sum; i++) {
					sb.append("*");
				}
				
				System.out.println(Thread.currentThread().getName() + "개표율:" + sum + "%:" +sb);
				
				break; //탈출
			}

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			
		} //end while

		System.out.println(Thread.currentThread().getName() + "투표 종료");
		

	} //
}

