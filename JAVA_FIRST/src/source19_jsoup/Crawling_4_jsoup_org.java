package source19_jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// https://jsoup.org/cookbook/extracting-data/attributes-text-html
// jSoup 공식 예문 실행 확인
// http://example.com/ 웹사이트 활용 예시

public class Crawling_4_jsoup_org {
	public static void main(String[] args) throws Exception {

		// http://example.com/ 웹사이트 정보를 크롤링해서
		// Document 타입의 doc 변수에 대입 합니다.
		Document doc = Jsoup.connect("http://example.com/").get();
		
		// example.com 웹사이트에서 첫번째 a 태그 정보를 link 변수 대입해 줌.
		Element link = doc.select("a").first();
		System.out.println(link);
		
		// Element요소.text(); = 엘리먼트 요소의 텍스트 노드값을 리턴 처리함
		String text = doc.body().text();
//		System.out.println(text);
		
		// Element요소.attr("속성이름"); = 엘리먼트 요소의 "속성이름"에 대한 값을 리턴 처리함 
		String linkHref = link.attr("href");
//		System.out.println(linkHref);
		
		String linkText = link.text();
//		System.out.println(linkText);
		
		// Element요소.outerHtml(); = 엘리먼트 요소의 값을 리턴 처리함(태그와 값 모두) 
		String linkOuterH = link.outerHtml();
//		System.out.println(linkOuterH);
		
		// Element요소.html(); = 엘리먼트 요소의 값을 리턴 처리함
		String linkInnerH = link.html();
//		System.out.println(linkInnerH);		
	}
}

/* 실행 결과
<a href="https://www.iana.org/domains/example">More information...</a>
*/

