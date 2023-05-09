package source08_method;

public class Person {
	public Person() {
		
	}

	String name = "장나라";
	String address = "독도";
	
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	void printToday() {
		System.out.println("오늘은 금요일");
	}

	int plus(int x, int y, int z) {
		int result = x + y + z;
		return result;
	}
}
