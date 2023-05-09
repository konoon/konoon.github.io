package source16.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Scanner를 이용해서 상품의 내용을 키보드로 입력 받아 Product 객체를 생성하고
//List 컬렉션에서 관리하는 자바 프로그램 제작
// Scanner로 입력된 문자열 얻기
public class ProductStorage {

	// List형 자료관리 컬렉션 생성
	private List<Product> list = new ArrayList<Product>();
	// 키보드 입력 Scanner 생성
	private Scanner scanner = new Scanner(System.in);
	// pno 제공 카운터
	private int counter;
	
	public void showMenu() {
		while (true) {
			System.out.println("=========================");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료");
			System.out.println("=========================");
			
			System.out.print("선택 : ");
			String selectNo = scanner.nextLine(); // 번호 읽어오기
			switch (selectNo) {
			case "1": registerProduct();  // Product 등록
				break;
			case "2": showProducts();  // 등록된 모든 Product 정보 보기
				break;
			case "3": 
				System.out.println("프로그램이 종료 되었습니다!");
				return;  // 프로그램 종료
			}
		}
	}

	public void showProducts() {
		// list에 저장된 모든 Product 정보를 모니터에 출력 표시함.
		for (Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}

	public void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter); // pno 셋팅
			
			System.out.print("상품명을 입력해 주시기 바랍니다 ==> ");
			product.setName(scanner.nextLine()); // 상품명 입력 내용을 읽어서 설정함.
			
			System.out.print("가격을 입력해 주시기 바랍니다 ==> ");
			// 문자열(String) 타입으로 입력된 가격을 정수형 객체타입(Integer)으로 변환해서
			// Product 객체의 가격으로 설정함.
			product.setPrice(Integer.parseInt(scanner.nextLine())); 
			
			// 문자열(String) 타입으로 입력된 재고량을 정수형 객체타입(Integer)으로 변환해서
			// Product 객체의 재고량으로 설정함.
			System.out.print("재고량을 입력해 주시기 바랍니다 => ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			list.add(product); // list에 Product 객체 저장 
		} catch (Exception e) {
			System.out.println("등록 에러 : " + e.getMessage());
		}
		
	}
	
}
