package source09;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시폰", "검정", 10);

		// CellPhone 클래스로부터 상속 받은 필드
		System.out.println("모델" + dmbCellPhone.modle);
		System.out.println("색상" + dmbCellPhone.color);
		
		// DmbCellPhone 클래스로부터 상속 받은 필드 
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		// CellPhone 부모 클래스로부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 저는 장나라 입니다.");
		dmbCellPhone.sendVoice("반갑습니다");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone 클래스로 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();
	}

}
