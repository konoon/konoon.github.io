package source11.anonymous;

// 익명 구현 객체 생성

public class Anonymous2 {
	// 필드 초기값으로 대입 : 필드 선언과 초기값 대입
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
	};
	
	void method1() {

		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다");
			}
		};
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
