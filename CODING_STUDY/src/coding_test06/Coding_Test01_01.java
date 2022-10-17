package coding_test06;

// 제네릭(Generic)은 자바5버전부터 등장하여,
// 컬렉션, 람다식(함수적 인터페이스), 스트림, NIO에서 널리 사용되고 있으며,
// 어떤 값이 하나의 참조 자료형이 아닌 여러 참조 자료형을
// 사용할 수 있도록 프로그래밍하는 것을 말합니다.
// Age 클래스를 선언하고, 제네릭(Generic) 프로그램을 적용하여,
// 다음의 실행 결과가 구현되도록 자바 프로그램을 작성하시기 바랍니다.
// 실행 결과
// 장나라님의 나이는 21세 입니다!
// 손흥민님의 직업은 축구선수 입니다!

// K = 키(Key), V = 값(Value)
class Age<K, V> {
	private K key;
	private V value;
	
	public Age(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}

public class Coding_Test01_01{
	public static void main(String[] args) {
		Age<String, Integer> e1 = new Age<>("장나라", 21);
		System.out.println(e1.getKey() + "님의 나이는 " + e1.getValue() + "세 입니다.");
		
		Age<String, String> e2 = new Age<>("손흥민", "축구선수");
		System.out.println(e2.getKey() + "님의 직업은 " + e2.getValue() + "입니다.");
	}
}
