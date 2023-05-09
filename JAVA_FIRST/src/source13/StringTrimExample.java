package source13;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = "    02";
		String tel2 = "123    ";
		String tel3 = "   1234    ";
		
		System.out.println(tel1);
		System.out.println(tel1.trim());
		System.out.println(tel2);
		System.out.println(tel2.trim());
		System.out.println(tel3);
		System.out.println(tel3.trim());

	}

}
