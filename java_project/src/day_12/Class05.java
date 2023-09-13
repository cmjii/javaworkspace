package day_12;

public class Class05 {

	public static void main(String[] args) {
		/* static이 붙은 멤버변수, 메서드들은 클래스 멤버변수,메서드라고 한다.
		 * static이 안붙은 멤버변수, 메서드들은 객체(인스턴스) 멤버변수,메서드라고 한다.
		 * 
		 * - 객체 멤버변수,메서드들은 객체를 통해 사용되고, 생성된다.
		 * - 각 객체마다 독립적으로 변수와 메서드가 사용된다.
		 * 
		 * - 클래스 멤버변수, 메서드는 클래스를 통해 사용된다.
		 * - 클래스명.메서드/변수 호출
		 * (객체를 통해서 호출이 가능하나 일반적이지 않다.)
		 * 클래스 멤버변수는 하나의 멤버변수를 모든 객체가 공유,사용
		 * - 모든 객체들이 (하나의 클래스를 통해 생성되는 모든 객체) 동일한 값을 사용한다면 static을 붙이는 것을 고려
		 * 
		 *  클래스,객체 변수들은 생성 시점이 달라서 메서드에서 사용될 수 있는 환경이 다르다.
		 *  - 객체 멤버는 이미 클래스가 생성된 후에 생성 / 클래스의 멤버 메서드를 객체에서는 사용가능
		 *  - 클래스 멤버 변수는 클래스,객체의 멤버에서 모두 사용 가능
		 *  - 클래스 멤버 메서드는 클래스, 객체의 멤버에서 모두 사용 가능
		 *  - 객체 멤버 변수,메서드는 클래스 멤버 메서드에서 사용 불가 (객체를 생성해야지만 사용가능)
		 * */
		
		TV t = new TV();
		t.ispower(); //객체가 있어야지만 사용 가능
		t.printbrand(); //클래스 멤버 메서드 호출 (잘 사용하지않음)
		TV.printbrand(); //클래스명.메서드명 호출 (사용) 객체가 생성되지 않아도 사용 가능

	}

}


class TV{
	private boolean power;
	//final : 최종. 수정 불가
	private final static String brand = "samsung";
	
	public void ispower() {
		System.out.println("제조사 : "+brand);
		if(!power) {
			power = true;
			System.out.println("TV가 켜졌습니다.");
		}else {
			power = false;
			System.out.println("TV가 꺼졌습니다.");
		}
	}
	public static void printbrand() {
		System.out.println("제조사 : " + brand);
		//클래스 메서드에서 객체 변수 사용 불가
		//System.out.println("전원상태 : "+power); power 에러
	}
	
}