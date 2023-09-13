package Lotto;

import java.util.Scanner;

public interface Lottoin {

	void creatLotto(Scanner scan);	//수동로또
	void creatLottoAuto(); // 자동로또
	void insertLottoAuto(); // 당첨번호
	void  checkLotto(); // 당첨확인
	void printLotto();//리스트
	
	
}
