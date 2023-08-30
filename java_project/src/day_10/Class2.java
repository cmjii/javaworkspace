package day_10;

public class Class2 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 :  name, date, power, speed
		 * 고정되어 있는 값만 생성자로 생성 (name, date)
		 * 메서드 : 파워 온 오프, 스피드 up,down, 
		 * 
		 * 
		 * 생성 순서
		 * 1. 멤버변수 선언
		 * 2. 생성자
		 * 3. 메서드
		 * 4. getter, setter
		 * */
		
//		Car c1 = new Car();
//		c1.setPower(true);
//		c1.power();
//		
//		c1.speedup();
//		c1.speedup();
//		c1.speedup();
//		c1.speedup();
//		c1.speedup();
//		c1.speedup();
//		c1.speedup();
//		c1.speedup();c1.speedup();c1.speedup();c1.speedup();
//		
//		c1.print();
		
		
		Car2 c = new Car2("스파크","2013","흰색");
		c.setPower(true);
		c.power();
		
		
		
		
		
		
	}

}

class Car{
	
	boolean power;
	private int speed;
	private int date;
	private String name;
	
	
	public Car() {}
	
	public Car(int date, String name) {
		
		this.date=2014;
		this.name="캐스퍼";
	}
	
	public void print() {
		System.out.println("차종 :"+name+"년식 : "+date);
	}
	
	public void power() {
		if(power==true) {
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼졌습니다.");
		}
		
	}
	
	public void speedup() {
		speed++;
		System.out.println("현재 속도"+speed);
		if(speed==10) {
			System.out.println("최고속도");
	}	else if(speed>10) {
		System.out.println("더이상 속도를 낼 수 없습니다"+" 현재속도:"+speed );
	}
	}
	
	public void speeddown() {
		speed--;
		System.out.println("현재 속도"+speed);

	}
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}

class Car2{
	
	private String name;
	private String year;
	private String color;
	private boolean power;
	private int speed;
	
	//생성자
	public Car2() {}//기본생성자
	public Car2(String name, String year,String color) {
		this.name=name;
		this.year=year;
		this.color=color;
	}
	
	//메서드
	public void power() {
		if(power==true) {
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼졌습니다.");
		}		
	}
	
	public void speedup() {
		speed++;
		System.out.println("현재 속도"+speed);
		if(speed==10) {
			System.out.println("최고속도");
	}	else if(speed>10) {
		System.out.println("더이상 속도를 낼 수 없습니다"+" 현재속도:"+speed );
	}
	}
	
	public void speeddown() {
		speed--;
		System.out.println("현재 속도"+speed);
}

	//getter setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}