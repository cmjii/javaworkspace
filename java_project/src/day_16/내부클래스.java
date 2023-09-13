package day_16;

public class 내부클래스 {

	public static void main(String[] args) {
		/* 내부 클래스 : 클래스 내부에 선언한 클래스
		 * 	- 외부클래스 -> 내부 클래스
		 * 	- 다른 외부에서는 내부 클래스를 사용할 일이 없고, 내부 클래스가 외부클래스와 밀접한 연관이 있을 경우
		 * 	- 내부적으로 사용할 목적으로 만드는 클래스이기 때문에 private 선언하는 것을 권장
		 *  - 내부 클래스가 생성되는 시기 : 외부 클래스가 생성 된 후 내부클래스가 생성됨
		 * 익명 (anonymous class) 내부 클래스 -> 익명 클래스를 사용하기 위해 내부클래스 사용
		 * */
		
		A a = new A();
		a.outprint();
		B b = new B(); //불가능
		
		

	}

}
//외부 클래스
class A{
	//내부 클래스
	private int num = 10;
	private int num2 = 20;
	private B b;
	
	public A () {
		b = new B();
	}
	
	class B{
		int inNum = 100;
		public void print() {
			System.out.println("내부 클래스 inNum: "+inNum);
			System.out.println("외부클래스 num: "+num);
			System.out.println("외부클래스 num2: "+num2);
		}
	}
	
	public void outprint() {
		b.print(); //내부 클래스의 객체 변수를 사용하여 메서드 호출
	}
	
}
