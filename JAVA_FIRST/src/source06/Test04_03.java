package source06;

public class Test04_03 {

// do ~ while 문을 이용해서 3의 배수값들을 출력하고, 3의 배수값들의 합을 구하는 프로그램 제작 
	public static void main(String[] args) {
		int i = 1, sum = 0;
		do {
			if(i % 3 ==0) {
				System.out.println(i + "");
				sum += i;
			}
			i++;
		} while(i <= 100);
		System.out.println("1부터 100까지의 3의 배수값들의 합 = " + sum);
	}
}
