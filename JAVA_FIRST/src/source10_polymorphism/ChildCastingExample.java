package source10_polymorphism;

public class ChildCastingExample {

	public static void main(String[] args) {
		
		ParentCasting parent = new ChildCasting();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		ChildCasting child = (ChildCasting) parent; // 강제 타입 변환 -> 부모가 자식의 것을 사용가능하도록
		child.field2 = "yyy";
		child.method3();
	}

}
