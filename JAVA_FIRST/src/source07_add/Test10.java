package source07_add;

public class Test10 {

	public static void main(String[] args) {
		String stu [][] = {
				{"장나라", "서울시 송파구"},
				{"김희선", "서울시 영등포구"},
				{"이영애", "서울시 구로구"}
		};
		
		for(int i = 0; i < stu.length; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(stu[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
