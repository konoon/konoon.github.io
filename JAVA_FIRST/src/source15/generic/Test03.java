package source15.generic;

public class Test03 {

	public static void main(String[] args) {
		Test02<String, Integer> e1 = new Test02<>("장나라", 21);
		System.out.println(e1.getKey() + "님의 나이는 " + e1.getValue() + "세 입니다.");
		
		Test02<String, String> e2 = new Test02<>("손흥민", "축구선수");
		System.out.println(e2.getKey() + "님의 직업는 " + e2.getValue() + "입니다.");
	}

}
