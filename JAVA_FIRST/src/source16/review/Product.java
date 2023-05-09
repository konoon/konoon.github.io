package source16.review;

// Scanner를 이용해서 상품의 내용을 키보드로 입력 받아 Product 객체를 생성하고
// List 컬렉션에서 관리하는 자바 프로그램 제작 
public class Product {
	private int pno;      // Product 넘버
	private String name;  // Product 이름
	private int price;    // Product 가격
	private int stock;    // Product 재고량
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
