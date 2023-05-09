package source16.support;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sun.javafx.property.adapter.ReadOnlyPropertyDescriptor.ReadOnlyListener;

// 객체 입출력 보조 스트림 활용 자바 프로그램 제작
// 이번에는 List 컬렉션을 파일로 조정하고 읽는 프로그램을 제작합니다.
// List 컬렉션의 구현 클래스로 ArrayList을 사용하는데, ArrayList는
// Serializable 인터페이스를 구현하고 있습니다. 그래서, 파일에 저장이 가능합니다.
 
public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {

		writeList();  // List를 파일에 저장
		List<Board> list = readList();  // 파일에 저장된 List 읽기
		
		// List 내용을 모니터 화면에 출력해 줌.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board board : list) {			
			System.out.println(
			board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t" + board.getWriter() + "\t" + sdf.format(board.getDate())
			);
		}
	}

	// 객체 입력 스트림(ObjectInputStream)을 이용해서 list 읽기
	private static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("c:/Test/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}

	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>(); // List 자료 구조 생성
		
		// list에 Board 객체 생성 저장
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		// 객체 출력 스트림을 이용해서 list 출력
		FileOutputStream fos = new FileOutputStream("c:/Test/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
}
