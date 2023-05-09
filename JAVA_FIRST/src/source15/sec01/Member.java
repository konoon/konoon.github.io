package source15.sec01;

// hashCode() 메서드와 equals() 메서드 재정의

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// name과  age 값이 같으면 true리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	// name과 age 값이 같으면 동일한 hashCode를 리턴함
	@Override
	public int hashCode() {
		return super.hashCode() + age;
	}
}
