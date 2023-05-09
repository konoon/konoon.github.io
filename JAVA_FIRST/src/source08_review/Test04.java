package source08_review;

import java.util.Scanner;

// 생성자 연속 호출
public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해 주시기 바랍니다. ==>");
		String name = scan.nextLine();
		System.out.println("나이를 입력해 주시기 바랍니다. ==>");
		int age = scan.nextInt();
		
		Person person = new Person();
		person.setName(name).setAge(age).sayHello();
		
		scan.close();
	}
}

class Person {
	String name;
	int age;
	
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("안녕하세요 제 이름은 " + name + "이고 " + age + "살 입니다.");
	}
}
