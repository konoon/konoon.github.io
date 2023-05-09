package source11.exam06;

public class Button {
	OnClickListener listener; // 인터페이스 타입 필드
	
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick(); // 구현 객체의 onClick()
	}
	
	// 중첩 인터페이스 OnClickListener 정의해 줌
	static interface OnClickListener {
		void onClick();
	}
}
