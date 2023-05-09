package source19_jsoup.review;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// 망고플레이트의 부산 이탈리안 맛집 베스트 7곳 URL에 있는
// 정보와 이미지를 크롤링하는 자바 프로그램을 제작해 봅니다.
// https://www.mangoplate.com/top_lists/1825_busan_italian
// 크롤링한 이미지는 C드라이브의 tasteimages 폴더에 저장합니다.
// C드라이브에 tasteimages 폴더를 생성하고, 소스 코딩 후에 Java Application을 실행 확인 바랍니다.
public class Jsoup_Review03 {
		
		public String saveDir = null; // 저장 폴더 필드
		public String fileformat = null; // 파일 포맷 형식 필드
		public String url = null; // URL 주소 정보 필드
		// import java.awt.image.BufferedImage;
		public BufferedImage bi = null; // 버퍼 저장 이미지 필드
		// import java.net.URL;
		public URL imageurl = null; // 이미지 URL 필드
		public String saveFileName = null; // 저장 파일 이름 필드
		Iterator<Element> titleInfo = null; // 이미지 타이틀 정보 필드
		Iterator<Element> imgName = null; // 이미지 이름 정보 필드
		Iterator<Element> imgInfo = null; // 이미지 정보 필드
		
		// Document 형의 doc 변수에 웹 페이지 전체 소스 정보를 저장할 것이며,
		// null로 초기화 처리합니다.
		private Document doc = null;
		
		// url 정보를 매개변수로 입력 받는 생성자 정의
		public Jsoup_Review03(String url) {
			this.url = url;
		}
		
		// 저장폴더, 파일 포맷 형식, url을 매개변수로 입력 받는 생성자 정의
		public Jsoup_Review03(String saveDir, String fileformat, String url) {
			this.saveDir = saveDir;
			this.fileformat = fileformat;
			this.url = url;
		}
		
		// 맛집 리스트 정보값을 가져오는 getList() 메서드 정의
		public void getList() {
			
			try {
				// connect() 메서드로 크롤링할 웹페이지를 연결해주고
				// get() 메서드를 활용하여 url에 크롤링한 정보를
				// Document 타입의 변수 doc에 대입함.
				doc = Jsoup.connect(url).get();
//				System.out.println(doc);
				
				
			} catch (Exception e) {
				// Connection Fail 예외 처리
				e.printStackTrace();
			}
			
			// select() 메서드를 이용해서 원하는 태그를 선택합니다.
			// select() 메서드는 원하는 값을 가져오기 위한 중요한 기능입니다.
			Elements element = doc.select("div.with-review");
//			System.out.println(element);
			
			// titleInfo 변수 정보를 Iterator를 사용하여 하나씩 값을 읽어 옵니다.
			// figure 태그 안에 restaurant-item 클래스 안에 a 태그 값을
			// titleInfo 변수에 대입합니다.
			titleInfo = element.select("figure.restaurant-item a").iterator();
			// titleInfo 변수 정보를 while문을 활용하여 하나씩 반복해서 읽어 옵니다.
			while (titleInfo.hasNext()) {
//				System.out.println(titleInfo.next());
				System.out.println(titleInfo.next().text());
			}
		}

		// 이미지 다운 기능의 imageDown() 메서드 정의
		public void imageDown() throws IOException {
			Elements element = doc.select("div.with-review");
			System.out.println("● element 변수 정보 = " + doc.select("div.with-review"));
			imgName = element.select("img").iterator();
			System.out.println("◆ imgName 변수 정보 = " + doc.select("img"));
			imgInfo = element.select("img").iterator();
			
			System.out.println("==========================================================");
			
			// 이미지 정보를 while 반복문으로 읽어 옵니다.
			while (imgInfo.hasNext()) {
				String image = imgInfo.next().attr("data-original");
				System.out.println("이미지 주소 = " + image);
				imageurl = new URL(image);
				// import javax.imageio.ImageIO;
				// ImageIO 클래스의 read() 메서드를 활용하여
				// 이미지 정보를 읽어들여서 버퍼 이미지 변수에 대입합니다.
				bi = ImageIO.read(imageurl);
				
				// saveFileName 변수에 파일명 저장 시 윈도우 파일명에 들어가지 못하는
				// 특수문자들 /:*?"<>|\
				// 윈도우 파일명에 /:*?"<>|\ 특수문자들 중에서 한개를 넣어보시기 바랍니다.
				// 그러면, 에러 메시지가 나타납니다.
				// saveFileName 변수에 파일명 저장 시 윈도우 파일명에 사용 가능한
				// 특수문자들로 replace() 메서드를 활용해서 치환 처리해 줍니다.
				// 윈도우 파일명에 .;..'().. 특수문자들을 넣어보시기 바랍니다. 파일명이 저장됩니다.
				// saveFileName = replace("/", ".").replace(":", ";").replace("*", ".").replace("?", ".")
				// .replace("\"", "'").replace("<", "(").replace(">", ")").replace("|", ".").replace("\\", ".") + ".jpg";
				// "중요) 이미지 이름에 들어가지 못하는 특수문자 replace 메서드 치환 예시.jpg" 이미지도 함께 참고 바랍니다.			
				saveFileName = imgName.next().attr("alt").replace("/", ".").replace(":", ";").replace("*", ".").replace("?", ".").
				replace("\"", "'").replace("<", "(").replace(">", ")").
				replace("|", ".").replace("\\", ".") + ".jpg";
				
				// import java.io.File;
				// File 클래스를 활용하여 saveFile 변수에 saveDir 변수와
				// saveFileName 변수값을 대입합니다.
				File saveFile = new File(saveDir + saveFileName);
				// saveFile 정보를 갖고 있는 fileformat 변수 형식의 bi 정보를
				// ImageIO 클래스의 write()를 활용하여 기록 저장합니다.
				ImageIO.write(bi, fileformat, saveFile);
			}
		}
		
		public static void main(String[] args) throws IOException {
			String inputUrl = "https://www.mangoplate.com/top_lists/971_milk_bingsu";

			// 우유빙수 맛집 베스트 15곳 https://www.mangoplate.com/top_lists/971_milk_bingsu
//			String inputUrl = "https://www.mangoplate.com/top_lists/1825_busan_italian";
			
			// Jsoup_Review03 생성자의 매개변수로 크롤링할 url을 지정해 줌.
//			Jsoup_Review03 test = new Jsoup_Review03(inputUrl);
		    // test 인스턴에 생성된 맛집 리스트 정보값을
			// getList() 메서드를 호출하여 화면으로 출력함.
//			test.getList();
			
			Jsoup_Review03 crw = new Jsoup_Review03("c:\\tasteimages\\", "jpg", inputUrl);
			
			// crw 인스턴스에 생성된 맛집 리스트 정보값을 가져오는
			// getList() 메서드를 호출하여 정보를 표시합니다.
			crw.getList();
			System.out.println("==========================================================");
			// crw 인스턴에 생성된 이미지 다운로드 데이터를
			// imageDown() 메서드를 호출하여 파일 저장 처리합니다.
			crw.imageDown();
		}
}
