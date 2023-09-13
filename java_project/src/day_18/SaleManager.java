package day_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleManager {

	//menu 클래스를 리스트로 구현
	
	 private ArrayList<Menu> product = new ArrayList<Menu>(); //String, int
	 private ArrayList<Menu> order = new ArrayList<Menu>();
	 private int totsum;
	 
	 
	 public SaleManager() {
		 addMenu();
	 }
	 
	 public void addMenu( ) {
		 product.add(new Menu("햄버거",7000)); //객체 생성
		 product.add(new Menu("피자",15000));
		 product.add(new Menu("음료수",2000));
		 product.add(new Menu("과자",1000));
		 product.add(new Menu("사탕",500));

	 }
	 
	 
	 
	 //메뉴 추가 기능
	 
	 public void add(Scanner scan) {
		 System.out.println("메뉴명: ");
		 String menu = scan.next();
		 System.out.println("가격: ");
		 int price = scan.nextInt();
		 
		 Menu m = new Menu(menu, price);
		 product.add(m);
		 System.out.println("메뉴 추가 완료");
	 }
	 
	 
	 
	 
	//메뉴리스트
	
	 public void printProduct() {
		 System.out.println("----menu----");
		 for(int i =0; i<product.size(); i++) {
			 System.out.println((i+1)+"."+product.get(i));
		 }
		 System.out.println("---------------------");
	 }
	 
	 
	 
	
	//메뉴 생성, 주문 처리
	 
	 public void orderPick(Scanner scan) {
		 System.out.println("주문메뉴: ");
		 //1.메뉴를 직접 한글로 받는 케이스
		 //String menu = scan.next();
		 
		 //2.메뉴를 숫자로 받는 케이스
		 int pick = scan.nextInt(); //번호 : index-1
		 String tmpMenu = product.get(pick-1).getMenu();//메뉴 빼오기
		 if(tmpMenu == null) {
			 System.out.println("찾는 메뉴가 없습니다.");
			 return;
		 } else { 
			 System.out.println("주문수량: ");
			 int count = scan.nextInt();
			 int tmpPrice = product.get(pick-1).getPrice();//가격 빼오기 
			 totsum += (tmpPrice * count);
			 Menu m = new Menu(tmpMenu,count); // 메뉴와 개수
			 order.add(m);
			 
		 }
	 }
	 
	 
	 
	 
	 //주문리스트로 구현
	 public void printOrder() {
		 int sum=0;
		 int index = 1;
		 for(Menu m : order) {
			 String menu = m.getMenu();
			 int price = findMenu(menu);
			System.out.println(index+"."+m+"  "+m.getPrice()+"  "+(m.getPrice()*price));
			 
		 }
		 System.out.println("-------------");
		 System.out.println("주문 총액 : "+totsum);
	 }
	 
	 
	 public int findMenu(String menu) {
		 for(Menu m : product) {
			 if(m.getMenu().equals(menu)) {			 
			 return m.getPrice();
		 }
	 } return -1;
 } 	
	 
	 
	 
	 //스캐너 받아와서 처리
	

}
