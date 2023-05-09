package source13.java_api.exam01;

public class Test03_01 {

	public static void main(String[] args) {
		Rainbow[] arr = Rainbow.values();
		
		for (Rainbow rainbow : arr) {
			System.out.println(rainbow);
		}
		
		System.out.println("====");
		Rainbow rb1 = Rainbow.valueOf("GREEN");
		System.out.println(rb1);
	}

}
