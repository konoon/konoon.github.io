package source12.review;

public class Test03_02 {

	public static void main(String[] args) {
		int [] array = {0, 1, 2};
		try {
			System.out.println("첫 번째 원소 => " + array[0]);
			System.out.println("마지막 원소 => " + array[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다. 에러 메세지" + e.getMessage());
		}
	}

}
