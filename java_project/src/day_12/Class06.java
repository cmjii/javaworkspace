package day_12;

public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EzenStudent E = new EzenStudent("홍길동","4444","","인천");
		E.print();
		System.out.println(E);
	}

}

/* 객체를 초기화 하는 방법 : 기본값(null,0), 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시
 * 2. 초기화 블럭 : {} 멤버변수를 초기화
 * 3.생성자 : 객체를 초기화 하는 방법
 * 초기화 우선순위
 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자
 * */

/* 멤버변수 : 지점 , 이름, 반, 전화번호
 * 생성자
메서드 : 출력(print) getter setter
 * */
 class EzenStudent{
	 //기본값
	 private String gigum="지점";//=지점을 넣은 이유는 확인해보려고 기본은 null임
	 private String name;
	 private String tel;
	 private String group;

	 {
		 //초기화 블럭
		 gigum="incheon"; //incheon이 지점을 덮음 출력 : incheon
		 group="미정";
	 
	 }
	 
	 public EzenStudent() {}
	 public EzenStudent (String name, String tel) { //이름과 전화번호 생성자
		 this.name= name;	this.tel=tel;	
	 }
	 
	 public EzenStudent (String name, String tel, String group, String gigum) { //모든 변수 생성자 //생성자가 초기화 덮음
		 this.name= name;	this.tel=tel;	this.group=group;	this.gigum=gigum;
	 }
	 
	 public void print(){
		 System.out.print( name+" "+tel+" "+group+" "+gigum);
	 }
	 
	public String getGigum() {
		return gigum;
	}
	public void setGigum(String gigum) {
		this.gigum = gigum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	
	
	@Override
	public String toString() {
		return "EzenStudent [gigum=" + gigum + ", name=" + name + ", tel=" + tel + ", group=" + group + "]";
	}
	 
	 
	 
	 
 }