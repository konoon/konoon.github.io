package source04_add;

public class Test01 {

	public static void main(String[] args) {
		
		char ch = 'b';
		
		if((ch >= 'a' && ch <= 'z')||(ch > 'A' && ch <= 'Z')) {
			System.out.println(ch + "는 알파벳입니다.");
		} else {
			System.out.println(ch + "는 알파벳이 아닙니다.");
		}

	}

}
