package source13;

public class StringSubStringExample {

	public static void main(String[] args) {
		String ssn = "090094-1253351";
		
		// 0번째부터 6번째 전까지
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		// 7번째부터 끝까지
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
