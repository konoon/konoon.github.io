package coding_test05;

// for문을 이용해서 주어진 배열의 항목에서
// 다음의 결과 내용과 같이 최대값을 구해보시기 바랍니다.
// 결과 내용
// max: 8

public class Coding_Test01 {
	public static void main(String[] args) {
		int max = 0;
		int [] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			 if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);
	}
}