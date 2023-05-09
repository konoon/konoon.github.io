package source08;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		int s1Hash = s1.hashCode();
		System.out.println(s1Hash);
		
		Student s2 = new Student();
		System.out.println("s2 변수가  또 다른 Student 객체를 참조합니다.");
		int s2Hash = s2.hashCode();
		System.out.println(s2Hash);

	}

}
