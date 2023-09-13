package day_12;

public class 상속02 {

	public static void main(String[] args) {
		// 오버라이딩 : 부모 클래스에게 물려받은 메서드를 재정의 하는 것. (변경할 일 없으면 그냥 사용하면 됨)
		// 조건 : 부모클래스의 메서드와 선언부가 일치해야함
		// 접근제한자는 같거나 더 넓은 범위 접근제한자를 써야 한다. (범위 축소 불가)
		
		Dog d = new Dog();
		d.info(); d.howl();
		System.out.println();
		Cat c = new Cat("나비","고양이과");
		c.info(); c.howl();
		
		Tiger t = new Tiger("어흥이","고양이과");
		t.info(); t.howl();

	}

}

class Tiger extends Animal{ //가장 많이 사용
	public Tiger(String name, String category) {
		//부모의 생성자 호출
		super(name,category); 
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥");
	}
	
}

class Dog extends Animal { //자식클래스 extends 사용하여 animal 부모 클래스 상속
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {  //오버라이드를 사용해서 부모 howl메서드 사용 (자식 클래스 안에서 선택)
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍");
	}
	
	
}



class Cat extends Animal { //자식클래스 extends 사용하여 animal 부모 클래스 상속
//	public Cat() {
//		setName("고양이"); //부모 클래스에 있는 변수 사용
//		setCategory("호랑이과");
//	}
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() { //오버라이드를 사용해서 부모 howl메서드 사용 (자식 클래스 안에서 선택)
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹");
	}
	
	
}



class Animal { //부모
	private String name; //이름
	private String category; //종
	
	public Animal() {}
	public Animal (String name, String category) {
		this.name = name; this.category=category;
	}
	
	//정보출력
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("종 : "+category);
	}
	
	
	
	//울음소리
	public void howl() {
		System.out.println("==" + name +" 의 울음소리==");
	}
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	
	
	
	
}