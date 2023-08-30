package day_02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		//연산자는 + - * / %
		//ex) 3 2 + => 3+2=5 , 6 3 / => 6/3=2
		//다른 연산자가 들어오면 잘못된 입력
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num = scan.nextInt(); 	
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();   
		
		System.out.println("연산자를 입력하세요.");
		String str = scan.next();
		
		//char op= scan.next().charAt(0); => 한글자 입력시 사용
		
		int a = num+num1;
		int b = num-num1;
		int c = num*num1;
		int d = num/num1;
		int e = num%num1;
		
		
		switch(str) {
		case "+" : System.out.println(num + str + num1 + "=" + a);  break;
		case "-" : System.out.println(num + str + num1 + "=" + b);  break;
		case "*" : System.out.println(num + str + num1 + "=" + c);  break;
		case "/" : System.out.println(num + str + num1 + "=" + d);  break;
		case "%" : System.out.println(num + str + num1 + "=" + e);  break;
		default : System.out.println("잘못된 입력입니다.");
		
		//스트링으로 사용시 +가 연결연산자로 사용되어 ""따로 적어줄 필요는 없지만
		//char로 사용할 시 정수형으로 추출되기 때문에 연결연산자가 아닌 더하기 연산자로 변하기 때문에 ""을 사용하여 연결 연산자로 바꿔주어야한다.
		
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
