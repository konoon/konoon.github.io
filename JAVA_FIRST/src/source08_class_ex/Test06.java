package source08_class_ex;

class Field {
	static int classVar = 10; // 클래스 변수 선언
	int instanceVar = 20; // 인스턴스 변수 선언
}

public class Test06 {
	public static void main(String[] args) {
		int var = 30; // 지역 변수 선언
		System.out.println(var); // 지역변수 var 참조

		Field myField1 = new Field();
		Field myField2 = new Field();
		
		System.out.println(Field.classVar); // 클래스 변수 참조
		
		Field.classVar = 100;
		System.out.println(Field.classVar);
		
		System.out.println(myField1.instanceVar);
		
		myField1.instanceVar = 200;
		System.out.println(myField1.instanceVar);
	}

}
