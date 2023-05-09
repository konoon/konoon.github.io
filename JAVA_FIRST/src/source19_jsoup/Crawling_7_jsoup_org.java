package source19_jsoup;

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

// 임의의 특정 네이버 뉴스 웹사이트에 있는 정보와 이미지를 크롤링하는 자바 프로그램을 제작해 봅니다.
// 크롤링한 이미지는 C드라이브의 download 폴더에 저장합니다.
// C드라이브에 download 폴더를 생성하고, 소스 코딩 후에 Java Application을 실행 확인 바랍니다.
public class Crawling_7_jsoup_org {

		public String saveDir = null; // 저장 폴더 필드
		public String fileformat = null; // 파일 포맷 형식 필드
		public String url = null; // URL 주소 정보 필드
		public BufferedImage bi = null; // 버퍼 저장 이미지 필드
		public URL imageurl = null; // 이미지 URL 필드
		public String saveFileName = null; // 저장 파일 이름 필드
		Iterator<Element> titleInfo = null; // 이미지 타이틀 정보 필드
		Iterator<Element> imgName = null; // 이미지 이름 필드
		Iterator<Element> imgInfo = null; // 이미지 정보 필드
		
		// Document형의 doc 변수에 웹 페이지 전체 소스를 저장할 것이며, null로 초기화 처리함.
		private Document doc = null; 
		
		// url, 저장폴더, 파일 포맷 형식을 매개변수로 입력 받는 생성자 정의
		public Crawling_7_jsoup_org(String url, String saveDir, String fileformat) {
			this.url = url;
			this.fileformat = fileformat;
			this.saveDir = saveDir;
		}
		
		// 뉴스 리스트 정보값을 가져오는 getList() 메서드 정의
		public void getList() {
			try {
				// get() 메서드를 활용하여 url에서 크롤링한 정보를
				// Document 타입의 변수 doc에 대입함.
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				// Connection Fail 예외 처리
				e.printStackTrace();
			}
			// select() 메서드를 이용해서 원하는 태그를 선택합니다.
			// select() 메서드는 원하는 값을 가져오기 위한 중요한 기능입니다.
			Elements element = doc.select("div.list_body.newsflash_body");
			
			// titleInfo 변수 정보를 Iterator를 사용하여 하나씩 값을 읽어 옵니다.
			// li태그 안에 dl 태그 안에 dt 태그 안에 a 태그 값을 titleInfo 변수에 대입합니다.
			titleInfo = element.select("li dl dt a").iterator();
			
			// titleInfo 변수 정보를 while문을 활용하여 하나씩 반복해서 읽어 옵니다.
			while (titleInfo.hasNext()) {
				// li 태그 안에 dl 태그 안에 dt 태그 안에 a 태그값 안에 있는
				// 텍스트값을 화면으로 출력해 줍니다.
				System.out.println(titleInfo.next().text());
			}
		}
		
		// 이미지 다운 기능의 imageDown() 메서드 정의
		public void imageDown() throws Exception {
			Elements element = doc.select("div.list_body.newsflash_body");
			System.out.println("● element 변수 정보 = " + doc.select("div.list_body.newsflash_body"));
			imgName = element.select("img").iterator();
			System.out.println("◆ imgName 변수 정보 = " + element.select("img"));
			imgInfo = element.select("img").iterator();
			System.out.println("★ imgInfo 변수 정보 = " + imgInfo.next());
			System.out.println("★ imgInfo 변수 정보 = " + imgInfo.next().attr("src"));
			System.out.println("★ imgInfo 변수 정보 = " + imgInfo.next().attr("width"));
			
			System.out.println("=====================================================================");
			
			// 이미지 정보를 while 반복문으로 읽어 옵니다.
			while (imgInfo.hasNext()) {
				String image = imgInfo.next().attr("src");
				System.out.println("이미지 주소 = " + image);
				imageurl = new URL(image);
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
				
				// File 클래스를 활용하여 saveFile 변수에 saveDir 변수와
				// saveFileName 변수값을 대입 합니다.
				File saveFile = new File(saveDir + saveFileName);
				// saveFile 정보를 갖고 있는 fileformat 변수 형식의 bi 정보를
				//  ImageIO 클래스의 write() 를 활용하여 기록 저장합니다.
				ImageIO.write(bi, fileformat, saveFile);
			}
		}

