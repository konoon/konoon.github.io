package source09.pack2;

import source09.pack1.Ace;

public class Destination extends Ace {
	// Destination 클래스는  protected 필드, 생성자, 메서드 접근이 가능합니다. 다만, new 연산자를 사용해서 생성자를 직접 호출할 수는 없고, 자식 생성자에서 super()로 Ace 생성자를 호출할 수 있습니다.
	public Destination() {
		super();
		this.field = "장나라";
		this.method();
	}
}
