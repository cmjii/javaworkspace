package day_07;

public class Method_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		구구단 출력
//		1.단 1개를 주고, 구구단 출력
//		2.2~9까지 반복하여 모든 단을 출력
//		3. 출력 모양 2*1=2

		dan(5);
		System.out.println("----------------------------");
		
	
		for(int i=2; i<=9; i++) {
			dan(i);
			System.out.println("--------------------------");
		}
	}
//	기능 : 단이 주어지면 그 단의 구구단을 출력(리턴x)
	
	public static void dan(int num) {
		for(int i =1; i<=9; i++) {
			if(num>=2&&num<=9) {
				int a = 0;
				a = num*i;
				 System.out.println(num+"*"+i+"="+a);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
