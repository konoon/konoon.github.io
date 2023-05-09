package source04;

public class Test05_SwitchString {

	public static void main(String[] args) {
		String position = "과장";
		
		switch (position) {
		case "부장":
			System.out.println("월급여는 500만원입니다.");
			break;
		case "과장":
			System.out.println("월급여는 400만원입니다.");
			break;
		default:
			System.out.println("월급여는 300만원입니다.");
		}

	}

}
