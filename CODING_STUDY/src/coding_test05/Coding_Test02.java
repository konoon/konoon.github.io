package coding_test05;

// 중첩 for문을 이용해서 주어진 배열의
// 전체 항목의 합과 평균값을
// 다음의 결과 내용과 같이 구해 보시기 바랍니다.
// 결과 내용
// sum: 881
// avg: 88.1

public class Coding_Test02{
	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
		};
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
