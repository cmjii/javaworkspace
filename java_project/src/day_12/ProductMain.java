package day_12;

import java.util.Scanner;

//ProductMain 클래스 생성
//Product 배열 생성 [10] 메뉴 추가 메서드 활용
//상품 등록 후 상품 리스트 출력

//상품을 등록하시겠습니까? y : 등록 n : 취소
//y= 상품이름과 가격을 등록 받아 배열에 등록
//n= 전체 등록 리스트 출력
public class ProductMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product[]p = new Product[10];
		
		char menu ='y';
		int cnt =0; //while에서 index를 핸들링 하기 위한 변수
		
		while(menu !='n') {
			System.out.println("상품등록(y/n) >>");
			menu = scan.next().charAt(0);
			
			if (menu=='y') {
				//반복입력
				System.out.println("상품명 >");
				String name = scan.next();
				
				System.out.println("가격 >");
				int price = scan.nextInt();
				
				//객체를 생성해서, 메뉴와 가격을 등록 -> 배열 cnt번지에 추가
				//생성자 이용
				Product tmp = new Product(name,price);
				p[cnt] = tmp;
				
				//메서드 이용
				p[cnt] = new Product();
				p[cnt].insertProduct(name, price);
				cnt++; //index증가
			}else {
				if(menu =='n') {
					System.out.println("상품등록 종료");
				}else {
					System.out.println("y/n만 가능합니다.");
				}
			}//menu =='n'
		}
		System.out.println("---등록된 상품 리스트---");
		for(int i =0; i<cnt; i++) {
			p[i].print();
		}
		
	}		
	}

