package day_09;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.print();
		//��������� private���� ����Ǹ� ���� ���� X
//		p.x=1;
//		p.y=3;
		p.setX(1);
		p.setY(3);
		p.print();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		p.setX(10);
		p.print();
	
		System.out.println("--------------------------");
		
		Point p1 = new Point();
		p1.setX(100); p1.setY(200); p1.print();
		
		System.out.println("-------------------------");
		
		Point1 p2 = new Point1();
		p2.print();
		p2.setX(5);
		p2.print();
		System.out.println(p2.getX());
		
		
		
	}

}

//poont1 Ŭ���� ���� 
//(0,0,0)
//x,y,z �������
//print �޼��� ����
//getter/ setter

class Point1 {
	private int x;
	private int y;
	private int z;
	
	public void print( ) {
		System.out.println("("+x+","+y+","+z+")");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
//	public int getX() {
//		return x; // = return this.x;
//	}
//	
//	public int getY() {
//		return y;
//	}
//	
//	public int getZ() {
//		return z;
//	}
//	
//	public void setX(int x) {
//		this.x=x;
//	}
//	
//	public void setY(int y) {
//		this.y=y;
//	}
//	
//	public void setZ(int z) {
//		this.z=z;
//	}
	
}




class Point{
//	int x; int y; //������� �ڸ�
	//��������� �Ϲ������� private ���
	private int x; private int y;
	//print
	//���� Ŭ������ ��������� ��� �޼��忡�� �����ȴ�.
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	//getter(��������� ���� �������� ������ �޼���)
	//setter(��������� ���� �����ϴ� ������ �޼���)
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) { //�Ű����� x�� ������� x�� �ٸ�
		this.x=x; //this : �� Ŭ������ ��������� ��Ī�ϴ� Ű����
		
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
}