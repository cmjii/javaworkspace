package day_07;

import java.util.Scanner;

public class 과제 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		계산기 만들기
//		(+ - * / %) 각각 메서드 생성 -> 메서드 바로 출력
//		
//		숫자를 입력받는 메서드 (배열에 담아 리턴), 메뉴 메서드, 각 기능 메서드 
//		3과 5를 입력받으면 메뉴 띄우기
//		메뉴를 출력하고, 메뉴의 번호를 입력받아 리턴
//		메뉴 : 원하는 계산을 선택해주세요.
//		1: 덧셈 2: 뺄셈 3: 곱셈 4: 나눗셈 5: 나머지 그 외: 잘못된 입력
//		각 기능 메서드 -> 바로 출력 (3+5=8)
		
//		main 
//		1. 숫자 메서드 호출 -> 숫자 배열 받기
//		2. 2번 메서드 호출 -> 내 선택 번호 가져오기
//		3. switch(번호) -> 기능메서드
		
		
		int nums[]=getnums();
		
		int select = getSelect();
		
		switch(select) {
		case 1: sum(nums); break;
		case 2: sub(nums); break;
		case 3: mul(nums); break;
		case 4: div(nums); break;
		case 5: rem(nums); break;
		default : System.out.println("잘못된 연산");
		}
		System.out.println("계산기 종료");
		

		
	}

	public static int [] getnums(){
		int[] nums= new int[2]; 
		for(int i =0; i<nums.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력 >");
			nums[i] = scan.nextInt();
			
		}return nums;
	}
	
	
	//매수변수 없음
	//리턴타입 int
	//메서드명 :getSelect
	public static int getSelect() {
		System.out.println("원하는 계산을 선택 > ");
		System.out.print("1번:덧셈"+" 2번:뺄셈"+" 3번:곱셈"+" 4번:나눗셈"+" 5번:나머지");
		int select = scan.nextInt();
		return select;
	}
	
	
	//리턴타입 void
	//매개변수 : 배열
	
	public static void sum(int nums[]) {	
		System.out.println(nums[0]+"+"+nums[1]+"="+(nums[0]+nums[1]));
	}
	
	public static void sub(int nums[]) {	
		System.out.println(nums[0]+"-"+nums[1]+"="+(nums[0]-nums[1]));
	}
	
	public static void mul(int nums[]) {	
		System.out.println(nums[0]+"*"+nums[1]+"="+(nums[0]*nums[1]));
	}
	
	public static void div(int nums[]) {	
		System.out.println(nums[0]+"/"+nums[1]+"="+(double)(nums[0]/nums[1]));
	}
	
	public static void rem(int nums[]) {	
		System.out.println(nums[0]+"%"+nums[1]+"="+(nums[0]%nums[1]));
	}
	
}
