package source12;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다."); // -> 인수가 부족할 경우 
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다."); // -> 문자열이 있는 경우
		} finally {
			System.out.println("다시 실행해 주시기 바랍니다.");
		}
	}

}
