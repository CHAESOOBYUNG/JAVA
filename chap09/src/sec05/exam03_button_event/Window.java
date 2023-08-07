package sec05.exam03_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값으로 대입
	//필드 선언과 초기값 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	
	Window() {
		button1.setOnclickListener(listener); //매개값으로 필드 대입
		
		//매개값으로 익명 구현 객체 대입
		button2.setOnclickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다");
			}
		});
	}
}
