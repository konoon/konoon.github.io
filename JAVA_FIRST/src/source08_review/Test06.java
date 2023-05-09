package source08_review;

import java.util.Scanner;

class Util {
	// 메서드 쓸때 int앞에 static를 붙이면  Util.fourTimes(5)로 클래스. 메서드 바로 호출 가능 안붙이면 인스턴스 객체 만들어야함
	static int fourTimes(int i) {
		return i * 4;
	}
}

public class Test06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 정수로 입력해 주시기 바랍니다. ===> ");
		int u1 = scan.nextInt();
		
		System.out.println(Util.fourTimes(u1));
		scan.close();
	}
}
