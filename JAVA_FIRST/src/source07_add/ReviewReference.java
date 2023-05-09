package source07_add;

public class ReviewReference {

	public static void main(String[] args) {
		int number = 21;
		int number1 = 22;
		
		System.out.println(number);
		System.out.println(number1);
		
		String str1 = "장나라";
		String str2 = "장나라";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.equals(str2));
		
		String str3 = new String("김희선");
		String str4 = new String("김희선");
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str3.equals(str4));
		
		String str5 = new String("김태희");
		String str6 = new String("전지현");
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		System.out.println(str5.equals(str6));
		
		String str7 = new String("이영애");
		String str8 = new String("이영애");
		System.out.println(str7.equals(str8));
		System.out.println(str7 == str8);

	}

}
