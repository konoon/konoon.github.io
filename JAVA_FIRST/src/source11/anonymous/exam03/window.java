package source11.anonymous.exam03;

public class window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입 : 필드값으로 익명 객체 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	public window() {
		button1.OnClickListener(listener);
		button2.OnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
