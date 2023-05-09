package source02;

public class Test13_VariableAutoCasting {

	public static void main(String[] args) {
		// 자동 타입 변환 예시: 작은 허용 범위 타입에서 큰 허용 범위 타입으로 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println("intValue = " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue = " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue = " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue = " + doubleValue);
	}

}
