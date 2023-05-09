package source13.java_api;

import source13.java_api.exam01.Rainbow;

// ordinal() 메서드 : 해당 열거형 상수가 열거형 정의에서 정의된 순서(0부터 시작)를 반환합니다.
// 이때, 반환되는 값은 열거형 정의에서 해당 열거형 상수가 정의된 순서이며, 상수값 자체가 아님을 고려해 주시기 바랍니다.
public class Test03_02 {
	public static void main(String[] args) {
		int idx = Rainbow.YELLOE.ordinal();
		System.out.println(idx);
	}

}
