package day_12;
// 메뉴 이름 , 가격
// 메뉴 추가 메서드
// 메뉴 : 가격 출력 메서드

//ProductMain 클래스 생성
//Product 배열 생성 [10] 메뉴 추가 메서드 활용
//상품 등록 후 상품 리스트 출력

//상품을 등록하시겠습니까? y : 등록 n : 취소
//y= 상품이름과 가격을 등록 받아 배열에 등록
//n= 전체 등록 리스트 출력
public class Product {


	private String name;
	private int price;
	
	public Product() {}
	public Product(String name, int price) {
		this.name=name;	this.price=price;
	}
	
	//삽입메서드
	
	public void insertProduct(String name, int price) {
		this.name=name;	this.price=price;
	}
	
	public void print() {
		System.out.println("메뉴:"+name+"가격:"+price);
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

	
	

	
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
