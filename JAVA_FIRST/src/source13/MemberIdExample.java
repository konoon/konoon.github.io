package source13;

public class MemberIdExample {

	public static void main(String[] args) {
		MemberId obj1  = new MemberId("blue");
		System.out.println(obj1.hashCode());
		MemberId obj2  = new MemberId("blue");
		System.out.println(obj2.hashCode());
		MemberId obj3  = new MemberId("red");
		System.out.println(obj3.hashCode());
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다.");
		} else {
			System.out.println("obj1과 obj2는 동일하지않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동일합니다.");
		} else {
			System.out.println("obj1과 obj3는 동일하지않습니다.");
		}
	}

}