		public static void main(String[] args) throws Exception {
		
			// Jsoup를 이용해서 네이버 경제 뉴스 리스트 크롤링		
			// Crawling_News_and_Image 생성자의 매개변수로 크롤링할 url, 저장위치, 이미지 파일형식을 지정해 줌.
			// 크롤링한 이미지 파일 다운로드 경로는 C드라이브에 download 폴더임.
			// JAVA Application 실행 전에 C드라이브에 download 폴더 만들어주시기 바랍니다.
			// crw 인스턴스에 웹크롤링 정보 객체를 생성하여 대입해 줍니다.
			Crawling_7_jsoup_org crw = new Crawling_7_jsoup_org("https://news.naver.com/main/list.nhn?mode=LS2D&mid=shm&sid1=101&sid2=263",
					"C:\\download\\", "jpg");
	
			System.out.println("=================================================================");
			// crw 인스턴스에 생성된 뉴스 리스트 정보값을 가져오는
			// getList() 메서드를 호출하여 정보를 표시합니다.
			crw.getList();
			System.out.println("=================================================================");
			// crw 인스턴스에 생성된 이미지 다운로드 데이터를
			// imageDown() 메서드를 호출하여 파일 저장 처리합니다.
			crw.imageDown();
			System.out.println("=================================================================");
	}
}
/* 실행 결과 : 2022년 6월 21일 아래 네이버 뉴스 기사 기준
https://news.naver.com/main/list.nhn?mode=LS2D&mid=shm&sid1=101&sid2=263
=================================================================

제주항공 화물 전용기 인천~하노이 첫 운항

[성공예감] ㄷㄱ마켓에 오토바이 매물 쏟아지는 이유는? – 매경이코노미 나건웅 기자

터키문화관광부 “수천년 역사 리비에라, 지중해 최고 관광지”

한국전자금융, 환경부 완속충전시설 보조사업자 선정

대선조선, 성호해운 화학제품 운반선 2척 명명식

손에 땀 쥔 15분42초…누리호 2차 발사 끝 하늘문 열었다

韓총리 “대한민국, 세계와 함께 미래 청사진 그릴 준비돼”

‘시장 프랜들리’로 文정부 주택정책 뒤집기… 부자감세 논란은 불씨

금융위 "대면 금융교육 재개…내년부터 금융역량조사도 실시"

임대료 최소화 위해… 다주택자도 최종 1주택 땐 양도세 비과세 [6·21 부동산 대책]

이주비 이자·손실보상비 등 반영… 아파트 분양가 최대 4% 오른다 [6·21 부동산 대책]

15억짜리 일시적 2주택자 종부세 3254만원 → 427만원 [6·21 부동산 대책]

우주기술 독립 12년 3개월 대장정… 한국형 발사체 누리호 도전史 [누리호 발사 성공]

코스피, 기관 매수에 2400선 회복…코스닥 1.09%↑

HiteJinro to file lawsuit against some truckers still on strike

대학의 꿈 ‘큐브위성’ 탑재… 한국 우주기술 검증 [누리호 발사 성공]

물가 年 5%대 공포… “기대인플레 못 잡으면 고물가 고착” [뉴스 투데이]

967초 후 위성모사체 분리 성공…"됐다, 가자" 환호 [누리호 발사 성공]

전세대란 없게…전셋값 5% 이내 인상 '상생임대인' 실거주 면제

100% 우리 힘으로 누리호 발사… 7대 우주 강국 ‘우뚝’
=================================================================
● element 변수 정보 = <div class="list_body newsflash_body"> 
 <ul class="type06_headline"> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/144/0000821239?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/144/2022/06/21/821239.jpg?type=nf106_72" width="106" height="72" alt="제주항공 화물 전용기 인천~하노이 첫 운항" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/144/0000821239?sid=101"> 제주항공 화물 전용기 인천~하노이 첫 운항 </a> 
    </dt> 
    <dd> 
     <span class="lede">제주항공(대표이사 김이배)이 지난 20일 인천~하노이 노선에서 첫 화물 전용기 운항을 시작으로 본격적인 항공화물 운송사업에 나섰 …</span> 
     <span class="writing">스포츠경향</span> 
     <span class="date is_new">1분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/056/0011287916?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/056/2022/06/21/11287916.jpg?type=nf106_72" width="106" height="72" alt="[성공예감] ㄷㄱ마켓에 오토바이 매물 쏟아지는 이유는? &#x2013; 매경이코노미 나건웅 기자" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/056/0011287916?sid=101"> [성공예감] ㄷㄱ마켓에 오토바이 매물 쏟아지는 이유는? &#x2013; 매경이코노미 나건웅 기자 </a> 
    </dt> 
    <dd> 
     <span class="lede">■ 인터뷰 자료의 저작권은 KBS라디오에 있습니다. 인용 보도 시 출처를 밝혀주시기를 바랍니다. ■ 프로그램명 : 성공예감 김방 …</span> 
     <span class="writing">KBS</span> 
     <span class="date is_new">4분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/082/0001161305?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/082/2022/06/21/1161305.jpg?type=nf106_72" width="106" height="72" alt="터키문화관광부 “수천년 역사 리비에라, 지중해 최고 관광지”" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/082/0001161305?sid=101"> 터키문화관광부 “수천년 역사 리비에라, 지중해 최고 관광지” </a> 
    </dt> 
    <dd> 
     <span class="lede">튀르키예(터키) 문화관광부는 지중해 연안에서 휴가를 즐기는 모습을 담은 튀르키예 리비에라 캠페인 영상을 유튜브를 통해 공개했다. …</span> 
     <span class="writing">부산일보</span> 
     <span class="date is_new">5분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/079/0003656232?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/079/2022/06/21/3656232.jpg?type=nf106_72" width="106" height="72" alt="한국전자금융, 환경부 완속충전시설 보조사업자 선정" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/079/0003656232?sid=101"> 한국전자금융, 환경부 완속충전시설 보조사업자 선정 </a> 
    </dt> 
    <dd> 
     <span class="lede">전기차 충전운영서비스인 '나이스 차저' 사업을 병행 중인 한국전자금융이 2022년 환경부 완속충전시설 보조사업 사업수행기관으로 …</span> 
     <span class="writing">노컷뉴스</span> 
     <span class="date is_new">5분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/001/0013260138?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/001/2022/06/21/13260138.jpg?type=nf106_72" width="106" height="72" alt="대선조선, 성호해운 화학제품 운반선 2척 명명식" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/001/0013260138?sid=101"> 대선조선, 성호해운 화학제품 운반선 2척 명명식 </a> 
    </dt> 
    <dd> 
     <span class="lede">대선조선이 성호해운으로부터 수주한 6천800t급 특수 화학제품 운반선 2척에 대한 명명식을 했다고 21일 밝혔다. 사진은 대선조 …</span> 
     <span class="writing">연합뉴스</span> 
     <span class="date is_new">5분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/025/0003203994?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/025/2022/06/21/3203994.jpg?type=nf106_72" width="106" height="72" alt="손에 땀 쥔 15분42초…누리호 2차 발사 끝 하늘문 열었다" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/025/0003203994?sid=101"> 손에 땀 쥔 15분42초…누리호 2차 발사 끝 하늘문 열었다 </a> 
    </dt> 
    <dd> 
     <span class="lede">한국형 발사체(누리호·KSLV-II)가 지구 상공 700㎞ 궤도에 위성을 올려놓는 데 성공했다. 설계와 제작, 시험과 발사 및 …</span> 
     <span class="writing">중앙일보</span> 
     <span class="date is_new">6분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/018/0005248250?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/018/2022/06/21/5248250.jpg?type=nf106_72" width="106" height="72" alt="韓총리 “대한민국, 세계와 함께 미래 청사진 그릴 준비돼”" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/018/0005248250?sid=101"> 韓총리 “대한민국, 세계와 함께 미래 청사진 그릴 준비돼” </a> 
    </dt> 
    <dd> 
     <span class="lede">한덕수 국무총리가 “대한민국 새 정부는 2030 부산세계박람회 유치에 강력한 의지를 가지고 있다”고 21일 말했다. 한 총리는 …</span> 
     <span class="writing">이데일리</span> 
     <span class="date is_new">10분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/081/0003281637?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/081/2022/06/21/3281637.jpg?type=nf106_72" width="106" height="72" alt="‘시장 프랜들리’로 文정부 주택정책 뒤집기… 부자감세 논란은 불씨" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/081/0003281637?sid=101"> ‘시장 프랜들리’로 文정부 주택정책 뒤집기… 부자감세 논란은 불씨 </a> 
    </dt> 
    <dd> 
     <span class="lede">윤석열 정부가 21일 첫 발표한 부동산 대책은 인센티브를 통한 전월세 시장 안정에 초점을 뒀다. 임대료를 5% 이내로 올린 집주 …</span> 
     <span class="writing">서울신문</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 4면의 기사입니다."><i class="picon">신문</i>4면 </span> 
     <span class="date is_new">11분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/374/0000291091?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/374/2022/06/21/291091.jpg?type=nf106_72" width="106" height="72" alt="금융위 &quot;대면 금융교육 재개…내년부터 금융역량조사도 실시&quot;" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/374/0000291091?sid=101"> 금융위 "대면 금융교육 재개…내년부터 금융역량조사도 실시" </a> 
    </dt> 
    <dd> 
     <span class="lede">금융위원회가 금융교육의 효과성을 높이기 위해 코로나19로 위축됐던 대면 금융교육을 재개하기로 했습니다. 금융위원회는 오늘(21일 …</span> 
     <span class="writing">SBS Biz</span> 
     <span class="date is_new">11분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707560?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707560.jpg?type=nf106_72" width="106" height="72" alt="임대료 최소화 위해… 다주택자도 최종 1주택 땐 양도세 비과세 [6·21 부동산 대책]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707560?sid=101"> 임대료 최소화 위해… 다주택자도 최종 1주택 땐 양도세 비과세 [6·21 부동산 대책] </a> 
    </dt> 
    <dd> 
     <span class="lede">‘임대차 시장 안정’ 방안은 기준시가 9억 이하 요건 없애 다주택자도 상생임대인 혜택 전세대출 1억8000만원으로 ↑ 신규 주택 …</span> 
     <span class="writing">세계일보</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A4면의 기사입니다."><i class="picon">신문</i>A4면 </span> 
     <span class="date is_new">11분전</span> 
    </dd> 
   </dl> </li> 
 </ul> 
 <ul class="type06"> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707559?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707559.jpg?type=nf106_72" width="106" height="72" alt="이주비 이자·손실보상비 등 반영… 아파트 분양가 최대 4% 오른다 [6·21 부동산 대책]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707559?sid=101"> 이주비 이자·손실보상비 등 반영… 아파트 분양가 최대 4% 오른다 [6·21 부동산 대책] </a> 
    </dt> 
    <dd> 
     <span class="lede">분양가상한제 개편안 자재비 변동사항 적기 반영 모집 공고 사업장부터 적용 21일 오후 둔촌 주공아파트 재건축 현장이 공사가 중단 …</span> 
     <span class="writing">세계일보</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A4면의 기사입니다."><i class="picon">신문</i>A4면 </span> 
     <span class="date is_new">11분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707558?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707558.jpg?type=nf106_72" width="106" height="72" alt="15억짜리 일시적 2주택자 종부세 3254만원 → 427만원 [6·21 부동산 대책]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707558?sid=101"> 15억짜리 일시적 2주택자 종부세 3254만원 → 427만원 [6·21 부동산 대책] </a> 
    </dt> 
    <dd> 
     <span class="lede">1세대 1주택자 요건 완화 생애 최초 주택 구입 땐 200만원까지 취득세 감면 21일 서울 시내 한 부동산 중개업소에 ‘급매’와 …</span> 
     <span class="writing">세계일보</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A4면의 기사입니다."><i class="picon">신문</i>A4면 </span> 
     <span class="date is_new">12분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707557?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707557.jpg?type=nf106_72" width="106" height="72" alt="우주기술 독립 12년 3개월 대장정… 한국형 발사체 누리호 도전史 [누리호 발사 성공]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707557?sid=101"> 우주기술 독립 12년 3개월 대장정… 한국형 발사체 누리호 도전史 [누리호 발사 성공] </a> 
    </dt> 
    <dd> 
     <span class="lede">1차 땐 궤도안착 실패 ‘절반의 성공’ 순수 국내기술로 제작된 한국형 최초 우주발사체 '누리호'(KSLV-Ⅱ)'가 21일 전남 …</span> 
     <span class="writing">세계일보</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A3면의 기사입니다."><i class="picon">신문</i>A3면 </span> 
     <span class="date is_new">12분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/374/0000291090?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/374/2022/06/21/291090.jpg?type=nf106_72" width="106" height="72" alt="코스피, 기관 매수에 2400선 회복…코스닥 1.09%↑" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/374/0000291090?sid=101"> 코스피, 기관 매수에 2400선 회복…코스닥 1.09%↑ </a> 
    </dt> 
    <dd> 
     <span class="lede">코스피가 기관투자자 매수에 힘입어 2400선을 회복했습니다. 오늘 코스피 지수는 어제보다 0.75% 오른 2408.93에 마감했 …</span> 
     <span class="writing">SBS Biz</span> 
     <span class="date is_new">12분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/640/0000025689?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/640/2022/06/21/25689.jpg?type=nf106_72" width="106" height="72" alt="HiteJinro to file lawsuit against some truckers still on strike" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/640/0000025689?sid=101"> HiteJinro to file lawsuit against some truckers still on strike </a> 
    </dt> 
    <dd> 
     <span class="lede">HiteJinro announced Tuesday it filed a lawsuit against truckers who com …</span> 
     <span class="writing">코리아중앙데일리</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A5면의 기사입니다."><i class="picon">신문</i>A5면 </span> 
     <span class="date is_new">12분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707556?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707556.jpg?type=nf106_72" width="106" height="72" alt="대학의 꿈 ‘큐브위성’ 탑재… 한국 우주기술 검증 [누리호 발사 성공]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707556?sid=101"> 대학의 꿈 ‘큐브위성’ 탑재… 한국 우주기술 검증 [누리호 발사 성공] </a> 
    </dt> 
    <dd> 
     <span class="lede">카이스트·조선·연세·서울대 개발 실제 작동… 궤도 안착 후 임무수행 순수 국내기술로 제작된 한국형 최초 우주발사체 '누리호'(K …</span> 
     <span class="writing">세계일보</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A3면의 기사입니다."><i class="picon">신문</i>A3면 </span> 
     <span class="date is_new">12분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707555?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707555.jpg?type=nf106_72" width="106" height="72" alt="물가 年 5%대 공포… “기대인플레 못 잡으면 고물가 고착” [뉴스 투데이]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707555?sid=101"> 물가 年 5%대 공포… “기대인플레 못 잡으면 고물가 고착” [뉴스 투데이] </a> 
    </dt> 
    <dd> 
     <span class="lede">韓銀 “물가 4.7% 넘어설 듯” 이창용 “공급충격 장기화 전망” 3분기 이후까지 고물가 우려 커 물가중심 통화정책 운용 재강조 …</span> 
     <span class="writing">세계일보</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A2면의 기사입니다."><i class="picon">신문</i>A2면 </span> 
     <span class="date is_new">12분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707554?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707554.jpg?type=nf106_72" width="106" height="72" alt="967초 후 위성모사체 분리 성공…&quot;됐다, 가자&quot; 환호 [누리호 발사 성공]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707554?sid=101"> 967초 후 위성모사체 분리 성공…"됐다, 가자" 환호 [누리호 발사 성공] </a> 
    </dt> 
    <dd> 
     <span class="lede">전국서 ‘뜨거운 응원’ 고흥우주발사전망대 시민들 ‘북적’ 무더운 날씨에도 태극기 들고 직관 127초 1단 분리… 233초 페어링 …</span> 
     <span class="writing">세계일보</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A3면의 기사입니다."><i class="picon">신문</i>A3면 </span> 
     <span class="date is_new">12분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707550?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707550.jpg?type=nf106_72" width="106" height="72" alt="전세대란 없게…전셋값 5% 이내 인상 '상생임대인' 실거주 면제" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707550?sid=101"> 전세대란 없게…전셋값 5% 이내 인상 '상생임대인' 실거주 면제 </a> 
    </dt> 
    <dd> 
     <span class="lede">尹정부 첫 부동산대책 발표 갱신 계약 8월부터 만료 앞두고 1주택 양도세 비과세 요건 완화 세입자는 버팀목 대출 한도 확대 서울 …</span> 
     <span class="writing">세계일보</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A1면의 기사입니다."><i class="picon">신문</i>A1면 </span> 
     <span class="date is_new">13분전</span> 
    </dd> 
   </dl> </li> 
  <li> 
   <dl> 
    <dt class="photo"> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707549?sid=101"> <img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707549.jpg?type=nf106_72" width="106" height="72" alt="100% 우리 힘으로 누리호 발사… 7대 우주 강국 ‘우뚝’" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';"> </a> 
    </dt> 
    <dt> 
     <a href="https://n.news.naver.com/mnews/article/022/0003707549?sid=101"> 100% 우리 힘으로 누리호 발사… 7대 우주 강국 ‘우뚝’ </a> 
    </dt> 
    <dd> 
     <span class="lede">누리호 발사 성공… 우주개발 30년 새 이정표 1차 ‘절반의 성공’ 8개월 만에 ‘나로호’ 이후 9년 만에 쾌거 위성모사체·성능 …</span> 
     <span class="writing">세계일보</span> 
     <span class="newspaper_info" title="신문에 게재되었으며 A1면의 기사입니다."><i class="picon">신문</i>A1면 </span> 
     <span class="date is_new">14분전</span> 
    </dd> 
   </dl> </li> 
 </ul> 
</div>
◆ imgName 변수 정보 = <img src="https://imgnews.pstatic.net/image/origin/144/2022/06/21/821239.jpg?type=nf106_72" width="106" height="72" alt="제주항공 화물 전용기 인천~하노이 첫 운항" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/056/2022/06/21/11287916.jpg?type=nf106_72" width="106" height="72" alt="[성공예감] ㄷㄱ마켓에 오토바이 매물 쏟아지는 이유는? &#x2013; 매경이코노미 나건웅 기자" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/082/2022/06/21/1161305.jpg?type=nf106_72" width="106" height="72" alt="터키문화관광부 “수천년 역사 리비에라, 지중해 최고 관광지”" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/079/2022/06/21/3656232.jpg?type=nf106_72" width="106" height="72" alt="한국전자금융, 환경부 완속충전시설 보조사업자 선정" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/001/2022/06/21/13260138.jpg?type=nf106_72" width="106" height="72" alt="대선조선, 성호해운 화학제품 운반선 2척 명명식" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/025/2022/06/21/3203994.jpg?type=nf106_72" width="106" height="72" alt="손에 땀 쥔 15분42초…누리호 2차 발사 끝 하늘문 열었다" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/018/2022/06/21/5248250.jpg?type=nf106_72" width="106" height="72" alt="韓총리 “대한민국, 세계와 함께 미래 청사진 그릴 준비돼”" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/081/2022/06/21/3281637.jpg?type=nf106_72" width="106" height="72" alt="‘시장 프랜들리’로 文정부 주택정책 뒤집기… 부자감세 논란은 불씨" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/374/2022/06/21/291091.jpg?type=nf106_72" width="106" height="72" alt="금융위 &quot;대면 금융교육 재개…내년부터 금융역량조사도 실시&quot;" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707560.jpg?type=nf106_72" width="106" height="72" alt="임대료 최소화 위해… 다주택자도 최종 1주택 땐 양도세 비과세 [6·21 부동산 대책]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707559.jpg?type=nf106_72" width="106" height="72" alt="이주비 이자·손실보상비 등 반영… 아파트 분양가 최대 4% 오른다 [6·21 부동산 대책]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707558.jpg?type=nf106_72" width="106" height="72" alt="15억짜리 일시적 2주택자 종부세 3254만원 → 427만원 [6·21 부동산 대책]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707557.jpg?type=nf106_72" width="106" height="72" alt="우주기술 독립 12년 3개월 대장정… 한국형 발사체 누리호 도전史 [누리호 발사 성공]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/374/2022/06/21/291090.jpg?type=nf106_72" width="106" height="72" alt="코스피, 기관 매수에 2400선 회복…코스닥 1.09%↑" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/640/2022/06/21/25689.jpg?type=nf106_72" width="106" height="72" alt="HiteJinro to file lawsuit against some truckers still on strike" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707556.jpg?type=nf106_72" width="106" height="72" alt="대학의 꿈 ‘큐브위성’ 탑재… 한국 우주기술 검증 [누리호 발사 성공]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707555.jpg?type=nf106_72" width="106" height="72" alt="물가 年 5%대 공포… “기대인플레 못 잡으면 고물가 고착” [뉴스 투데이]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707554.jpg?type=nf106_72" width="106" height="72" alt="967초 후 위성모사체 분리 성공…&quot;됐다, 가자&quot; 환호 [누리호 발사 성공]" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707550.jpg?type=nf106_72" width="106" height="72" alt="전세대란 없게…전셋값 5% 이내 인상 '상생임대인' 실거주 면제" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
<img src="https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707549.jpg?type=nf106_72" width="106" height="72" alt="100% 우리 힘으로 누리호 발사… 7대 우주 강국 ‘우뚝’" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
★ imgInfo 변수 정보 = <img src="https://imgnews.pstatic.net/image/origin/144/2022/06/21/821239.jpg?type=nf106_72" width="106" height="72" alt="제주항공 화물 전용기 인천~하노이 첫 운항" onError="javascript:this.src='https://ssl.pstatic.net/static.news/image/news/2009/noimage_106x72.png';">
★ imgInfo 변수 정보 = https://imgnews.pstatic.net/image/origin/056/2022/06/21/11287916.jpg?type=nf106_72
★ imgInfo 변수 정보 = 106
=====================================================================
이미지 주소 = https://imgnews.pstatic.net/image/origin/079/2022/06/21/3656232.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/001/2022/06/21/13260138.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/025/2022/06/21/3203994.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/018/2022/06/21/5248250.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/081/2022/06/21/3281637.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/374/2022/06/21/291091.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707560.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707559.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707558.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707557.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/374/2022/06/21/291090.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/640/2022/06/21/25689.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707556.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707555.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707554.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707550.jpg?type=nf106_72
이미지 주소 = https://imgnews.pstatic.net/image/origin/022/2022/06/21/3707549.jpg?type=nf106_72
=================================================================


*/
