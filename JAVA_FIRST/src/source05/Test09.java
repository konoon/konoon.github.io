package source05;

public class Test09 {

	public static void main(String[] args) {
		int i;
		i = 0; // 정수형 변수 i값의 초기값을 0으로 설정함

		for( ; i < 5; ) {
			System.out.println("for에서 초기값과 증가식 위치 변경함" + i + "\n");
			i++;
		}
	}

}
