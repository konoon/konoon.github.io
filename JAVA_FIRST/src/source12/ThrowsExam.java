package source12;

public class ThrowsExam {

	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스가 확인되었습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class cs = Class.forName("java.lang.String");
	}

}
