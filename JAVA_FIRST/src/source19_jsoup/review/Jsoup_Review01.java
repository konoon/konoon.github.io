package source19_jsoup.review;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// 웹 크롤링 고려사항
// 1. 웹 크롤링이 막혀 있거나 이미지(또는 텍스트) 소스가 개별 코드로 분리되어 있을 경우에는 크롤링이 어려울 수 있음.
// 2. 웹 크롤링 대상 서버에 심한 부하를 주지 않도록 배려
// 3. 웹 크롤링 추출 콘텐츠의 저작권을 보호

public class Jsoup_Review01 {

	public static void main(String[] args) throws IOException {
		// http://example.com/ 사이트에서 크롤링
		String url = "http://example.com/";
		Document doc = Jsoup.connect(url).get();
//		System.out.println(doc);
		
		// example.com 웹사이트 첫번째 a 태그 정보를 link변수에 대입
		Element link = doc.select("a").first();
//		System.out.println(link);
		
		// Element(요소)의 텍스트 노드값을 리턴
		String text = doc.body().text();
//		System.out.println(text);
		
		String linkText = link.text();
//		System.out.println(linkText);
		
		String linkHref = link.attr("href");
		System.out.println(linkHref);
	}

}
