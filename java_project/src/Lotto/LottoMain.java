package Lotto;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LottoManager lm = new LottoManager();
		
	int menu =0;
	do {
		lm.printManu(); //�޴� ��� �޼���ȭ (ȣ��)
		menu = scan.nextInt();
		switch(menu) { 
		case 1: lm.creatLotto(scan);
			break;
		case 2: lm.creatLottoAuto();
			break;
		case 3: lm.insertLotto(scan);
			break;
		case 4: lm.checkLotto();
			break;
		case 5: lm.printLotto();
			break;
		case 6:
			break;
			default: System.out.println("�߸��� �޴�");
		}
			
	
			
		}while(menu !=6);
			
			
			
			
		
	}
}
