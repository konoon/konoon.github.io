package source15.collection;

import java.util.Vector;

public class Test18_Vector {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(new Integer(4));
		v.add(10);
		
		// 벡터 요소값 중에 0, 1, 2번째에 -1값을 삽입 저장함
		v.add(2, -1);
		System.out.println("Vector 내의 Element요소 저장 값" + v);
		System.out.println("Vector 내의 Element요소 객체 수" + v.size());
		System.out.println("Vector 내의 1번 인덱스 값 = " + v.get(1));
	}

}
