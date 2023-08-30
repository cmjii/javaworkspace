package day_03;

public class For_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//최소 공배수 (공통된 배수)
		// 10 : 10 20 30 40 50 .....
		// 15 : 15 30 45 60 .....
		//공배수 : 30, 60 ..... 최소공배수 : 30.....
		
		int num1 = 10;
		int num2 = 15;
		int a = 0;
		
		// for(int i = num1; ; i+=num1)
		// if(i%num1 == 0 && i%num2 == 0)
		for(int i =1; ; i++) {
			a = num1*i;
		
			if(a% num1==0 && a%num2==0 ) {
				System.out.println(a);break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
