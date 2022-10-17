package coding_test05;

// 배열 길이가 5인 정수형 배열을 선언하고
// 2, 4, 6, 8, 10 짝수를 배열에 저장한 후에
// 그 합을 다음 결과 내용과 같이 출력하시기 바랍니다.
// 결과 내용
// 2, 4, 6, 8, 10 짝수를 합한 값은 30입니다.

public class Coding_Test03{
	public static void main(String[] args) {
		// 배열 길이가 5인 정수형 배열 선언과 함께
		// 2, 4, 6, 8, 10 짝수를 배열에 저장 처리함
		int[] number = new int[] {2, 4, 6, 8, 10};
		int total = 0;
		
		for (int i = 0; i < number.length; i++) {
			total += number[i]; // total = total + number[i];
		}
		System.out.println("2, 4, 6, 8, 10 짝수를 합한 값은 " + total + " 입니다.");
	}
}