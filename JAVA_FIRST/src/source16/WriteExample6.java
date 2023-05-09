package source16;

// 'A', 'B', 'C', 'D', 'E', 'F'가 저장된 배열에서 'B', 'C', 'D' 문자를 선별적으로
// 선택하여 C드라이브의 Test 폴더 안에 있는 test9.txt로 출력 저장하는
// 자바 프로그램을 제작해 봅니다.
import java.io.FileWriter;
import java.io.Writer;

public class WriteExample6 {
	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test9.txt로 하는 문자 기반 파일 출력 스트림을 생성함
		Writer writer = new FileWriter("c:/Test/test9.txt");
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		// array 배열의 1번 인덱스부터 3개 문자를 출력 처리함.
		writer.write(array, 1, 3);
		
		System.out.println("정상적으로 처리가 되었습니다!");
		// 출력 버퍼에 잔류하는 모든 문자를 비워주면서 출력 처리함.
		writer.flush();
		// 출력 스트림을 닫아줌.
		writer.close();
	}
}
