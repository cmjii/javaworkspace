package day_05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//5자리의 숫자를 입력 받아서 입력받은 숫자를 거꾸로 출력
		//ex) 11456 -> 65411
		//각 자리의 합계 출력 6+5+4+1+1
		//ex) 19547 -> 74591 -> 1+9+5+4+7
		
		Scanner scan = new Scanner(System.in);
		System.out.println("다섯자리 숫자를 입력해주세요.");
		int num = scan.nextInt();
		int arr[] = new int[5];
		
		arr[0] = num/10000%10;
		arr[1] = num/1000%10;
		arr[2] = num/100%10;
		arr[3] = num/10%10;
		arr[4] = num%10;
		
		for(int i = 0; i<arr.length; i++) {
			int a = 4-i;
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum = sum + arr[i];	
			}System.out.print(sum);
		
		


		
		scan.close();
		
		
		
		
		// 나누기(/), 나머지(%)
		//12345 -> %10 -> 5 배열에 저장
		//값을 나눈 몫만 다시 나눔값으로 지정
		//12345/10 -> 정수만 나옴. %10으로 나눠서 다시 나머지만 구한다
		//1234->%10->4->배열에 저장
		
		
		
		
		
		
		
/*		int sum=0;
		int i =0;
		
		while(num>0) {       입력받은 num이 0보다 작아지면 false
			int b = num%10;
			arr[i] = b;
			sum+=b;
			num=num/10;
			system.out. println(arr[i]);
			i++;
		} system.out.println("sum:"+sum);
		
*/		
		
		
		
		
		
		
		
		
		
		
		
	}

}
