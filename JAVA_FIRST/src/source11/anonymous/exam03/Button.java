package source11.anonymous.exam03;

public class Button {
	// 인터페이스 타입 필드
	OnClickListener listener;
	
	public void OnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 구현 객체의 onClick() 메서드 호출
	void touch() {
		listener.onClick();
	}

	// 중첩 인터페이스 OnClickListener 정의
	static interface OnClickListener {
		// 추상 메서드 onClick() 정의함
		void onClick();
	}
}
