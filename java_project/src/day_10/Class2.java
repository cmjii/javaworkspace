package day_10;

public class Class2 {

	public static void main(String[] args) {
		/* �ڵ��� Ŭ���� ����
		 * ������� :  name, date, power, speed
		 * �����Ǿ� �ִ� ���� �����ڷ� ���� (name, date)
		 * �޼��� : �Ŀ� �� ����, ���ǵ� up,down, 
		 * 
		 * 
		 * ���� ����
		 * 1. ������� ����
		 * 2. ������
		 * 3. �޼���
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
		
		
		Car2 c = new Car2("����ũ","2013","���");
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
		this.name="ĳ����";
	}
	
	public void print() {
		System.out.println("���� :"+name+"��� : "+date);
	}
	
	public void power() {
		if(power==true) {
			System.out.println("�õ��� �������ϴ�.");
		}else {
			System.out.println("�õ��� �������ϴ�.");
		}
		
	}
	
	public void speedup() {
		speed++;
		System.out.println("���� �ӵ�"+speed);
		if(speed==10) {
			System.out.println("�ְ�ӵ�");
	}	else if(speed>10) {
		System.out.println("���̻� �ӵ��� �� �� �����ϴ�"+" ����ӵ�:"+speed );
	}
	}
	
	public void speeddown() {
		speed--;
		System.out.println("���� �ӵ�"+speed);

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
	
	//������
	public Car2() {}//�⺻������
	public Car2(String name, String year,String color) {
		this.name=name;
		this.year=year;
		this.color=color;
	}
	
	//�޼���
	public void power() {
		if(power==true) {
			System.out.println("�õ��� �������ϴ�.");
		}else {
			System.out.println("�õ��� �������ϴ�.");
		}		
	}
	
	public void speedup() {
		speed++;
		System.out.println("���� �ӵ�"+speed);
		if(speed==10) {
			System.out.println("�ְ�ӵ�");
	}	else if(speed>10) {
		System.out.println("���̻� �ӵ��� �� �� �����ϴ�"+" ����ӵ�:"+speed );
	}
	}
	
	public void speeddown() {
		speed--;
		System.out.println("���� �ӵ�"+speed);
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