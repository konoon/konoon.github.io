package source19_jsoup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// https://www.bbq.co.kr/brand/bbq.asp 웹사이트의 정보를
// 크롤링하는 자바 프로그램 제작
public class Crawling_6_jsoup_org {
	public static void main(String[] args) {
		
		try {
			// 1) 크롤링 정보 수집 대상 URL을 지정하여
			//    String 형식의 문자열 변수 URL에 대입합니다.
			String URL = "https://www.bbq.co.kr/brand/bbq.asp";			
//			System.out.println(URL);
			
			// 2) Jsoup 클래스의 connect() 메서드로
			//    URL 연결 접속 Connection을 생성합니다.
			Connection conn = Jsoup.connect(URL);
//			System.out.println(conn);
			
			// 3) Connection 생성 연결 객체 정보를 바탕으로
			//    HTML 정보를 파싱해 옵니다.
			Document html = conn.get();			
			System.out.println(html);
			System.out.println("====================================================================");
			// 4) 요소(Element) 정보 탐색
			// 4-1) Attribute 정보 탐색
			System.out.println("[Attribute 탐색]");
			Elements fileblocks = html.getElementsByClass("ddak_font");
//			System.out.println(fileblocks);
			// for문으로 fileblocks에 저장된 ddak_font 클래스 정보를 화면으로 출력합니다.
			for (Element fileblock : fileblocks) {
				Elements files = fileblock.getElementsByTag("a");
				for (Element elm : files) {
					// fileblock에 저장된 텍스트 노드 요소 정보를 text 변수에 대입합니다.
					String text = elm.text();
					// fileblock에 저장된 href 속성의 값을 href 변수에 대입합니다. 
					String href = elm.attr("href");
					// text 변수 내용과 href 변수 내용을 화면으로 출력 표시해 줍니다.
					System.out.println(text + " => " + href);
				}
			}

			// 4-2) CSS Selector 정보 탐색
			System.out.println("\n[CSS Selector 탐색]");
			// footer-sns 클래스 안에 있는 a 태그의 정보를 files 변수에 대입 합니다.
			Elements files = html.select(".footer-sns a");
			// for문으로 files에 저장된 footer-sns 클래스 안에 있는
			// a 태그 정보를 화면으로 출력합니다.
			for (Element elm : files) {
				String href = elm.attr("href");
				// footer-sns 클래스 안에 있는
				// a 태그 정보의 화면 출력 형식 = href
				System.out.println("footer-sns 클래스 안에 있는 a 태그의 href 정보 = " + href);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/* 실행 결과
<!doctype html>
<html lang="ko">
 <head> 
  <meta charset="utf-8"> 
  <meta name="format-detection" content="telephone=no"> 
  <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
  <meta name="Keywords" content="BBQ치킨"> 
  <meta name="Description" content="BBQ치킨"> 
  <meta name="Classification" content=""> 
  <title>BBQ치킨</title>
  <link rel="stylesheet" href="/common/css/base.css?ver=20211202"> 
  <link rel="stylesheet" href="/common/css/ui_style.css?ver=20211202"> 
  <link rel="stylesheet" href="/common/css/common.css?ver=20211202"> 
  <link rel="stylesheet" href="/common/css/layout.css?ver=20211202"> 
  <link rel="stylesheet" href="/common/css/content.css?ver=20211202"> 
  <link rel="stylesheet" href="/common/css/global.css?ver=20211202"> 
  <script type="text/javascript">
	var g2_bbq_a_url = "https://webadmin.genesiskorea.co.kr:444";
	var g2_bbq_d_url = "https://www.bbq.co.kr";
	var g2_bbq_m_url = "https://m.bbq.co.kr";

	var g2_bbq_img_url = "https://img.bbq.co.kr:449/uploads/bbq_d";

	
		var juso_api_url = 'https://www.juso.go.kr/addrlink/addrLinkApiJsonp.do';
		var juso_api_xy_url = 'https://www.juso.go.kr/addrlink/addrCoordApiJsonp.do';
	
		var g_test_user = "N";
	
</script> 
  <script src="/common/js/libs/jquery-1.12.4.min.js"></script> 
  <script src="/common/js/libs/jquery-ui-1.12.1.js"></script> 
  <script src="/common/js/libs/jquery.nicescroll.min.js"></script> 
  <script src="/common/js/common.js?ver=20220621173051"></script> 
  <script src="/common/js/global.js?ver=20220621173051"></script> 
  <script src="/api/common/functions.js?ver=20220621173051"></script> 
  <script src="/common/js/functions.js?ver=20220621173051"></script> 
  <script src="/common/js/jquery.blockUI.js?ver=20220621173051"></script> 
  <script src="/common/js/jquery.bPopup.js?ver=20220621173051"></script> 
  <script type="text/javascript">
    var isLoggedIn = false;
    var returnUrl = "/brand/bbq.asp";
</script> 
  <!-- Facebook Pixel Code --> 
  <script>
!function(f,b,e,v,n,t,s)
{if(f.fbq)return;n=f.fbq=function(){n.callMethod?n.callMethod.apply(n,arguments):n.queue.push(arguments)};if(!f._fbq)f._fbq=n;n.push=n;n.loaded=!0;n.version='2.0';n.queue=[];t=b.createElement(e);t.async=!0;t.src=v;s=b.getElementsByTagName(e)[0];s.parentNode.insertBefore(t,s)}(window, document,'script','https://connect.facebook.net/en_US/fbevents.js');
fbq('init', '2714406355544757');
fbq('track', 'PageView');

</script> 
  <noscript>
   &lt;img height="1" width="1" style="display:none" src="https://www.facebook.com/tr?id=2714406355544757&amp;amp;ev=PageView&amp;amp;noscript=1"&gt;
  </noscript> 
  <!-- End Facebook Pixel Code --> 
  <!--
<script type="text/javascript" charset="UTF-8" src="//t1.daumcdn.net/adfit/static/kp.js"></script>
<script type="text/javascript">
      kakaoPixel('1188504223027052596').pageView();
	  
</script>
--> 
  <!-- Global site tag (gtag.js) - Google Analytics --> 
  <script async src="https://www.googletagmanager.com/gtag/js?id=UA-39768002-1"></script> 
  <script>
	window.dataLayer = window.dataLayer || [];
	function gtag(){dataLayer.push(arguments);}
	gtag('js', new Date());

	gtag('config', 'UA-39768002-1');

	
</script> 
  <!-- Layer Popup : 알림창1 --> 
 </head>
 <body>
  <div id="lp_alert" class="lp-wrapper" style="display: none;z-index:2000"> 
   <!-- LP Wrap --> 
   <div class="lp-wrap"> 
    <div class="lp-confirm"> 
     <div class="lp-confirm-cont type1"> 
      <p class="lp-msg">메시지</p> 
     </div> 
     <div class="btn-wrap"> 
      <button type="submit" class="btn btn-flat btn-red">확인</button> 
     </div> 
     <button type="button" class="btn btn_lp_close"><span>레이어팝업 닫기</span></button> 
    </div> 
   </div> 
   <!--// LP Wrap --> 
  </div> 
  <!--// Layer Popup --> 
  <!-- Layer Popup : 알림창2 --> 
  <div id="lp_confirm" class="lp-wrapper" style="display: none;"> 
   <!-- LP Wrap --> 
   <div class="lp-wrap"> 
    <div class="lp-confirm"> 
     <div class="lp-confirm-cont type2"> 
      <p class="lp-msg">메시지</p> 
     </div> 
     <div class="btn-wrap two-up"> 
      <button type="submit" class="btn btn-flat btn-red">확인</button> 
      <button type="submit" class="btn btn-flat btn-gray" onclick="lpClose(this);">취소</button> 
     </div> 
     <button type="button" class="btn btn_lp_close"><span>레이어팝업 닫기</span></button> 
    </div> 
   </div> 
   <!--// LP Wrap --> 
  </div> 
  <!--// Layer Popup --> 
  <!-- Layer Popup : 알림창4 --> 
  <div id="lp_cart" class="lp-wrapper"> 
   <!-- LP Wrap --> 
   <div class="lp-wrap"> 
    <div class="lp-confirm"> 
     <div class="lp-confirm-cont type2"> 
      <p class="lp-msg has-ico ico-cart">선택한 메뉴가 장바구니에 담겼습니다.<br> 장바구니로 이동하시겠습니까?</p> 
     </div> 
     <div class="btn-wrap two-up"> 
      <button type="submit" class="btn btn-flat btn-red" onclick="location.href='/order/cart.asp';">이동</button> 
      <button type="submit" class="btn btn-flat btn-gray" onclick="lpClose(this);">머물기</button> 
     </div> 
     <button type="button" class="btn btn_lp_close"><span>레이어팝업 닫기</span></button> 
    </div> 
   </div> 
   <!--// LP Wrap --> 
  </div> 
  <!--// Layer Popup --> 
  <!-- Layer Popup : 알림창5 --> 
  <div id="lp_member" class="lp-wrapper"> 
   <!-- LP Wrap --> 
   <div class="lp-wrap"> 
    <div class="lp-confirm"> 
     <div class="lp-confirm-cont type2"> 
      <div class="lp-msg"> 
       <!-- 딹 멤버십 안내  --> 
       <section class="section"> 
        <div class="section-header"> 
         <h3><span class="ddack">딹</span> 멤버십 안내</h3> 
        </div> 
        <div class="section-body"> 
         <div class="ddack-memFAQ"> 
          <dl class="benefit"> 
           <dt>
            <span class="ddack-mem">딹</span>
            <span class="txt">멤버십회원의 혜택?</span>
           </dt> 
           <dd>
            구매금액의 5% 포인트 적립 / 이벤트 및 쿠폰 등의 다양한 서비스를 제공 받으실 수 있습니다.
           </dd> 
          </dl> 
          <dl class="join"> 
           <dt>
            <span class="ddack-mem">딹</span>
            <span class="txt">멤버십에 가입하려면?</span>
           </dt> 
           <dd class="check"> 
            <div> 
             <h4>CHECH.1 회원가입</h4> 
             <p>BBQ 홈페이지 또는 모바일 앱에서 회원가입을 합니다.</p> 
            </div> 
            <div> 
             <h4>CHECH.2 회원가입</h4> 
             <p>포인트적립은 구매시점으로부터 최소 72시간 최대 1주일이내 적립됩니다(영업일기준)</p> 
            </div> 
           </dd> 
          </dl> 
          <dl class="reserve"> 
           <dt>
            <span class="ddack-mem">딹</span>
            <span class="txt">포인트 적립 기준은 무엇인가요?</span>
           </dt> 
           <dd> 
            <p> <span class="ddack">딹</span>포인트는 BBQ홈페이지, BBQ앱, BBQ가맹점 전화번호로 인입된 주문의 실 결제금액의 5%적립을 원칙으로 합니다.<br>(단, 주류, 음료, 배달서비스 결제금액은 제외됩니다) </p> 
            <p>회원이BBQ어플리케이션/홈페이지가 아닌 다른 온라인주문채널(배달의민족, 요기요, 배달통 등)을 통해 주문을 하거나, 현금, 상품권, 신용카드 등을 통해 결제를 한 후 하나 이상의 적립카드와 기타의 할인카드 및 쿠폰을 제시하고 이중으로 포인트 누적 또는 할인을 요구 하거나, 할인 및 증정품(판촉물, 제품)제공 행사 참여시 적립을 요구했을 때, 기프티콘(e-coupon)으로 결제했을 때, 가맹점은 이를 거부할 수 있습니다. 이때 회원은 가맹점의 요구에 따라 <span class="ddack">딹</span> 멤버십포인트, 다른 온라인주문채널, 할인제도, 기프티콘 등 중 하나를 선택하여야 합니다. </p> 
           </dd> 
          </dl> 
         </div> 
         <div class="ddack-memInfo"> 
          <p class="validity">유효기간은 적립일로부터 12개월입니다.</p> 
          <!--
                                <div class="use-box">
                                    <dl>
                                        <dt><span class="txt">적립된 </span><span class="ddack-mem">딹</span><span class="txt">포인트는 어떻게 사용하나요?</span></dt>
                                        <dd>회원님의 적립된 <span class="ddack">딹</span> 포인트가 100포인트 이상 부터 현금처럼 사용이 가능하며 “BBQ홈페이지/어플리케이션” 에서 <span class="ddack">딹</span>포인트 적립대상 품목을 <span class="ddack">딹</span>포인트로 구매 가능합니다.
                                            <br>단, 휴게소, 지하철 역사, 기타 사업장에 입점한 형태의 가맹점과 일부 가맹점에서는 <span class="ddack">딹</span>포인트 적립 및 사용이 제한 될 수 있습니다.
                                        </dd>
                                    </dl>
                                </div>
--> 
         </div> 
        </div> 
       </section> 
       <!--// 딹 메버십 안내 --> 
      </div> 
     </div> 
     <!--
            <div class="btn-wrap two-up">
                <button type="submit" class="btn btn-flat btn-red" onclick="location.href='/order/cart.asp';">확인</button>
                <button type="submit" class="btn btn-flat btn-gray" onclick="lpClose(this);">취소</button>
            </div>
--> 
     <button type="button" class="btn btn_lp_close"><span>레이어팝업 닫기</span></button> 
    </div> 
   </div> 
   <!--// LP Wrap --> 
  </div> 
  <!--// Layer Popup --> 
  <meta name="Keywords" content="브랜드스토리, BBQ치킨"> 
  <meta name="Description" content="브랜드스토리 메인"> 
  <title>브랜드스토리 | BBQ치킨</title> 
  <script>
jQuery(document).ready(function(e) {
	
	$(window).on('scroll',function(e){
		if ($(window).scrollTop() > 0) {
			$(".wrapper").addClass("scrolled");
		} else {
			$(".wrapper").removeClass("scrolled");
		}
	});

	$('.bbqStroy_time .tab a').on('click',function(){
		$(this).addClass('active').siblings().removeClass('active');
		$('.bbqStroy_time .area').eq($(this).index()).addClass('active').siblings().removeClass('active');
		return false;
	});

});
</script>   
  <div class="wrapper"> 
   <!-- Header --> 
   <form name="SITE_MOVE" method="post"> 
    <input type="hidden" name="access_token" value=""> 
   </form> 
   <div class="header-wrap"> 
    <header class="header"> 
     <!-- GNB --> 
     <div class="gnb-wrap"> 
      <ul class="familyBrand"> 
       <li class="on"><a href="/">비비큐치킨</a></li> 
       <li><a href="javascript:;" onclick="go_site('BBQMALL')">비비큐몰</a></li> 
       <li><a href="javascript:;" onclick="go_site('CKPLACE')">닭익는마을</a></li> 
       <!--<li><a href="javascript:;" onClick="go_site('BARBECUE')">시크릿테이스트치킨</a></li>--> 
       <li><a href="javascript:;" onclick="go_site('UNINE')">우쿠야</a></li> 
       <li><a href="javascript:;" onclick="go_site('ALLTOKK')">올떡</a></li> 
       <!--<li><a href="javascript:;" onClick="go_site('BELIEF')">소신275°C</a></li>--> 
       <!--li><a href="javascript:;" onClick="go_site('WATAMI')">와타미</a></li--> 
       <!--li><a href="javascript:;" onClick="go_site('HAPPY')">행복한집밥</a></li>--> 
       <li><a href="javascript:;" onclick="window.open('http://www.bbqopen.co.kr');">창업</a></li> 
      </ul> 
      <ul class="gnb"> 
       <li><a href="javascript:openLogin();">로그인</a></li> 
       <li><a href="javascript:openJoin();">회원가입</a></li> 
       <!-- <li><a href="javascript: mobile_window_open('noMem')">주문조회</a></li> --> 
       <li><a href="/customer/faqList.asp">고객센터</a></li> 
       <!-- 
					<li><a href="javascript: mobile_cart_window_open()" class="online">온라인주문</a></li>
					<li><a href="/order/cart.asp" class="cart">장바구니</a></li>
					<li>
						<a href="javascript: mobile_cart_window_open()" class="cart">
							<span class="txt">장바구니</span>
							<span class="count" id="cart_item_count"></span>
						</a>
					</li>
					 --> 
      </ul> 
     </div> 
     <!--// GNB --> 
     <!-- LNB--> 
     <nav class="lnb-wrap"> 
      <div class="logo-header">
       <a href="/"><img src="/images/common/logo_header_bbq.png" alt="BBQ"></a>
      </div> 
      <!-- 실시간 인기 롤링 --> 
      <ul class="main_con_popular"> 
       <li><img src="/images/common/popular_img01.png"> <span>실시간 인기</span></li> 
       <li> 
        <ul id="main_con_popular_roll" class="main_con_popular_roll"> 
         <li><a href="/menu/menuView.asp?midx=2247">1. 황금올리브치킨™</a></li> 
         <li><a href="/menu/menuView.asp?midx=2254">2. 황금올리브치킨™반반</a></li> 
         <li><a href="/menu/menuView.asp?midx=2248">3. 황금올리브치킨™닭다리</a></li> 
         <li><a href="/menu/menuView.asp?midx=2253">4. 자메이카 통다리구이</a></li> 
         <li><a href="/menu/menuView.asp?midx=2256">5. 오리지날 양념치킨</a></li> 
         <li><a href="/menu/menuView.asp?midx=2259">6. 황금올리브치킨™순살</a></li> 
         <li><a href="/menu/menuView.asp?midx=2264">7. 핫황금올리브치킨™<br>크리스피</a></li> 
         <li><a href="/menu/menuView.asp?midx=2249">8. 황금올리브치킨™핫윙</a></li> 
         <li><a href="/menu/menuView.asp?midx=2287">9. 황올한 깐풍순살</a></li> 
         <li><a href="/menu/menuView.asp?midx=2261">10. 황금올리브치킨™순살반반</a></li> 
         <li><a href="/menu/menuView.asp?midx=2260">11. 황금올리브치킨™순살양념</a></li> 
         <li><a href="/menu/menuView.asp?midx=2286">12. 황올한 깐풍치킨</a></li> 
        </ul> </li> 
      </ul> 
      <script>
					function tick(){
						$('#main_con_popular_roll li:first').slideUp( function () { $(this).appendTo($('#main_con_popular_roll')).slideDown(); });
					}
					setInterval(function(){ tick () }, 4000);
				</script> 
      <!-- // 실시간 인기 롤링 --> 
      <ul class="lnb"> 
       <li class="node1"><a href="/menu/menuList.asp" class="depth1">메뉴소개</a> 
        <ul class="submenu"> 
         <li class="node2"><a href="/menu/menuList.asp?cidx=129&amp;cname=%EC%88%98%EC%A0%9C%EB%A7%A5%EC%A3%BC+%EC%84%B8%ED%8A%B8" class="depth2">수제맥주 세트</a></li> 
         <li class="node2"><a href="/menu/menuList.asp?cidx=113&amp;cname=%EC%8B%A0%EB%A9%94%EB%89%B4" class="depth2">신메뉴</a></li> 
         <li class="node2"><a href="/menu/menuList.asp?cidx=114&amp;cname=%ED%99%A9%EC%98%AC+%EC%8B%9C%EA%B7%B8%EB%8B%88%EC%B2%98" class="depth2">황올 시그니처</a></li> 
         <li class="node2"><a href="/menu/menuList.asp?cidx=124&amp;cname=%ED%99%A9%EC%98%AC+1%EC%9D%B8%EB%B6%84" class="depth2">황올 1인분</a></li> 
         <li class="node2"><a href="/menu/menuList.asp?cidx=7&amp;cname=%ED%99%A9%EC%98%AC+%EC%96%91%EB%85%90" class="depth2">황올 양념</a></li> 
         <li class="node2"><a href="/menu/menuList.asp?cidx=8&amp;cname=%ED%99%A9%EC%98%AC+%EA%B5%AC%EC%9D%B4" class="depth2">황올 구이</a></li> 
         <li class="node2"><a href="/menu/menuList.asp?cidx=108&amp;cname=%ED%99%A9%EC%98%AC+%EB%B0%98%EB%B0%98" class="depth2">황올 반반</a></li> 
         <li class="node2"><a href="/menu/menuList.asp?cidx=121&amp;cname=%EA%B3%84%EC%A0%88+%EB%B3%B4%EC%96%91%EC%8B%9D" class="depth2">계절 보양식</a></li> 
         <li class="node2"><a href="/menu/menuList.asp?cidx=99999&amp;cname=%EC%82%AC%EC%9D%B4%EB%93%9C%EB%A9%94%EB%89%B4" class="depth2">사이드메뉴</a></li> 
        </ul> </li> 
       <li class="node1"><a href="/shop/shopList.asp" class="depth1">매장찾기</a> 
        <ul class="submenu"> 
         <li class="node2"><a href="/shop/shopList.asp" class="depth2">매장찾기</a></li> 
        </ul> </li> 
       <li class="node1"><a href="/brand/bbq.asp" class="depth1">브랜드</a> 
        <ul class="submenu"> 
         <li class="node2"><a href="/brand/bbq.asp" class="depth2">브랜드스토리</a></li> 
         <li class="node2"><a href="/brand/noticeList.asp" class="depth2">공지사항</a></li> 
        </ul> </li> 
       <li class="node1"><a href="https://www.bbqchangup.co.kr:446/" class="depth1">창업정보</a> 
        <ul class="submenu"> 
         <li class="node2"><a href="https://www.bbqchangup.co.kr:446/" class="depth2">창업정보</a></li> 
        </ul> </li> 
       <li class="node1"><a href="/event/eventList.asp" class="depth1">이벤트</a> 
        <ul class="submenu"> 
         <li class="node2"><a href="/event/eventList.asp?event=OPEN" class="depth2">진행중인 이벤트</a></li> 
         <li class="node2"><a href="/event/eventList.asp?event=CLOSE" class="depth2">지난 이벤트</a></li> 
        </ul> </li> 
       <li class="node1"><a href="javascript: mobile_cart_window_open()" class="online">온라인주문</a></li> 
      </ul> 
      <!--<div class="callNumber">1588-9282</div>--> 
     </nav> 
     <!--// LNB --> 
    </header> 
    <div class="bg-lnb"></div> 
   </div> 
   <script type="text/javascript">
    var paycoAuthUrl = "https://id.bbq.co.kr";
</script> 
   <!--// Header --> 
   <hr> 
   <!-- Container --> 
   <div class="container"> 
    <!-- BreadCrumb --> 
    <div class="breadcrumb-wrap"> 
     <ul class="breadcrumb"> 
      <li>bbq home</li> 
      <li>브랜드</li> 
      <li>브랜드스토리</li> 
     </ul> 
    </div> 
    <!--// BreadCrumb --> 
    <!-- Content --> 
    <article class="content content-wide"> 
     <div class="inner"> 
      <h1 class="ta-l">브랜드스토리</h1> 
      <div class="tab-wrap tab-type3"> 
       <ul class="tab"> 
        <li class="on"><a href="./bbq.asp"><span>비비큐 이야기</span></a></li> 
        <li><a href="./oliveList.asp"><span>올리브 이야기</span></a></li> 
        <li><a href="./videoList.asp"><span>영상콘텐츠</span></a></li> 
       </ul> 
      </div> 
     </div> 
     <section class="section section_bbqStroy"> 
      <div class="bbqStroy_happy"> 
       <div class="inner"> 
        <h3>당신의 행복을 키우는 BBQ</h3> 
        <div>
         <img src="/images/brand/bbqstory_happy.jpg" alt="">
        </div> 
        <div class="txt-basic ta-c mar-t40">
          BBQ는 더 풍부한 행복을 만들기 위해 고객의 입맛과 마음을 연구합니다.
         <br> BBQ가 있는 곳 어디서나 행복한 만남이 이루어집니다.
         <br> 사회 윤리적 기업으로 책임과 역할을 다하여 모두가 행복해지는 세상을 만들어가겠습니다. 
        </div> 
       </div> 
      </div> 
      <div class="bbqStroy_qua mar-t70"> 
       <dl> 
        <dt>
         Best of the Best Quality
        </dt> 
        <dd>
          BBQ는 그 이름처럼
         <br> 최고의 원재료만을 사용하여 맛은 물론 
         <br> 고객의 건강까지 생각합니다. 
        </dd> 
       </dl> 
       <dl class="two"> 
        <dt>
         세상에서 가장 맛있는 치킨
        </dt> 
        <dd>
          BBQ는 최고의 치킨 맛,
         <br> 건강에 좋은 치킨을 만들겠다는 일념으로 올리브유 중에서도 최고급유이자
         <br> ‘신이 내린 선물’이라 불리는 100%엑스트라 버진 올리브유를
         <br> 후라잉오일의 원료로 사용하고 있으며 국민건강 증진에 기여하고자 합니다. 
        </dd> 
       </dl> 
      </div> 
      <div class="bbqStroy_gray"> 
       <div class="inner"> 
        <div class="use"> 
         <h3>BBQ 사용규정</h3> 
         <a href="/download/bi_download.zip" class="btn btn-md btn-grayLine">로고파일 다운로드</a> 
         <div>
          <img src="/images/brand/bbqstory_logo.jpg" alt="" class="w-100p">
         </div> 
         <dl> 
          <dt>
           마스터 로고_Master Logo
          </dt> 
          <dd>
            BBQ의 Logotype은 대내외 Communication에 있어서 이미지를 대표하는 BI(Brand Identity)의 핵심요소이다.
           <br> 따라서 Logo의 형태나 비례는 어떠한 경우에도 정확하게 표현되어야 하며 규정된 형태와 비례, 색상은 임의로 변경 될 수 없다. 
           <br> BBQ의 시각적 이미지를 전달하는 중요한 수단이므로 제시된 가이드 라인을 준수하여 BBQ의 브랜드 이미지에 손상이 발생하지 않도록 주의하여 사용하도록 한다. 
          </dd> 
         </dl> 
        </div> 
        <div class="color mar-t60"> 
         <h3 class="type2">Color System_전용색상 체계</h3> 
         <div class="area"> 
          <div class="box box1"> 
           <h4>BBQ Prussian Blue</h4> 
           <dl> 
            <dt>
             PANTONE
            </dt> 
            <dd>
             PANTONE 2765C 
            </dd> 
           </dl> 
           <dl> 
            <dt>
             CMYK
            </dt> 
            <dd>
             C 100 &nbsp; M 97 &nbsp; Y 0 K 45
            </dd> 
           </dl> 
           <dl> 
            <dt>
             RGB
            </dt> 
            <dd>
             R 22 &nbsp; G 20 &nbsp; B 95
            </dd> 
           </dl> 
           <dl> 
            <dt>
             HEX Code
            </dt> 
            <dd>
             #16145f
            </dd> 
           </dl> 
          </div> 
          <div class="box box2"> 
           <h4>BBQ Gold</h4> 
           <dl> 
            <dt>
             PANTONE
            </dt> 
            <dd>
             PANTONE 871C
            </dd> 
           </dl> 
           <dl> 
            <dt>
             CMYK
            </dt> 
            <dd>
             C 20 &nbsp; M 25 &nbsp; Y 60 K 25
            </dd> 
           </dl> 
           <dl> 
            <dt>
             RGB
            </dt> 
            <dd>
             R 163 &nbsp; G 45 &nbsp; B 97
            </dd> 
           </dl> 
           <dl> 
            <dt>
             HEX Code
            </dt> 
            <dd>
             #a39161
            </dd> 
           </dl> 
          </div> 
          <div class="box box3"> 
           <h4>BBQ Red</h4> 
           <dl> 
            <dt>
             PANTONE
            </dt> 
            <dd>
             PANTONE 186C 
            </dd> 
           </dl> 
           <dl> 
            <dt>
             CMYK
            </dt> 
            <dd>
             C 0 &nbsp; M 00 &nbsp; Y 81 K 4
            </dd> 
           </dl> 
           <dl> 
            <dt>
             RGB
            </dt> 
            <dd>
             R 227 &nbsp; G 25 &nbsp; B 55
            </dd> 
           </dl> 
           <dl> 
            <dt>
             HEX Code
            </dt> 
            <dd>
             #E31937
            </dd> 
           </dl> 
          </div> 
          <div class="box box4"> 
           <h4>BBQ Gray</h4> 
           <dl> 
            <dt>
             PANTONE
            </dt> 
            <dd>
             PANTONE Warm Gray 8C
            </dd> 
           </dl> 
           <dl> 
            <dt>
             CMYK
            </dt> 
            <dd>
             C 0 &nbsp; M 9 &nbsp; Y 16 &nbsp; K 43
            </dd> 
           </dl> 
           <dl> 
            <dt>
             RGB
            </dt> 
            <dd>
             R 162 &nbsp; G 149 &nbsp; B 138
            </dd> 
           </dl> 
           <dl> 
            <dt>
             HEX Code
            </dt> 
            <dd>
             #a2958a
            </dd> 
           </dl> 
          </div> 
          <div class="box box5"> 
           <h4>BBQ Custom Gradient Color</h4> 
           <dl> 
            <dt>
             HEX Code
            </dt> 
            <dd>
             #c49222 - #fbeaba - #cd972c
            </dd> 
           </dl> 
          </div> 
         </div> 
        </div> 
       </div> 
      </div> 
      <!--	<div class="bbqStroy_history">
					<div class="inner">
						<h3>BBQ 로고 History</h3>
						<div class="area div-table">
							<div class="tr">
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo1.jpg" alt=""></dt>
										<dd>1995 ~ 1996</dd>
									</dl>
								</div>
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo2.jpg" alt=""></dt>
										<dd>1997 ~ 1998</dd>
									</dl>
								</div>
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo3.jpg" alt=""></dt>
										<dd>1999 ~ 2001</dd>
									</dl>
								</div>
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo4.jpg" alt=""></dt>
										<dd>2001 ~ 2002</dd>
									</dl>
								</div>
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo5.jpg" alt=""></dt>
										<dd>2002 ~ 2005</dd>
									</dl>
								</div>
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo6.jpg" alt=""></dt>
										<dd>2006 ~ 2007</dd>
									</dl>
								</div>
							</div>
							<div class="tr">
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo7.jpg" alt=""></dt>
										<dd>2008 ~</dd>
									</dl>
								</div>
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo8.jpg" alt=""></dt>
										<dd>2011. 서울대 해동관점</dd>
									</dl>
								</div>
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo9.jpg" alt=""></dt>
										<dd>2011 ~ 2013</dd>
									</dl>
								</div>
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo11.jpg" alt=""></dt>
										<dd>글로벌 2016</dd>
									</dl>
								</div>
								<div class="td">
									<dl>
										<dt><img src="/images/brand/bbqstory_logo10.jpg" alt=""></dt>
										<dd>2014 ~ 현재</dd>
									</dl>
								</div>
								<div class="td">
								</div>
							</div>
						</div>
						<div class="area2 mar-t20">
							<img src="/images/brand/bbqstory_otherLogo.jpg" alt="">
						</div>
					</div>
				</div>--> 
      <div class="bbqStroy_time mar-t80"> 
       <div class="inner"> 
        <h3>BBQ 연혁 및 수상내역</h3> 
        <div class="tab mar-t20 div-table"> 
         <div class="tr"> 
          <a href="#" onclick="javascript:return false;" class="active">2020's</a> 
          <a href="#" onclick="javascript:return false;">2010's</a> 
          <a href="#" onclick="javascript:return false;">2000's</a> 
          <a href="#" onclick="javascript:return false;">1990's</a> 
         </div> 
        </div> 
        <div class="wrap"> 
         <div class="area active"> 
          <div class="box"> 
           <h4>2021</h4> 
           <ul> 
            <li>12월 2021 대한민국 100대 브랜드 26위(브랜드스탁)</li> 
            <li>12월 TV조선 경영대상(글로벌경영 부문, TV조선)</li> 
            <li>11월 2021 서비스마케팅학회 서비스마케팅대상 수상(서비스마케팅학회)</li> 
            <li>11월 2021 대한민국 소비자대상(올해 최고의 브랜드 부문, 한국소비자협회 주관)[5년 연속]</li> 
            <li>11월 한국경제를 빛낸 인물 &amp; 경영(매경닷컴)</li> 
            <li>5월 2021 한국의 영향력 있는 CEO(상생경영 부문, TV조선)</li> 
            <li>4월 ‘국가브랜드대상’ 브랜드치킨전문점 부문(중앙일보/대한민국 국가브랜드 선정 위원회)[3년 연속]</li> 
            <li>4월 대한민국 100대 브랜드 27위(브랜드스탁)</li> 
            <li>3월 제23회 ‘대한민국 브랜드 스타’ 치킨 부문 브랜드 가치 1위(브랜드스탁)[7년 연속]</li> 
            <li>3월 대한민국 명품브랜드 대상(한국경제신문)[BBQ, 우쿠야, 올떡 2년연속]</li> 
            <li>2월 KCAB 한국소비자 평가 최고의 브랜드 대상(동아일보)</li> 
            <li>1월 고객이 가장 추천하는 브랜드 대상(중앙일보)</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2020</h4> 
           <ul> 
            <li>07월 매경 100대 프랜차이즈 수상(BBQ/올떡/우쿠야)</li> 
            <li>06월 근로자의 날 유공 정부포상 수상</li> 
            <li>06월 대한민국 창업대상 수상</li> 
            <li>05월 국가브랜드 대상 수상</li> 
            <li>04월 명품브랜드 대상 수상</li> 
            <li>01월 KCA 프랜차이즈 어워즈 수상</li> 
           </ul> 
          </div> 
         </div> 
         <div class="area"> 
          <div class="box"> 
           <h4>2019 ~</h4> 
           <ul> 
            <li>11월 대한민국 소비자 대상 수상</li> 
            <li>03월 2019 매일경제 100대 브랜드 수상</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2018 ~</h4> 
           <ul> 
            <li>09월 대한민국 고용 친화 모범경영대상 수상</li> 
            <li>05월 매일경제 '2018 대한민국 글로벌 리더' 수상</li> 
            <li>포항지진 피해복구 유공 '행정안전부 장관상' 수상</li> 
            <li>매경 '글로벌리더 25인 선정'</li> 
            <li>WFP(유엔세계식량계획 기구) 협약</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2017</h4> 
           <ul> 
            <li>BBQ 올리버스 공식 후원</li> 
            <li>뉴욕 맨하튼 32번가 그랜드 오픈</li> 
            <li><strong>대한민국 100대 CEO 11회 연속 수상</strong></li> 
            <li>글로벌 57개국 국가 500개 매장 운영</li> 
            <li><strong>한국소비자대상 '최고브랜드상' 수상</strong></li> 
            <li><strong>브랜드스탁 100대 브랜드 선정 '33위'</strong> </li> 
            <li><strong>한국브랜드경영협회의 '2017년 올해의 신성장기업 경영인상' 수상</strong></li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2016</h4> 
           <ul> 
            <li>대한민국 브랜드 스타 외식프랜차이즈부문 '1위'</li> 
            <li>대한민국 100대 브랜드 '34위' 기록</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2015</h4> 
           <ul> 
            <li>BBQ-ECO EV 실증사업 3자간 MOU 체결(BBQ, 르노삼성, 서울시)</li> 
            <li>2015 요우커 만족도 치킨부문 '1위'</li> 
            <li><strong>금탑산업훈장 수훈</strong></li> 
           </ul> 
           <div class="img">
            <img src="/images/brand/history2015.jpg" alt="">
           </div> 
          </div> 
          <div class="box"> 
           <h4>2014</h4> 
           <ul> 
            <li>GBFF(제너시스비비큐 패밀리 패스티벌) 개최 5,000명 제주 1박2일 초청</li> 
            <li>한국 100대 CEO선정(8회 연속)</li> 
            <li>지속가능 경영대상 '환경부장관상' 수상</li> 
            <li>기업혁신대상 '산업통상부 장관상' 수상</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2013</h4> 
           <ul> 
            <li>BBQ 교육과정 22,000명 수료 </li> 
            <li>5.16 민족상 수상</li> 
            <li>코리아 CEO Summit '창조브랜드대상' 수상</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2012</h4> 
           <ul> 
            <li>'글로벌 경영위원회 최고경영자 및 마케팅 대상' 수상</li> 
            <li>'한국 최고의 일하기 좋은 기업 대상' 수상</li> 
            <li>포브스 '브랜드 경영부문 대상' 수상</li> 
            <li><strong>한국유통대상 '대통령상' 수상</strong></li> 
           </ul> 
           <div class="img">
            <img src="/images/brand/history2012.jpg" alt="">
           </div> 
          </div> 
          <div class="box"> 
           <h4>2011</h4> 
           <ul> 
            <li>BBQ 프리미엄 카페 런칭 </li> 
            <li>'소비자 품질만족 대상' 수상</li> 
            <li>'고용창출 선도 대상' 수상</li> 
           </ul> 
          </div> 
         </div> 
         <div class="area"> 
          <div class="box"> 
           <h4>2009</h4> 
           <ul> 
            <li>BBQ 터키 진출</li> 
            <li>'한국의 경영자상' 수상</li> 
            <li>'한국재계를 이끄는 CEO 대상' 수상</li> 
            <li>'CEO 창조경영인상' 수상</li> 
            <li><strong>은탑산업훈장 수훈</strong></li> 
           </ul> 
           <div class="img">
            <img src="/images/brand/history2009.jpg" alt="">
           </div> 
          </div> 
          <div class="box"> 
           <h4>2008</h4> 
           <ul> 
            <li>전세계 3,750개점 운영 </li> 
            <li>BBQ 인도 진출 </li> 
            <li>국내 브랜드가치 '45위' </li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2007</h4> 
           <ul> 
            <li>사우디, 말레이시아, 싱가폴(10개국) </li> 
            <li><strong>스페인 시민십자대훈장 수훈</strong></li> 
           </ul> 
           <div class="img">
            <img src="/images/brand/history2007.jpg" alt="">
           </div> 
          </div> 
          <div class="box"> 
           <h4>2006</h4> 
           <ul> 
            <li>일본, 미국, 베트남, 호주, 몽골 진출</li> 
            <li>상공의 날 '산업자원부 장관상' 수상</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2005</h4> 
           <ul> 
            <li>올리브치킨 혁명(올리브오일 개발)</li> 
            <li>공정거래의 날 '대통령상' 수상</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2004</h4> 
           <ul> 
            <li>BBQ 스페인 진출 </li> 
            <li>경기도 이천 치킨대학 개관</li> 
            <li>BBQ 1,800호점 개점</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2003</h4> 
           <ul> 
            <li>BBQ 중국진출(상해 BBQ유한공사 설립)</li> 
            <li>한국유통대상 '국무총리상' 수상</li> 
            <li><strong>동탑산업훈장 수훈</strong></li> 
           </ul> 
           <div class="img">
            <img src="/images/brand/history2003.jpg" alt="">
           </div> 
          </div> 
          <div class="box"> 
           <h4>2002</h4> 
           <ul> 
            <li>문정동 신사옥 이전 및 제 2창업 선포</li> 
            <li>산업자원부 '장관상' 수상</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>2000</h4> 
           <ul> 
            <li>BBQ치킨대학 개관 및 물류센터 준공</li> 
            <li>농림부 장관 표창</li> 
           </ul> 
          </div> 
         </div> 
         <div class="area"> 
          <div class="box"> 
           <h4>1999</h4> 
           <ul> 
            <li>한국유통대상 '국무총리상' 수상</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>1998</h4> 
           <ul> 
            <li>BBQ 1,000호점 오픈(세계 최초) </li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>1996</h4> 
           <ul> 
            <li>BBQ 100호점 오픈</li> 
           </ul> 
          </div> 
          <div class="box"> 
           <h4>1995</h4> 
           <ul> 
            <li>제너시스 BBQ 그룹 창업</li> 
            <li>BBQ 1호점 오픈</li> 
           </ul> 
           <div class="img">
            <img src="/images/brand/history1995.jpg" alt="">
           </div> 
          </div> 
         </div> 
        </div> 
       </div> 
      </div> 
     </section> 
    </article> 
    <!--// Content --> 
    <!-- QuickMenu --> 
    <!-- quickMenu --> 
    <div class="quickMenu"> 
     <ul class="menuList"> 
      <li><a href="javascript:;" onclick="go_site('START')"><p><img src="/images/common/ico_quickmenu01.png" alt=""></p><span>창업정보</span></a></li> 
      <li><a href="javascript:;" onclick="go_site('CHICKEN_UNI')"><p><img src="/images/common/ico_quickmenu02.png" alt=""></p><span>치킨캠프</span></a></li> 
      <li> 
       <!--a href="/mypage/card.asp"--><a href="/event/eventList.asp"><p><img src="/images/common/ico_quickmenu03.png" alt=""></p><span>이벤트</span></a></li> 
      <li><a href="javascript:void(0);" onclick="javascript: mobile_window_open('ecoupon');"><p><img src="/images/common/ico_quickmenu04.png" alt=""></p><span>e쿠폰</span></a></li> 
     </ul> 
    </div> 
    <!--// quickMenu --> 
    <!-- Back to Top --> 
    <a href="#Top" class="btn btn_scrollTop">페이지 상단으로 이동</a> 
    <!--// Back to Top --> 
    <!-- Layer Popup : e쿠폰 --> 
    <div id="lp_eCouponPop" class="lp-wrapper lp_eCouponPop"> 
     <!-- LP Wrap --> 
     <div class="lp-wrap"> 
      <div class="lp-con"> 
       <!-- LP Header --> 
       <!--  <div class="lp-header">
                <h2>E-쿠폰 등록</h2>
            </div>--> 
       <!--// LP Header --> 
       <!-- LP Container --> 
       <div class="lp-container"> 
        <!-- LP Content --> 
        <div class="lp-content"> 
         <section class="section2"> 
          <input type="hidden" id="ecoupon_data" name="ecoupon_data"> 
          <div class="area "> 
           <h3>쿠폰인증번호 등록하기</h3> 
           <div class="wrap"> 
            <input type="text" id="txtPIN" name="txtPIN" placeholder="쿠폰 번호 입력"> 
            <button type="button" onclick="javascript:eCoupon_Check();" class="btn btn-md2 btn-black">쿠폰번호인증</button> 
           </div> 
           <div class="txt">
             10-35자 일련번호 . “ - ” 제외, 알파벳 ( I ) =&gt; 숫자 ( 1 ), 알파벳 ( O ) =&gt; 숫자 ( 0 ) 로
            <br> 정확히 확인 후 입력하시기 바랍니다 
           </div> 
          </div> 
          <div class="btn-wrap two-up pad-t40 bg-white"> 
           <button type="button" onclick="javascript:eCoupon_Cart();" class="btn btn-lg btn-black btn_confirm"><span>확인</span></button> 
           <button type="button" onclick="javascript:lpClose(this);" class="btn btn-lg btn-grayLine btn_cancel"><span>취소</span></button> 
          </div> 
         </section> 
         <!--p><img src="/images/common/e-coupon_info_re.png"/></p--> 
        </div> 
        <!--// LP Content --> 
       </div> 
       <!--// LP Container --> 
       <button type="button" class="btn btn_lp_close"><span>레이어팝업 닫기</span></button> 
      </div> 
     </div> 
     <!--// LP Wrap --> 
    </div> 
    <!--// Layer Popup --> 
    <script type="text/javascript">
    function eCoupon_Check() {
        if ($("#txtPIN").val() == "") {
            alert('E-쿠폰 번호를 입력해주세요.');
            return;
        }
        $.ajax({
            method: "post",
            url: "/api/ajax/ajax_getEcoupon.asp",
            data: {
                txtPIN: $("#txtPIN").val()
            },
            dataType: "json",
            success: function(res) {
                showAlertMsg({
                    msg: res.message,
                    ok: function() {
                        if (res.result == 0) {
                            $("#ecoupon_data").val(res.menuItem);
                        }
                    }
                });
            },
            error: function(data, status, err) {
                showAlertMsg({
                    msg: data + ' ' + status + ' ' + err
                });
            }

        });
    }
	function eCoupon_Cart(){
		var menuItem = $("#ecoupon_data").val();
		if ( menuItem == ''){
			alert('쿠폰인증을 먼저 진행해 주세요');
		}else{
			addCartMenu(menuItem);
			location.href = "/order/cart.asp";
		}
	}
</script> 
    <!-- QuickMenu --> 
   </div> 
   <!--// Container --> 
   <hr> 
   <!-- Footer --> 
   <div class="footer-wrap"> 
    <footer class="footer"> 
     <!--
        <ul class="familySite">
				<li><a href="javascript:;" onClick="go_site('GROUP')">제너시스 그룹</a></li>
				<li><a href="javascript:;" onClick="go_site('GLOBAL')">글로벌BBQ</a></li>
				<li><a href="javascript:;" onClick="go_site('CHICKEN_UNI')">치킨대학</a></li>
				<li><a href="javascript:;" onClick="go_site('START')">창업전략연구소</a></li>
                <li><a href="https://bbq.recruiter.co.kr" target="_blank">인재채용</a></li>
        </ul>
		--> 
     <div class="fnb-wrap clearfix"> 
      <address class="footer-addr clearfix"> <h4>주식회사 제너시스비비큐</h4> <span>주문번호 : <p>1588-9282</p></span> <span>고객센터 : <p>1588-9282</p></span> <span>창업문의 : <p>080-383-9000</p></span><br> <span>대표자 : 이승재</span> <span>서울시 송파구 중대로 64(문정동)</span> <span>통신판매업신고 : 2010-서울송파-1181호</span> <span>사업자등록번호 : 207-81-43555</span> 
       <div class="copyright">
        © 2019 GENESIS BBQ. All rights reserved.
       </div> </address> 
      <ul class="fnb"> 
       <li><a href="/etc/privacy.asp">개인정보처리방침</a></li> 
       <li><a href="/etc/policy.asp">이용약관</a></li> 
       <li><a class="ddak_font" href="/etc/membership.asp">멤버십 약관</a></li> 
       <!-- <li><a href="/etc/preventEmail.asp">이메일주소무단수집거부</a></li>
				<li><a id="layerPop_orgInfo" style="cursor:pointer;">원산지 정보</a></li>--> 
      </ul> 
      <dl class="footer-app cleafix"> 
       <dt>
        <img src="/images/common/ft_qr.gif" alt=""> 
       </dt>
       <dd>
        <a href="#" target="_blank"><img src="/images/common/ft_appstore.gif" alt="App Store"></a>
       </dd> 
       <dd>
        <a href="#" target="_blank"><img src="/images/common/ft_googleplay.gif" alt="Google play"></a>
       </dd> 
      </dl> 
      <ul class="footer-sns"> 
       <li><a href="https://www.instagram.com/bbq_offi" target="_blank" class="sns_instagram"><img src="/images/common/btn_footer_sns_instagram.png" alt="인스타그램"></a></li> 
       <li><a href="https://www.youtube.com/user/BBQMobile" target="_blank" class="sns_youtube"><img src="/images/common/btn_footer_sns_youtube.png" alt="유투브"></a></li> 
       <li><a href="http://blog.naver.com/blogbbq" target="_blank" class="sns_blog"><img src="/images/common/btn_footer_sns_blog.png" alt="블로그"></a></li> 
      </ul> 
     </div> 
    </footer> 
   </div> 
   <div id="layerOrgPopupDiv" style="position:fixed; top:0; width:100%; height:100%; display:none; z-index:999; cursor:pointer;"> 
    <div class="origin_dim"></div> 
    <div class="footer_origin"> 
     <img src="/images/common/layerpopup_orgInfo_top.png" alt="원산지 정보"> 
     <table> 
      <colgroup> 
       <col width="50%"> 
      </colgroup> 
      <tbody> 
       <tr> 
        <th>닭고기(닭껍데기)</th> 
        <td>국내산</td> 
       </tr> 
       <tr> 
        <th>베이비립</th> 
        <td>스페인산</td> 
       </tr> 
       <tr> 
        <th>BBQ소떡(소시지)</th> 
        <td>국내산</td> 
       </tr> 
       <tr> 
        <th>오징어스틱</th> 
        <td>중국산</td> 
       </tr> 
       <tr> 
        <th>뎀뿌라 오징어튀김</th> 
        <td>중국산</td> 
       </tr> 
       <tr> 
        <th>고래사 활금 올리브 어묵<br>(BBQ베이컨 어묵)</th> 
        <td>베이컨(돼지고기): 외국산</td> 
       </tr> 
      </tbody> 
     </table> 
     <div> 
     </div> 
     <script>
$(function(){
    $("#layerPop_orgInfo").click(function(){
        $("#layerOrgPopupDiv").show();
    });

    $("#layerOrgPopupDiv").click(function(){
        $("#layerOrgPopupDiv").hide();
    });

});
</script> 
     <div style="text-align:center; display:none; "> 
      <div id="mobile_lay" style="width:500px; display: inline-block;"> 
       <div class="mobile_lay_close">
        <a href="javascript:void(0)" class="b-close" style="cursor:pointer"><img src="/images/common/btn_lp_close3.png"></a>
       </div> 
       <iframe id="mobile_lay_iframe" src="about:blank" height="100px" style="width:500px; background-color:#fff"></iframe> 
      </div> 
     </div> 
     <span itemscope itemtype="http://schema.org/Organization"> 
      <link itemprop="url" href="https://www.bbq.co.kr"> <a itemprop="sameAs" href="https://www.youtube.com/user/BBQMobile"></a> <a itemprop="sameAs" href="https://blog.naver.com/blogbbq"></a> <a itemprop="sameAs" href="https://www.instagram.com/bbq.chicken.insta"></a> </span> 
     <!-- Criteo 홈페이지 태그 --> 
     <script type="text/javascript" src="//static.criteo.net/js/ld/ld.js" async="true"></script> 
     <script type="text/javascript">
	window.criteo_q = window.criteo_q || [];
	var deviceType = /iPad/.test(navigator.userAgent) ? "t" : /Mobile|iP(hone|od)|Android|BlackBerry|IEMobile|Silk/.test(navigator.userAgent) ? "m" : "d";
	window.criteo_q.push(
	 { event: "setAccount", account: 17628}, // 이 라인은 업데이트하면 안됩니다
	 { event: "setEmail", email: "" }, // 빈 문자 일수 있습니다 
	 { event: "setSiteType", type: deviceType},
	 { event: "viewHome"});
	</script> 
     <!-- END Criteo 홈페이지 태그 --> 
     <!-- Enliple Tracker Start --> 
     <script type="text/javascript">
	var deviceType = /Mobile|iP(hone|od)|Android|BlackBerry|IEMobile|Silk/.test(navigator.userAgent) ? "M" : "W";

    (function(a,g,e,n,t){a.enp=a.enp||function(){(a.enp.q=a.enp.q||[]).push(arguments)};n=g.createElement(e);n.async=!0;n.defer=!0;n.src="https://cdn.megadata.co.kr/dist/prod/enp_tracker_self_hosted.min.js";t=g.getElementsByTagName(e)[0];t.parentNode.insertBefore(n,t)})(window,document,"script");
    enp('create', 'common', 'bbq', { device: deviceType });    
    enp('send', 'common', 'bbq');
</script> 
     <!-- Enliple Tracker End --> 
     <!--// Footer --> 
    </div>   
   </div>
  </div>
 </body>
</html>
====================================================================
[Attribute 탐색]
멤버십 약관 => /etc/membership.asp

[CSS Selector 탐색]
footer-sns 클래스 안에 있는 a 태그의 href 정보 = https://www.instagram.com/bbq_offi
footer-sns 클래스 안에 있는 a 태그의 href 정보 = https://www.youtube.com/user/BBQMobile
footer-sns 클래스 안에 있는 a 태그의 href 정보 = http://blog.naver.com/blogbbq

*/