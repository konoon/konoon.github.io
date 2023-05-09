package source19_jsoup.review;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// https://www.bbq.co.kr/brand/noticeList.asp 사이트 정보 크롤링

public class Jsoup_Review02 {

	public static void main(String[] args) {
		try {
			String URL = "https://www.bbq.co.kr/brand/noticeList.asp";
			// connect() 메서드로 Connection객체 생성
			Connection conn = Jsoup.connect(URL);
			// System.out.println(conn);
			Document html = conn.get();
			// System.out.println(html);
			System.out.println("[Attribute 정보 탐색]");
			Elements fileblocks = html.getElementsByClass("ta-l");
//			System.out.println(fileblocks);
			
			for (Element fileblock : fileblocks) {
				Elements files = fileblock.getElementsByTag("a");
				for (Element elm : files) {
					String text = elm.text();
//					System.out.println(text);
					String href = elm.attr("href");
//					System.out.println(href);
				}
			}
			
			System.out.println("\n[CSS Selector 탐색]");
			Elements files = html.select(".ta-l a");
//			System.out.println(files);
			
			for (Element elm : files) {
				String href = elm.attr("href");
//				System.out.println(href);
				String text = elm.text();
				System.out.println(text);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
