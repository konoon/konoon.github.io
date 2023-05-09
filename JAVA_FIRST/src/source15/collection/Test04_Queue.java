package source15.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Test04_Queue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		System.out.println(q.poll());
		
		q.offer("사과");
		System.out.println("바나나 추가? " + q.offer("바나나"));
		
		// 특별한 값 (special value)을 반환(return) : boolean offer(E e) : 바나나
		try {
			q.add("체리"); // boolean add 삽입 : 체리
		} catch (Exception e) {
		}
		System.out.println("헤드 엿보기 : " + q.peek());
		
		String head = null;
		
		try {
			head = q.remove(); // 사과 제거 처리
			System.out.println(head + " 제거하기"); // 사과 제거 확인
		} catch (Exception e) {
		}
		
		head = q.poll(); 
		System.out.println(head + " 제거하기");
		
		System.out.println("새로운 헤드 " + q.peek());
		System.out.println("자료 구조에 체리를 포함하고 있나요 " + q.contains("체리"));
		System.out.println("자료 구조에 사과를 포함하고 있나요 " + q.contains("사과"));
	}

}
