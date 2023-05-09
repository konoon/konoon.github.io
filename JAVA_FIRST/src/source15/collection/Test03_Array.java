package source15.collection;

import java.util.ArrayList;
import java.util.Iterator;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class Test03_Array {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("song", 21));
		list.add(new Person("kim", 31));
		list.add(new Person("hong", 37));
		
		for (int i = 0; i < list.size(); i++) {
			Person pd = list.get(i);
			System.out.println("이름 : " + pd.getName() + ", 나이 : " + pd.getAge());
		}
		System.out.println("==========================");
		
		System.out.println("[Iterator 순환 반복 선택자를 활용한 데이터 화면 출력]");
		
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person person = (Person) it.next();
			System.out.println("이름 : " + person.getName() + ", 나이 " +  person.getAge());
			
		}
	}

}
