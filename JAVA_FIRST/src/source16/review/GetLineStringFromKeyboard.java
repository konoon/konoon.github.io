package source16.review;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// 반복해서 키보드로부터 입력된 문자열을 라인 단위로 읽고 모니터에 출력하는 자바 프로그램 제작
// 반복을 멈추려면 "q" 또는 "quit"를 입력하게 합니다.
// 키보드로부터 라인 단위 문자열 얻기 자바 프로그램
public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {

		// InputStream을 Reader로 변환하고 다시 BufferedReader로 연결함
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while (true) {
			System.out.print("입력해 주시기 바랍니다 : ");
			// 라인 단위로 문자열을 읽어들임.
			String lineStr = br.readLine();
			// q 또는 quit를 읽었을 때 while 반복문 종료
			if(lineStr.equals("q") || lineStr.equals("quit")) {
				System.out.println("프로그램이 종료 되었습니다!");
				break;
			}
			System.out.print("입력된 내용 : " + lineStr);
			System.out.println();
		}
		br.close(); // 입력 스트림 닫기
	}
}
/* 실행 결과
입력해 주시기 바랍니다 : System.in에
입력된 내용 : System.in에
입력해 주시기 바랍니다 : 보조 스트림을 연결해서
입력된 내용 : 보조 스트림을 연결해서
입력해 주시기 바랍니다 : 편리하게 라인 단위로 입력 받을 수 있습니다.
입력된 내용 : 편리하게 라인 단위로 입력 받을 수 있습니다.
입력해 주시기 바랍니다 : q
프로그램이 종료 되었습니다!
*/
