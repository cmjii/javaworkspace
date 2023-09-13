package sale;

import java.util.Scanner;

import day_18.SaleManager;

public class SaleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SaleManager sm = new SaleManager();
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
	
		do {
			System.out.println("1. 메뉴 추가 | 2. 메뉴 출력 |3. 주문 | 4. 주문 리스트 |5. 종료");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: sm.add(scan); break;
			case 2: sm.printProduct(); break;
			case 3 : sm.orderPick(scan); break;
			case 4 : sm.printOrder(); break;
			case 5: break;
			default: System.out.println("잘못된 메뉴");
			} 
		} while (menu != 5);
		System.out.println("프로그램 종료");
		
		
	}

}
