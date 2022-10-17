package coding_test03;

// 중첩 for문을 이용하여 방정식 4x + 5y = 60의
// 모든 해를 아래 실행 결과와 같이 구해서 (x, y) 형태로 출력하는
// 자바 프로그램을 제작합니다.
// 단, x와 y는 10 이하의 자연수 입니다.
// 아래 실행 결과
// (5, 8)
// (10, 4)

public class Coding_Test02{
	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if((4 * x + 5 * y) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}