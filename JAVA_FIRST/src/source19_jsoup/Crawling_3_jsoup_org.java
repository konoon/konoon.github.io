package source19_jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// https://jsoup.org/cookbook/input/load-document-from-url
// jSoup 공식 예문 실행 확인
// http://example.com/ 웹사이트 활용 예시

public class Crawling_3_jsoup_org {
	public static void main(String[] args) throws Exception {

		// http://example.com/ 웹사이트 정보를 크롤링해서
		// Document 타입의 doc 변수에 대입 합니다.
		Document doc = Jsoup.connect("http://example.com/").get();
		// doc 변수에 대입된 크롤링 정보를 화면으로 출력 표시해 줍니다.
//		System.out.println(doc);
		// doc 변수에 대입된 title 태그 정보를 String 타입의 title 변수에 대입해 줍니다. 
		String title = doc.title();
		// title 변수에 대입된 example.com 웹사이트의 title 태그 값 정보를 화면으로
		// 출력해 줍니다.
		System.out.println("example.com 웹사이트의 title 태그 값 = " + title);
	}
}
