package sec05.exam03_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	
	Window() {
		button1.setOnclickListener(listener);
		
		button2.setOnclickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다");
			}
		});
	}
}
