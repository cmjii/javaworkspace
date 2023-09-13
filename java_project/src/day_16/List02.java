package day_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* --메뉴판--
		 * 1.햄버거 7000
		 * 2.피자 15000
		 * 3.음료수 2000
		 * 4.과자 1000
		 * 5.사탕 500
		 * 6.프로그램 종료
		 * 
		 * 메뉴선택 > 1
		 * 수량을 선택 > 2
		 * => 1번 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 다른 번호 누르면 메뉴선택 > 3번
		 * 수량 > 2
		 * => 3번 음료 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 0
		 * --선택한 메뉴--
		 * 1번 햄버거 2개, 2번 음료 2개 선택
		 * 총 지불금액 ----원
		 * */
		
		
	FoodManager f = new FoodManager(); //add 완료
	System.out.println(f.getList1());
	System.out.println(f.getList2());
	
	ArrayList<Integer> order = new ArrayList<>();
	ArrayList<Integer> count = new ArrayList<>();
	
	int menu = -1;
	
	do {
		f.printMenu(); //메뉴 출력
		menu = scan.nextInt(); //메뉴 입력받기
		//1~5 일반메뉴, 6 프로그램 종료, 0 메뉴선택 끝
		if(menu==6) {
			System.out.println("프로그램 종료");
			break;
		}
		
		if(menu!=0) {
			if(menu<6) {
				System.out.println("수량 : ");
				int cnt = scan.nextInt();
				order.add(menu);
				count.add(cnt);
				f.sale(menu, cnt);
				System.out.println("주문종료는 0번 프로그램 종료는 6번");
			} else {
				System.out.println("잘못된 메뉴");
			}
		}
		
	}while(menu!=0); //메뉴 주문의 종료시점 결정 
	//메뉴의 전체 금액을 출력 totsum
	System.out.println("--메뉴확인--");
	for(int i =0; i<order.size(); i++) {
		System.out.print(f.getList1().get(order.get(i)-1)+" "); //피자
		System.out.println(count.get(i)+"개");
		int price = f.getList2().get(order.get(i)-1);
		System.out.println(" "+(price*count.get(i)));
	}
	System.out.println("--------------------");
	System.out.println("총금액 : "+f.getTotsum());
}
}

class FoodManager {
	//멤버변수 ArrayList 메뉴, ArrayList 가격 
	//그 외 필요한 멤버변수는 알아서
	
	public FoodManager() {
		add();
	}
	
	
	//메서드
	//츨력 : 결과출력, 메뉴출력, (주문)add(), (결과출력)sale()
	
	
	private List<String> list1 = new ArrayList<String>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	private int sum;
	private int totsum;
	
	
	public void printMenu() {
		System.out.println("--menu--");
		System.out.println("1.햄버거 7000");
		System.out.println("2.피자 15000");
		System.out.println("3.음료수 2000");
		System.out.println("4.과자 1000");
		System.out.println("5.사탕 500");
		System.out.println("메뉴 선택 >");
	}
	
	public void add() {
		//list에 값 추가
		list1.add("햄버거"); //index0
		list1.add("피자");
		list1.add("음료수");
		list1.add("과자");
		list1.add("사탕");
		
		list2.add(7000); //index0
		list2.add(15000);
		list2.add(2000);
		list2.add(1000);
		list2.add(500);
	}
	
	public void sale(int menu, int count) {
		//menu는 list2의 index번호로 사용
		sum = list2.get(menu-1) * count; //하나의 주문에 대한 금액
		totsum +=sum;
		System.out.println("----------");
		System.out.println("주문하신 메뉴는 "+list1.get(menu-1)+" "+count+"개 입니다.");
		System.out.println("금액 : "+sum);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public List<Integer> getList2() {
		return list2;
	}

	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTotsum() {
		return totsum;
	}

	public void setTotsum(int totsum) {
		this.totsum = totsum;
	}
	
	
	
}