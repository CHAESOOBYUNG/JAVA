package exception.throws_;

public class ThrowsEx02 {
	//생성자
	public ThrowsEx02() throws Exception {
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
	}
	
	//메서드
	public void aaa() throws Exception {
		System.out.println("aaa호출");
		bbb(0);
		System.out.println("aaa종료");
	}
	
	public void bbb(int num) throws Exception {
		System.out.println("bbb호출");
		/*
		try {
			System.out.println(10 / num);
		} catch (Exception e) {
			System.out.println("예외 처리 완료");
		}
		*/
		System.out.println(10 / num);
		
		System.out.println("bbb종료");
		
	}
	
}
