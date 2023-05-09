package source07_add;

public class Test03 {

	public static void main(String[] args) {
		int [] data = {5, 4, 3, 2, 7};
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("\n==============");
		
		int hap = 0;
		for(int i = 0; i < data.length; i++) {
			hap += data[i];
		}
		System.out.println("배열 요소의 전체 합 = " + hap);
	}

}
