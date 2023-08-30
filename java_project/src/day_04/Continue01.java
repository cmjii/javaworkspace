package day_04;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Continue : pass,skip 키워드
		 * 1~10까지 출력, 5만 빼고
		 * */
		
//		for(int i =1; i<=10; i++) {
//			if(i==5) {
//			continue;
//			}
//			System.out.println(i+" ");
//			}
//		
		
		
		//1~10까지 홀수만 출력, 짝수일때 continue 써서 출력
		
		for(int i =1; i<=10; i ++) {
			if(i%2==0) {
				continue;
			} System.out.println(i+" ");
		}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
