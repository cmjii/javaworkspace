package day_06;

public class Method02 {

	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public static void div(double num1, double num2) {
		System.out.println(num1/num2);
	}
	
	public static double div1(int num1, int num2) {
		return (double) num1/num2;
	}
	
	public static void re(int num1, int num2) {
		System.out.println(num1%num2);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메서드를 활용하여 계산기를 작성
		//메서드는 +-*/%
		//두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		//+ 호출(메인) - 호출(메인) *호출 / 호출(리턴 더블) % 호출
		
		int sum = add(3, 5);
		System.out.println(sum);
		
		int sub = sub(3, 5);
		System.out.println(sub);
		
		double div1 = div1(3,5);
		System.out.println(div1);
		
		mul(3,5);
		div(3,5);
		re(3,5);
		
	
		
		//다른 클래스에 있는 메서드를 사용 
		//클래스 -> 정의서 -> 객체를 생성해서 메서드를 시행
		//현재 시점에서 객체 생성없이 메서드를 사용할 수 있는 이유 = static
		//static 있는 경우 / 클래스명, 메서드명
		//static 없는 경우 / 선언만 해놓고 생성이 안되었다는 것을 의미
		//객체를 생성 -> 클래스 필요
		Method02 me = new Method02();
		int s = me.add(20, 30);
		System.out.println(s);
	}

}
