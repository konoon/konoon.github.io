package source07_add;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String findId = "";
		String mem[][] = {
				{"song", "1234"},
				{"kim", "a007"},
				{"lee", "0000"}
		};
		System.out.print("찾으실 아이디를 입력해 주세요. ==> ");
		findId = scan.next();
		for(i = 0; i < mem.length; i++) {
			if(findId.equals(mem[i][0])) {
				System.out.println("비밀번호는 " + mem[i][1] + "입니다.");
				break;
			}
		}
		if(i == 3) {
			System.out.println("해당 아이디가 존재하지 않습니다!");
		} scan.close();
	}

}
