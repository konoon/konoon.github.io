package source19_jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// https://jsoup.org/cookbook/input/parse-document-from-string
// jSoup 공식 예문 실행 확인
public class Crawling_2_jsoup_org {

	public static void main(String[] args) {

		String html = "<html><head><title>First parse</title></head>"
				  + "<body><p>Parsed HTML into a doc.</p></body></html>";
				Document doc = Jsoup.parse(html);
				
				System.out.println(doc);
	}
}

/* 실행 결과
<html>
 <head>
  <title>First parse</title>
 </head>
 <body>
  <p>Parsed HTML into a doc.</p>
 </body>
</html>
*/