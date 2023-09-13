package day_14;

public class ������02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Human h = new Human();
//		h.eating();
//		h.move();
		
		//�θ� Ŭ������ �̿��Ͽ� �ڽ� Ŭ���� ����
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
	//	Tiger t = new Animal(); �ڽ� Ŭ�����κ��� �θ�Ŭ������ �����ϴ� ���̽��� �ȵ�
		
		
		������02 test = new ������02();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
	//	Tiger h = (Tiger)hAnimal;
		Tiger t = (Tiger)tAnimal;
	//h.hunting();
		t.hunting();
		
		//instanceof ������ true, false
		//��ü�� instanceof Ŭ������
		System.out.println(hAnimal instanceof Tiger); //false
		System.out.println(tAnimal instanceof Tiger); //true
		
		if(hAnimal instanceof Tiger) {
			Tiger t1 = (Tiger)hAnimal;
		}
		
		//�迭�� ����
		Animal [] aniList = new Animal[5];
		int cnt =0;
		aniList[cnt]=hAnimal;
		cnt++;
		aniList[cnt]=tAnimal;
		cnt++;
		aniList[cnt]=eAnimal;
		cnt++;
		System.out.println("--down--");
		test.testDown(aniList, cnt);
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
	//�θ� ������ ��ü�� �����ϰ� �Ǹ� �ڽ��� ���������� ������ �ִ� �޼��� ���Ұ�
	//�ڽ��� ������ ������ �ִ� �޼��带 ����Ϸ���, �ٿ�ĳ������ ����� ��.
	//�θ��� ���� �ƴ� �ڽ��� ���·� ��ȯ
	public void testDown(Animal[] list, int cnt) {

		for(int i =0; i<cnt; i++) {
			Animal ani = list[i];
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readbook();
			}else if(ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
			}else if(ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
			}else {
				System.out.println("casting Error");
			}
		}
		
	}
	
}

class Animal{
	public void move() {
		System.out.println("�������� �����Դϴ�.");
	}
	public void eating () {
		
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	} public void readbook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	public void flying() {
		System.out.println("�ָ��ָ� ���ϴ�.");
}
}

