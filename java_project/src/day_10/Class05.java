package day_10;

public class Class05 {

	public static void main(String[] args) {
		// CardpackŬ����
		// ī���� : 52���� ī���
		// ������� : ī�带 52�� ���� �� �ִ� �迭
		// �޼��� : 1. ī�带 ���� ��� 2. ī�带 ���� ������ ��� 3. ����� CardŬ������ print ��� 4. ī�� �ʱ�ȭ �޼���
		// ������ : 52���� ī�带 ��� ����

		//��� ���� private Card[] pack = new Card[52]; private int cnt =0;(pack �迭�� index üũ��)
		//������ public CardPack () { �� �� �� �� 1~13}
		//char shape = '��'
		//�޼���
		//getter setter
	}

}

class CardPack {
	 private Card[] pack = new Card[52];
	 private int cnt =0; // �迭�� ������ �� �ε��� ������ �������°� ����
	 
	 public CardPack () {
		 char shape = '��';
				 for(int i =1; i<=4; i++) { //���
					 switch(i) {
					 case 1 : shape='��'; break;
					 case 2 : shape='��'; break;
					 case 3 : shape='��'; break;
					 case 4 : shape='��'; break;
					 }
					 for(int j =1; j<=13; j++) { //����
						Card c = new Card(); //ī�� 1�� ���� 
						c.setShape(shape);
						c.setNum(j);
						pack[cnt] = c;
						cnt++;
					 }
				 }
	 }

	 
	 
	 public void shake(){
		
		 Card tmp ;//tmp�� ī����
		
		 for(int i =0; i<pack.length; i++) {
		 int j=(int)(Math.random()*52)+0; //�ּҸ� �ٲ��ֱ� ���ؼ� ���� ������ int������ ���
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