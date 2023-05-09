package source07;

public class Test03_ArrayCreate {

	public static void main(String[] args) {
		
//		int [] numbers = {10, 20, 30};
		int [] scores;
		scores = new int [] {10, 20, 30}; // 배열 인덱스는 0부터 시작함
		
		int [] intArray = new int[3];
		intArray[0] = 10; 
		intArray[1] = 20; 
		intArray[2] = 30; 
		
		System.out.println(intArray[0]);
		
		int num = intArray.length;
		System.out.println(num);
	}

}
