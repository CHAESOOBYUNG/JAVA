package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { // enter 키(13,10)가 아니라면 실행(출력)
				System.out.println("----------------------");
				System.out.println("1.증속 | 2.감속| 3.중지");
				System.out.println("----------------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read(); // 키보드로부터 입력 대기
			
			if(keyCode == 49) { // 자판키 1를 누름
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(keyCode == 50) { // 자판키 2를 누름
				speed--;
				System.out.println("현재 속도 = " + speed);
			}  else if(keyCode == 51) { // 자판키 3을 누름
				run = false;
			}	
		}
		
		System.out.println("프로그램 종료");
	}
	
}
