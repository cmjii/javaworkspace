package new01;

import java.util.Scanner;

public class New02 {

	public static void main(String[] args) {
//		for문 이용하여 1~10 짝수만 출력
//		1부터 내가 입력한 수 까지의 5의 배수 출력
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();		
		for(int i =1; i<=num; i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}

}
