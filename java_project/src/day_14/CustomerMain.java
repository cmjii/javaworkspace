package day_14;

public class CustomerMain {

	public static void main(String[] args) {
	
		
			Customer[] customerList = new Customer[10];
			
			Customer cLee = new Customer(1001, "리정혁");
			Customer cHong = new Gold(1002, "홍길동");
			Customer cKim = new VIP(1003, "김철수", 1111);
			Customer cchoi = new VIP(1004,"최윤이",2222);
			Customer cppp = new Gold(1005,"피피피");
			Customer cqqq = new Customer(1006,"쿠쿠쿠");
			
			int cnt=0;
			customerList[cnt]=cLee;
			cnt++;
			customerList[cnt]=cHong;
			cnt++;
			customerList[cnt]=cKim;
			cnt++;
			customerList[cnt]=cchoi;
			cnt++;
			customerList[cnt]=cppp;
			cnt++;
			customerList[cnt]=cqqq;
			
			
			
//			int price = cKim.calcPrice(10000);
//			System.out.println("지불금액:"+price);
//			cKim.customerInfo();
			
			System.out.println("---고객 정보 출력---");
	
			//for문을 활용한 고객정보 출력
			
			for(int i =0; i<cnt; i++) {
				customerList[i].customerInfo();
//				System.out.println("이름: " + customerList[i].getCustomerName() );
//				System.out.println("등급: " + customerList[i].getCustomerGrade());
			}
						
		System.out.println();
			
			System.out.println("--할인율과 포인트 계산--");
			//홍길동님이 지불하실 금액은 000원 / 보너스포인트는 00원입니다.
			
			int price = 100000;
			for(int i =0; i<cnt; i++) {
		
			System.out.println(customerList[i].getCustomerName()+"님이 지불하실 금액은 "+customerList[i].calcPrice(price)+"원 / " + "보너스 포인트는 "+customerList[i].bonusPoint+"입니다.");
			
			}
			
			//다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
			//자식의 고유 멤버변수나 메서드를 호출하고자 할 때 필요
			//다운 캐스팅 : 반드시 명시적으로 형변환 해야함.
			//instanceof 원래 그 형태가 맞는지 확인 true, false
			
			//1111한명을 3333
			
			for(int i =0; i<cnt; i++) {
				Customer cus = customerList[i]; //주소복사 (객체 생성 X)
				if(cus instanceof VIP) {
					VIP ckim = (VIP) cus;
					if(cKim.getCustomerID()==1111) {
						ckim.setAgentID(3333);
					}
				
			}customerList[i].customerInfo();
		}	
		
	}
}
