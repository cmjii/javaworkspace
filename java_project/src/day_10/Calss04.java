package day_10;

public class Calss04 {

	public static void main(String[] args) {
		// Card 클래스 생성
		// 멤버변수 :
		// 모양 ->
		// 숫자 -> 1~10, J(11) Q(12) K (13)

		Card c = new Card();
		c.print();
		c.setShape('◆');
		c.setNum(8);
		c.print();
	}

}


class Card{

	//생성자 이용 ♥1 기본값
	//모양 . 숫자가 들어올 수 없는 값이 들어오면 -> ♥1
	private char shape; //모양
	private int num;//숫자
	
	//생성자
	public Card() {
		shape = '♥';
		num = 1;
	}
	
	
	//print 메서드
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
		case '♥' : case '♠': case '♣' : case '◆' :
			this.shape=shape; break;
			default : this.shape='♥';
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