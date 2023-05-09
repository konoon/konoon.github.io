package source09_inheritance;

class Person6 {
	String name;
	String id;
	
	public Person6(String name) {
		this.name = name;
	}
}

class Student6 extends Person6 {
	String grade;
	String department;
	
	public Student6(String name) {
		super(name);
	}
}

public class Test09 {
	public static void main(String[] args) {
		Person6 p;
		Student6 s = new Student6("장나라");
		p = s; // 업캐스팅
		System.out.println(p.name);
		
		s.grade = "A";
		System.out.println(s.grade);
//		p.grade = "B";
		s.department = "영업부";
		System.out.println(s.department);
	}

}
