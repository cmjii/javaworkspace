package day_08;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 로또번호 생성 (1~45랜덤으로 생성)
		 * 로또번호 -> 1~45까지 6개 = 사용자번호
		 * 당첨번호 -> 1~45까지 7개 -> 보너스 번호
		 * 
		 * 중복생성 금지
		 * 로또번호 (6자리) 123456
		 * 당첨번호 (6자리 + 1자리) 123456[7]
		 * 로또 등수 확인
		 * 1등 : 6자리 일치
		 * 2등 : 5자리 일치 + 보너스 번호 일치
		 * 3등 : 5자리 일치
		 * 4등 : 4자리 일치
		 * 5등 : 3자리 일치
		 * 나머지 꽝
		 * */
		System.out.println("로또번호");
			int num[] =number();
			System.out.println();
		System.out.println("당첨번호");
			int lo[] = lotto();
			System.out.println();
			System.out.println("등수");
		number(num,lo);
			
		
			
	}
	//로또번호 6개
	public static int [] number() {
		int [] num1 = new int [6]; 
		
		for(int i = 0; i<num1.length; i++) {
			num1[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(num1[i]==num1[j]) {
					i--; break;
				}
			}	
		}	
		for(int i = 0; i<num1.length; i++) {
			System.out.print(num1[i]+" ");
		}
		return num1;
	}
	//당첨번호 7개
	public static int [] lotto() {
		int [] num2 = new int [7]; 
		
		for(int i = 0; i<num2.length; i++) {
			num2[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) { //중복제거
				if(num2[i]==num2[j]) {
					i--; break;
				}
			}	
		}	
		for(int i = 0; i<num2.length; i++) {
			System.out.print(num2[i]+" ");
		}
		return num2;
	}
	
	public static void number(int num1[], int num2[]) {
		int cnt =0;
		for(int i =0; i<num1.length; i++) {
			for(int j=0; j<num1.length; j++) {
				if (num2[i]==num1[i]) {
					cnt++;
				}
			}
		}
		
		if(cnt==6) {
			System.out.println("1등");
		}else if(cnt==5) {
			for(int i =0; i<num1.length; i++) {
				if(num1[i]==num2[6]) {
					System.out.println("2등");
					
				}
			}
		} else if (cnt==5) {
			System.out.println("3등");
		} else if (cnt==4) {
			System.out.println("4등");
		} else if (cnt==3) {
			System.out.println("5등");
		} else {
			System.out.println("꽝");
		}
	}
	
}
	
	

	
	
