package source16.review;

// Scanner로 입력된 문자열 얻기
public class ProductStorageExample {
	public static void main(String[] args) {

		// ProductStorage 객체를 생성하고 showMenu() 메서드를 호출함.
		ProductStorage productStorage = new ProductStorage();
		productStorage.showMenu();
	}
}

/* 실행 결과
=========================
1. 등록 | 2. 목록 | 3. 종료
=========================
선택 : 1
상품명을 입력해 주시기 바랍니다 ==> 마우스
가격을 입력해 주시기 바랍니다 ==> 10000
재고량을 입력해 주시기 바랍니다 => 5
=========================
1. 등록 | 2. 목록 | 3. 종료
=========================
선택 : 1
상품명을 입력해 주시기 바랍니다 ==> 키보드
가격을 입력해 주시기 바랍니다 ==> 15000
재고량을 입력해 주시기 바랍니다 => 7
=========================
1. 등록 | 2. 목록 | 3. 종료
=========================
선택 : 2
1	마우스	10000	5
2	키보드	15000	7
=========================
1. 등록 | 2. 목록 | 3. 종료
=========================
선택 : 3
프로그램이 종료 되었습니다!
*/
