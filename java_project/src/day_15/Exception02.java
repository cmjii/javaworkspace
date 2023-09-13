package day_15;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// try~catch문으로 예외처리
		// sysout 출력 예외처리
		
		//Exception02 c = new Exception02();
		//c.cal();
		
		try {
		System.out.println(calc(4, 0, '+'));
		System.out.println(calc(4, 0, '-'));
		System.out.println(calc(4, 0, '/'));
		System.out.println(calc(4, 0, '-'));

		} catch (Exception e) {
			e.printStackTrace(); // 에러 구문 출력
			System.out.println(e.getMessage());
		}
		System.out.println("계산기 종료");
	}
		
		
		
	//두 수, 연산자를 입력받아 4칙 연산을 수행하고 결과를 리턴하는 메서드 생성
	//switch
		
		//throw를 발생시키게되면 예외를 메서드를 호출하는 객체에게 넘기는 현상
		//throw를 발생시키게되면 메서드 선언부 끝에 throws 발생할 수 있는 예외를 반드시 적어줘야함
		//RuntimeException 생략가능
		public static double calc(int num1, int num2, char op) throws RuntimeException {
			double result = 0; //리턴값을 담을 변수
			//예외가 발생할 수 있는 상황을 미리 앞에서 처리 
			if ((op =='/' || op=='%')&&num2 ==0) {
				throw new RuntimeException("num2는 0이 될 수 없습니다.");
			}
			
			switch (op) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default : throw new RuntimeException(op + "는 산술연산자가 아닙니다.");
			}
			return result;
		
		
		
		
		
		
		
		
		
	
//	public void cal() {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자를 입력해주세요.");
//		int num1= scan.nextInt();
//		System.out.println("두번째 숫자를 입력해주세요.");
//		int num2= scan.nextInt();
//		System.out.println("연산자를 입력해주세요. (+ - * /)");
//		String p = scan.next();
//		scan.close();
//	
//	switch (p) {
//	
//	case "+" : System.out.println(num1 + num2); break; 
//	case "-" : System.out.println(num1 - num2); break; 
//	case "*" : System.out.println(num1 * num2); break; 
//	case "/" : System.out.println(num1 / num2); break;  
//	default : System.out.println("잘못된 값입니다.");
//	}
//	
//	
//	
//	
//	}
	
	

	
		}
}
