package source15.sec01;

import java.util.List;
import java.util.Vector;

// Board 객체를 저장하는 Vector 활용 예시

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		// Board 객체를 저장 처리함
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + ", " + board.content + ", " + board.write);
		}
	}
}
