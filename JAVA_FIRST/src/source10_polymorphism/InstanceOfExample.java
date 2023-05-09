package source10_polymorphism;

public class InstanceOfExample {

	public static void method1(ParentInstanceOf parent) {
		
		// instanceof는 객체가 존재하는지 확인하는 메서드(?)
		if(parent instanceof ChildInstanceOf) {
			ChildInstanceOf child = (ChildInstanceOf) parent;
			System.out.println("method1 = Child로 변환 성공");
		} else {
			System.out.println("method1 = Child로 변환 되지않음");
		}
	}
	
	public static void method2(ParentInstanceOf parent) {
		// ClassCastException 발생 가능성 있음 (코드가 하위 유형이 아닌 유형에 대한 참조를 캐스팅하려고 시도했음을 알리는 확인되지 않은 예외 입니다.)
		ChildInstanceOf child = (ChildInstanceOf) parent;
		System.out.println("method2 - ChildInstanceOf로 변환 성공");
	}
	
	public static void main(String[] args) {
		ParentInstanceOf parentA = new ChildInstanceOf();
		method1(parentA); // ChildInstanceOf 객체를 매개값으로 전달
		method2(parentA);
		
		ParentInstanceOf parentB = new ParentInstanceOf();
		method1(parentB); // ParentInstanceOf 객체를 매개값으로 전달
		method2(parentB); // ClassCastException가 발생

	}

}
