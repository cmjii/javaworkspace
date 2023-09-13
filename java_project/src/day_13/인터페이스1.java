package day_13;

public class 인터페이스1 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수로만 이루어진 클래스 
		 * 추상메서드 : 선언부만 있고 구현은 없는 메서드
		 * 키워드 : abstract 인터페이스에서는 키워드를 안붙여도 상관없음.
		 * 
		 * interface 인터페이스명{
		 * 	- 기능 요약서
		 * 	- 자체적으로 사용 불가 인터페이스를 구현한 클래스로 활용
		 * 	- 구현 키워드 : implements
		 * 	- 인터페이스는 멤버 변수가 없다. 항상 이 부분을 염두하여 메서드 정리를 해야함
		 * }
		 * 
		 * - 상속은 단일 상속이 원칙
		 * - 구현은 여러개 가능
		 * */
		
		TV t = new TV();
		t.turnOn();
		t.chUp();
		t.chUp();

	}

}

interface Power{
	abstract void turnOn();
	abstract void turnOff();
}

interface Remocon{
	void chUp();
	void chDown();
}

class TV implements Power, Remocon{

	private boolean power;
	private int ch;
	
	@Override
	public void chUp() {
		ch++;
		System.out.println("현재채널"+ch);
		
	}

	@Override
	public void chDown() {
		ch--;
		System.out.println("현재채널"+ch);
		
	}

	@Override
	public void turnOn() {
		power = true;
		System.out.println("TV가 켜졌습니다");
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("TV가 꺼졌습니다.");
		
	} //다중 구현 가능.
	
}

//수강 관리 프로그램
// 1. 인터페이스 생성 - 학생 리스트 출력 메서드 , 학생을 추가하는 메서드 , 학생을 검색하는 메서드 , 학생의 수강 신청 메서드 , 학생의 수강 철회 메서드 
// 2. 클래스 - 학생클래스(학생클래스는 한 학생의 기본정보와 수강 클래스를 포함해야함 배열로5개), 과목클래스 (한 과목의 정보를 나타내는 클래스), 매니저 클래스 (인터페이스를 구현, 매서드 구현)
//메인 - (메뉴 생성 / 입력받아 메서드를 실행시키는 기능 )