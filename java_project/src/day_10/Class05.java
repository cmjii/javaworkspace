package day_10;

public class Class05 {

	public static void main(String[] args) {
		// Cardpack클래스
		// 카드팩 : 52장의 카드들
		// 멤버변수 : 카드를 52장 담을 수 있는 배열
		// 메서드 : 1. 카드를 섞는 기능 2. 카드를 한장 빼내는 기능 3. 출력은 Card클래스의 print 사용 4. 카드 초기화 메서드
		// 생성자 : 52장의 카드를 모두 생성

		//멤버 변수 private Card[] pack = new Card[52]; private int cnt =0;(pack 배열의 index 체크용)
		//생성자 public CardPack () { ♥ ♣ ♠ ◆ 1~13}
		//char shape = '♥'
		//메서드
		//getter setter
	}

}

class CardPack {
	 private Card[] pack = new Card[52];
	 private int cnt =0; // 배열을 생성할 땐 인덱스 번지를 만들어놓는게 좋음
	 
	 public CardPack () {
		 char shape = '♥';
				 for(int i =1; i<=4; i++) { //모양
					 switch(i) {
					 case 1 : shape='♥'; break;
					 case 2 : shape='♣'; break;
					 case 3 : shape='♠'; break;
					 case 4 : shape='◆'; break;
					 }
					 for(int j =1; j<=13; j++) { //숫자
						Card c = new Card(); //카드 1장 생성 
						c.setShape(shape);
						c.setNum(j);
						pack[cnt] = c;
						cnt++;
					 }
				 }
	 }

	 
	 
	 public void shake(){
		
		 Card tmp ;//tmp는 카드형
		
		 for(int i =0; i<pack.length; i++) {
		 int j=(int)(Math.random()*52)+0; //주소를 바꿔주기 위해서 만든 변수로 int형으로 사용
			tmp = pack[i];
			pack [i] = pack[j];
			pack[j] = tmp;
			
		 }
	 }
	 
	 
	 public Card pick() {
		 if(cnt==0) {
			 return null;
		 }
		 cnt--;
		 return pack[cnt];//52
	 }
	 
	 
	 
	 public void init() {
		 cnt = 52;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}