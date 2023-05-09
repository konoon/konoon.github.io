package source13;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("술", "땡긴다,,,,,,,ㅠ");
		
		// 재정의된 toString()메서드 호출 
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		// 재정의된 toString() 메서드를 호출하고, 리턴값을 받아 출력
		System.out.println(myPhone);
	}

}
