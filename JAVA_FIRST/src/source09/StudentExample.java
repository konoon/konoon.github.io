package source09;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("장나라", "20001331-212133", 20220603);
		System.out.println("name : " + student.name); // 부모 상속 필드 출력
		System.out.println("ssn : " + student.ssn); // 부모 상속 필드 출력
		
		System.out.println("studentNo : " + student.studentNo);
	}

}
