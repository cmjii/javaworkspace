package day_10;

public class Calss04 {

	public static void main(String[] args) {
		// Card Ŭ���� ����
		// ������� :
		// ��� ->
		// ���� -> 1~10, J(11) Q(12) K (13)

		Card c = new Card();
		c.print();
		c.setShape('��');
		c.setNum(8);
		c.print();
	}

}


class Card{

	//������ �̿� ��1 �⺻��
	//��� . ���ڰ� ���� �� ���� ���� ������ -> ��1
	private char shape; //���
	private int num;//����
	
	//������
	public Card() {
		shape = '��';
		num = 1;
	}
	
	
	//print �޼���
	public void print() {
		System.out.print(shape);
		switch (num) {
		case 11: System.out.print("J "); break;
		case 12: System.out.print("Q "); break;
		case 13: System.out.print("K "); break;
		default : System.out.print(num+" ");
		}
		
	}


	public char getShape() {
		return shape;
	}


	public void setShape(char shape) {
		switch(shape) {
		case '��' : case '��': case '��' : case '��' :
			this.shape=shape; break;
			default : this.shape='��';
		}
		
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		if(1>num || 13<num) {
			this.num=1;
		}else {
			this.num=num;
		}
		

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}