package source06;

public class Test04_01 {
//	do ~ while 문을 이용하여 1부터 100까지의 합 구하기
	public static void main(String[] args) {
		 int i = 0, sum = 0;
		 do {
			 sum += i;
			 i++;
		 } while(i <= 100);
		 System.out.println("1부터 100까지의 합 " + sum);
	}

}
