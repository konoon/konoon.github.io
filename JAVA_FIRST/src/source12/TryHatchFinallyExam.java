package source12;

public class TryHatchFinallyExam {

	public static void main(String[] args) {
		try {
			Class cs = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
//			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		}
	}

}
