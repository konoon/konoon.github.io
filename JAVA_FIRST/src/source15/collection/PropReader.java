package source15.collection;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Properties;

// 실무에서 자바 설정파일의 경우, 개발 환경 설정 시 해당 정보를 프로퍼티로 만들고 필요할때만 읽어서 사용합니다. 해당 정보들은 자바 클래스 파일에 지정해 둘 경우, 정보가 변경되면 컴파일을 다시 해줘야 하는 등의 번거로움이 있기에 프로퍼티 활용을 권장함. 보통, DB 접속 정보나 특정 모듈의 경로 정보, 로그 파일의 위치 정보와 같은 내용을 프로터티에 기재해서 활용 자바 에서 프로퍼티 파일로는 텍스트 형식과 xml형식이 있습니다. 우리는 텍스트 형식을 활용해 봅니다 텍스트 형식의 properties파일의 경우, 일반 텍스트 형식의 파일에 확장자는 .properties로 설정

public class PropReader {
	public static void main(String[] args) {
		 try {
			// 프로퍼티 파일 위치 지정
			String proFile = "c:/Test/config.properties";
			
			// 프로퍼티 객체 생성
			Properties props = new Properties();
			
			// 프로퍼티 파일 스트림에 담기
			FileInputStream fis = new FileInputStream(proFile);
			
			// 프로퍼티 파일 로딩
			props.load(new BufferedInputStream(fis));
			
			// 항목 읽기
			String msg = props.getProperty("TEST");
			
			// 콘솔 출력 확인
			System.out.println(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
