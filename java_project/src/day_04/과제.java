package day_04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5명의 점수를 입력받아서 배열에 저장하고,
		//점수의 합계와 평균을 출력
		//최고점수
		int size = 5;
		int [] arr = new int [size]; 
		int t =0; double b =0; int c=0; int min=100;//초기값은 항상 0이 아님.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("점수를 차례대로 입력해주세요.");
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			t = t+arr[i];
			b = (double)t/arr.length;
			c= Math.max(arr[i], c);
			min = Math.min(arr[i],min);
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//					
		}
		
		System.out.println("합계 : " + t);
		System.out.println("평균 : " + b);
		System.out.println("최고점수 : " + c);
		System.out.println("최소 점수 : " + min);
		
		scan.close();
		
		
		
		
		
		
	}

}
