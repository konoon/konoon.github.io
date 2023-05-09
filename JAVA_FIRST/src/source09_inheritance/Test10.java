package source09_inheritance;

import java.util.Scanner;

class Person7 {
	String name;
	String id;
	
	public Person7(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

class Student7 extends Person7 {
	String grade;
	String department;
	
	public Student7(String name, String id) {
		super(name, id);
	}
}

public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 이름을 입력해 주세요. ==>");
		String sname = scan.nextLine();
		System.out.println("학생의 아이디를 입력해 주세요. ==>");
		String sid = scan.nextLine();
		
		Person7 p = new Student7(sname, sid);
		Student7 s;
		
		s = (Student7) p;
		System.out.println(s instanceof Student7);
		System.out.println("학생의 이름은  " + s.name + " , 아이디는" + s.id);
	}
}
