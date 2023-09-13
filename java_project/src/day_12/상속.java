package day_12;

public class ��� {

	public static void main(String[] args) {
		/* ��� : �θ��� ���� �ڽĿ��� �����ִ� ��
		 * Ŭ���� ��� : �θ� Ŭ������ �������/����޼��带 �����ִ� ��.
		 * ����� �ϴ� ���� : ������ �ؼ� �ߺ��ڵ带 ���̱� ���� ��.
		 * class A(�θ� Ŭ����) / class B(�ڽ�Ŭ����)
		 * 
		 * class B extends A{
		 * 	��� Ű���� : extends
		 * }
		 * 
		 * ����� ������ �θ��� ��������� ��� �޼��带 ����� �� �ִ�.
		 * ���������ڰ� private�̸� �ڽ�Ŭ���������� ���� �Ұ���
		 * ���������� protected : ��ӹ޴� �ڽĿ��� ����ϴ� ������
		 * */

		A a = new A();
		a.setA(50);
		a.setB(10);
		a.setC(20);
		a.print();
		
		
		B b= new B();
		
		b.setA(100);
		System.out.println(b.getA());
		b.setB(200);
		b.setC(300);
		b.setD(10);
		b.num=500; //�������� : �����ڰ� protected�̱� ������ ���������� ����
		b.setE(20);
		b.setF(30);
		b.print();
	}

}


class A{ //�θ�Ŭ����
	private int a,b,c; //���� ��밡��
	protected int num; //��Ӱ���
	
	public void print () {
		System.out.println(" a:"+a+" b:"+b+" c:"+c);
		System.out.println("num: " +num);
	}
	
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}

class B extends A { //a,b,c,num ��� ����
	private int d,e,f;
	
	//�������̵� : �θ��� �޼��忡�� �������ϴ� ���� �ǹ�
	
//	public void print() {
//		//super : �θ� ���
//		super.print(); //�θ��� print�޼��� ȣ��
//		System.out.println(" d:"+d+" e:"+e+" f:"+f);
//	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(" d:"+d+" e:"+e+" f:"+f);
	}
	
	
	public int getD() {
		return d;
	}



	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
	
	
}