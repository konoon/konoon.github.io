package source11.anonymous.exam04;

public class Anonymous {
	private int field;
	
	// 메서드 안에 Calculatalbe를 익명으로 선언함
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		Calculatalbe calc = new Calculatalbe() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
