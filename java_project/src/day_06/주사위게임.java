package day_06;

public class 주사위게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주사위를 던져서 총 30칸을 이동하면 끝
		// 주사위를 던질 때 마다 1~6까지 랜덤으로 추출 
		// 주사위 : 3 -> 3칸 이동 -> 27칸 남았습니다.
		// 주사위 : 6 -> 6칸 이동 -> 21칸 남았습니다.
		// 30칸 도착시 도착! 총 이동 횟수 : 8번
		
		
		int cnt = 0;
		int tmp = 0;
		int num1 = 30;
		int num = 0;
		
		
//		for(int i = tmp; i<30; i++) {
//			num = (int)(Math.random()*6)+1;
//			if(num==1) {
//				System.out.println("주사위 : "+num);
//				System.out.println(num +"칸 이동");
//				num1-=num;
//				tmp+=num;
//				System.out.println(num1+"칸 남았습니다.");
//				
//			} else if (num==2) {
//				System.out.println("주사위 : "+num);
//				System.out.println(num +"칸 이동");
//				num1-=num;
//				tmp+=num;
//				System.out.println(num1+"칸 남았습니다.");
//				
//			} else if (num==3) {
//				System.out.println("주사위 : "+num);
//				System.out.println(num +"칸 이동");
//				num1-=num;
//				tmp+=num;
//				System.out.println(num1+"칸 남았습니다.");
//				
//			} else if (num==4) {
//				System.out.println("주사위 : "+num);
//				System.out.println(num +"칸 이동");
//				num1-=num;
//				tmp+=num;
//				System.out.println(num1+"칸 남았습니다.");
//				
//			} else if (num==5) {
//				System.out.println("주사위 : "+num);
//				System.out.println(num +"칸 이동");
//				num1-=num;
//				tmp+=num;
//				System.out.println(num1+"칸 남았습니다.");
//				
//			} else if (num==6) {
//				System.out.println("주사위 : "+num);
//				System.out.println(num +"칸 이동");
//				num1-=num;
//				tmp+=num;
//				System.out.println(num1+"칸 남았습니다.");
//				
//			} 
//			if (tmp>=30) {
//				System.out.println("도착"); break;
//			}
//			cnt++;
//		} System.out.println(cnt+" 번 완주");
//		
		
		System.out.println("------------------------------------------------------------------------");
		
		while(tmp < num1) { //true 값이 되어야 반복
			//random 수 생성
			num = (int)(Math.random()*6)+1;
			tmp += num; //거리 합산
			cnt++;
			System.out.println("주사위 : "+num+"칸 이동 -> " + (num1-tmp) +"칸 남았습니다.");
		}
	
		System.out.println("완주"+" 총 이동 횟수 : "+cnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i = tmp ; i < 30; i++) {
//			num = (int)(Math.random()*6)+1;
//			switch (num) {
//			case 1 :  num1+=1;
//			System.out.print("주사위 : " + num +  "이동");
//			System.out.println( 30- num1 + " 칸 남았습니다.");
//			break;
//			
//			case 2 : num1+=2;
//			System.out.print("주사위 : " + num +  "이동");
//			System.out.println( 30- num1 + " 칸 남았습니다.");
//			break;
//			
//			case 3 : num1+=3;
//			System.out.print("주사위 : " + num + "이동");
//			System.out.println(30- num1 + " 칸 남았습니다.");
//			break;
//			
//			case 4 : num1+=4;
//			System.out.print("주사위 : " + num +  "이동");
//			System.out.println(30- num1 + " 칸 남았습니다.");
//			break;
//			
//			case 5 : num1+=5;
//			System.out.print("주사위 : " + num +  "이동");
//			System.out.println(30- num1 + " 칸 남았습니다.");
//			break;
//			
//			case 6 : num1+=6;
//			System.out.print("주사위 : " + num +  "이동");
//			System.out.println(30- num1 + " 칸 남았습니다.");
//			break;
//			
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
