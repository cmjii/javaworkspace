package Lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//	1. �ζ� ��ȣ ���� (����) : ����� �Է�
//		=>createLotto(scan)
//	2. �ζ� ��ȣ ���� (�ڵ�) : random (6�ڸ�)
//		=>createLottoAuto()
//	3. ��÷��ȣ ���� (�ڵ�) : random (7�ڸ�) -> �迭 ����
//		=> insertLottoAuto()
public class Lotto {

	protected int numbers[]= new int[6];

	
	//�޼��� (������ȣ ����
	
	protected int random () {
		return new Random().nextInt(45)+1;
	}
	
	//1. ������ȣ 6�� numbers�� �����ϴ� �޼��� (�ߺ� x)
	
	protected void randomLotto() {
		// �ʱ�ȭ
		init();
		int cnt =0;
		while(cnt<6) {
			int r = random();
			if(!isContain(r)) { //�ߺ����� �ʴ´ٸ�
				numbers[cnt]=r;
				cnt++;
			}
		}
	}
	


	//2. �ߺ�üũ �޼���
	
	
	protected boolean isContain(int num) {
		if(num < 0 || num >45) {
			System.out.println("�߸��� �����Դϴ�."); 
			return false;
		}
		for(int tmp : numbers) {
			if(tmp ==num) {
				return true;
			}
		}
		return false;
	}
	
	
	//3. �迭�� �ʱ�ȭ
	
	
	protected void init() {
		numbers = new int [6]; //���� �迭�� ������, ���迭�� ����
		
	}
	
	
	//4. ��ȣ Ȯ�� -> toString
	
	
	@Override
	public String toString() {
		return  Arrays.toString(numbers) ;
	}
	
	
	//5. ���� ��ȣ ����
	//�Է��� manager Ŭ�������� �޾Ƽ� �޼��� ȣ��
	//�Ű������� �迭�� �ָ�, numbers�� ����
	
	protected void insertNumbers(int arr[]) {
		if(arr.length<numbers.length) {
			System.out.println("�迭�� ���̰� �۽��ϴ�.");
		}
		//�迭 ���� arraycopy => ó���ӵ��� ����
		System.arraycopy(arr, 0, numbers, 0, numbers.length);
	}
	
	
	
	//getter
	
	
	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	//���� �ζ�
//	public void createLotto () {
//		Scanner scan = new Scanner(System.in);
//		for(int i =0; i<lotto.length; i++) {
//			System.out.println("�ζǹ�ȣ(0~45)�� ���ڸ��� �Է��ϼ���.");
//			lotto[i] = scan.nextInt();
//			if(lotto [i]>46 || lotto[i] < 0) {
//				System.out.println("�߸��� �Է��Դϴ�."); return;
//			}else if ( lotto [i] == lotto [i]) {
//				System.out.println("�ߺ��� ��ȣ�Դϴ�."); return;
//			}
//		}
//		for(int i =0; i<lotto.length; i++) {
////			System.out.println("--�����ζǹ�ȣ--");
//			System.out.print(lotto[i]+" ");
//		}
//		
//		scan.close();
//		
//			
//		}
//	
//	
//	//�ڵ� �ζ�
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
////			System.out.println("--�ڵ��ζǹ�ȣ--");
//			System.out.print(lottoauto[i]+" ");
//		}
//	}
//
//	
//	
//	
//	
//	//��÷��ȣ
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
