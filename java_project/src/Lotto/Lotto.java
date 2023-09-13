package Lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//	1. 로또 번호 생성 (수동) : 사용자 입력
//		=>createLotto(scan)
//	2. 로또 번호 생성 (자동) : random (6자리)
//		=>createLottoAuto()
//	3. 당첨번호 생성 (자동) : random (7자리) -> 배열 저장
//		=> insertLottoAuto()
public class Lotto {

	protected int numbers[]= new int[6];

	
	//메서드 (랜덤번호 생성
	
	protected int random () {
		return new Random().nextInt(45)+1;
	}
	
	//1. 랜덤번호 6개 numbers에 저장하는 메서드 (중복 x)
	
	protected void randomLotto() {
		// 초기화
		init();
		int cnt =0;
		while(cnt<6) {
			int r = random();
			if(!isContain(r)) { //중복되지 않는다면
				numbers[cnt]=r;
				cnt++;
			}
		}
	}
	


	//2. 중복체크 메서드
	
	
	protected boolean isContain(int num) {
		if(num < 0 || num >45) {
			System.out.println("잘못된 범위입니다."); 
			return false;
		}
		for(int tmp : numbers) {
			if(tmp ==num) {
				return true;
			}
		}
		return false;
	}
	
	
	//3. 배열을 초기화
	
	
	protected void init() {
		numbers = new int [6]; //기존 배열을 버리고, 새배열로 연결
		
	}
	
	
	//4. 번호 확인 -> toString
	
	
	@Override
	public String toString() {
		return  Arrays.toString(numbers) ;
	}
	
	
	//5. 수동 번호 생성
	//입력은 manager 클래스에서 받아서 메서드 호출
	//매개변수로 배열을 주면, numbers로 복사
	
	protected void insertNumbers(int arr[]) {
		if(arr.length<numbers.length) {
			System.out.println("배열의 길이가 작습니다.");
		}
		//배열 복사 arraycopy => 처리속도가 빠름
		System.arraycopy(arr, 0, numbers, 0, numbers.length);
	}
	
	
	
	//getter
	
	
	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	//수동 로또
//	public void createLotto () {
//		Scanner scan = new Scanner(System.in);
//		for(int i =0; i<lotto.length; i++) {
//			System.out.println("로또번호(0~45)를 한자리씩 입력하세요.");
//			lotto[i] = scan.nextInt();
//			if(lotto [i]>46 || lotto[i] < 0) {
//				System.out.println("잘못된 입력입니다."); return;
//			}else if ( lotto [i] == lotto [i]) {
//				System.out.println("중복된 번호입니다."); return;
//			}
//		}
//		for(int i =0; i<lotto.length; i++) {
////			System.out.println("--수동로또번호--");
//			System.out.print(lotto[i]+" ");
//		}
//		
//		scan.close();
//		
//			
//		}
//	
//	
//	//자동 로또
//	public void creatLottoAuto() {
//		for(int i =0; i<lottoauto.length; i++) {
//			lottoauto[i] = (int)(Math.random()*45)+1;
//			for(int j = 1; j< i; j++) {		
//			if(lottoauto[i] == lottoauto[j]) {
//				j--; break;
//			}
//		}
//	}
//		for(int i =0; i<lottoauto.length; i++) {
////			System.out.println("--자동로또번호--");
//			System.out.print(lottoauto[i]+" ");
//		}
//	}
//
//	
//	
//	
//	
//	//당첨번호
//	public void insertLottoAuto() {
//		for(int i =0; i<insertlotto.length; i++) {
//			insertlotto[i] = (int)(Math.random()*45)+1;
//			for(int j=1; j<i; j++) {
//				if(insertlotto[i]==insertlotto[j]) {
//					j--; break;
//				}
//			}
//		}
//		for (int i =0; i<insertlotto.length-1; i++) {
//			System.out.print(insertlotto[i]+" ");
//		}System.out.println("["+insertlotto[6]+"]");
//	}

}
