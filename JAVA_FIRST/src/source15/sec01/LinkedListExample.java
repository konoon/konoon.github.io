package source15.sec01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//   구분           |    순차적으로 추가/삭제         |     중간에 추가/삭제         |     검색
// ArrayList |    빠르다                            |     느리다                       |     빠르다
// LinkedList|    느리다                            |     빠르다                       |     검색느리다

// ArrayList와 LinkedList에 10,000개의 객체를 삽입하는데 걸린 시간을 측정해 봅니다. 
// 0번 인덱스에 String 객체를 10000번 추가하기 위헤
// List 인터페이스의 add(int index, Element) 메서드를 이용합니다.
// 실행 결과에서 LinkedList 활용 처리 시간을 비교해 보시면,
// LinkedList가 훨씬 빠른 처리 성능을 보여주는 것을 확인하는 예시입니다.
// 끝에서부터(순차적으로) 추가 또는 삭제하는 경우는 ArrayList가 빠르지만.
// 지금처럼 중간에 추가, 삭제하는 경우는 앞뒤 링크 정보만 변경하기 때문에 LinkedList가 더 빠릅니다. ArrayList는 뒤쪽 인덱스들을 모두 1씩 증가 또는 감소시키는 시간이 필요하므로 처리 속도가 느립니다.

// ArrayList와 LinkedList의 실행 성능 비교 예시 프로그램 제작
public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 객체 추가 처리 시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 객체 추가 처리 시간 : " + (endTime - startTime) + "ns");
	}

}
