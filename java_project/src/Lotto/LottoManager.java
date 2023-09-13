package Lotto;

import java.util.Scanner;

public class LottoManager implements Lottoin {

	//������� ����
	LottoE lotto [] = new LottoE[5]; //��÷��ȣ �迭 List
	Lotto user = new Lotto(); //����� ��ȣ
	int cnt =0; //��÷�迭�� index ���� 
	
	public void printManu() {
		System.out.println("--�ζ� ���α׷�--");
		System.out.println("1.�ζ� ��ȣ ���� (����)");
		System.out.println("2.�ζ� ��ȣ ���� (�ڵ�)");
		System.out.println("3.��÷ ��ȣ ���� (�ڵ�)");
		System.out.println("4. ��÷ Ȯ�� (������ ȸ�� ��ȣ)");
		System.out.println("5.��÷ ��ȣ ��� Ȯ�� (��ü)");
		System.out.println("6.����");
		System.out.println(">> menu >");
	}
	
	
	
	
	@Override
	public void creatLotto(Scanner scan) {
		// �ζ� �����Է� �޴�
		System.out.println("�ζǹ�ȣ �Է�.(�ߺ�X, ����6�� (1~45))");
		int [] tmp = new int[6];
		for(int i =0; i<tmp.length; i++) {
			tmp[i] = scan.nextInt();
		}
		//�ߺ� üũ �� 
		
		if(isDuplicated(tmp)) {
			System.out.println("�����߻� ���");
		} else {
			user.insertNumbers(tmp);
			printLotto();
			System.out.println(user);
		}
	}
	
	//�������� �Է��� �迭 ���� ���� ���� ���ԵǾ� �ִ��� üũ
	public boolean isDuplicated(int[]arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		//���� üũ
		for (int i =0; i<arr.length; i++) {
			if(arr[i]<0||arr[i]>45) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void creatLottoAuto() {
		//�ڵ� ��ȣ ����
		user.randomLotto();		
//		printLotto("�ζǹ�ȣ:"+user);
		System.out.println(user);
	}
	
	public void insertLotto(Scanner scan) {
		System.out.println("�ζ� ��÷��ȣ �Է�, �ߺ� x 1~45 ���� ���� 7�� ���ʽ� ������");
		int tmp [] = new int [7];
		for(int i =0; i< tmp.length; i++) {
			tmp [i] = scan.nextInt();
		}
		//�ߺ� , ���� ��Ż ���̽� �߻�
		if(isDuplicated(tmp)) {
			System.out.println("�����߻� ���");
		}else {
			LottoE tmpLotto = new LottoE();
			tmpLotto.insertNumbers(tmp);
			
			lotto[cnt] = tmpLotto;
			cnt++;
			System.out.println("��÷��ȣ: " + tmpLotto);
		}
	}

	@Override
	public void insertLottoAuto() {
		// ��÷��ȣ �ڵ��Է�
		if(lotto.length == cnt) {
			LottoE[] arr = new LottoE[lotto.length+5];
			System.arraycopy(lotto, 0, arr, 0, cnt);
			lotto = arr;
		}
		LottoE tmp = new LottoE();
		tmp.randomLotto();
		lotto[cnt] = tmp;
		cnt++;
		System.out.println(tmp);
	
		
	}

	@Override
	public void checkLotto() {
		// ��÷ Ȯ�� �޼���
		if(user.isContain(0)) { //�ζ� ��ȣ�� �������� ���� ����
			System.out.println("����� ��ȣ�� �Է����ּ���.");
			return;
		}
		//�ζ� ��÷��ȣ�� ���� ���
		if(cnt ==0) {
			System.out.println("��÷��ȣ�� �������ּ���.");
			return;
		}
		
		//1.��ġ�ϴ� ���� count ���� ���� 
		int count =0;
		//2.�������� ����� ��÷��ȣ ��ü ��������
		LottoE tmp = lotto[cnt-1];
		//3. for������ ��ġ ���� Ȯ��
		for(int i =0; i<user.getNumbers().length; i++) {
			//�ֽ� ��÷��ȣ�� i���� 1���� ���� num���� ����
			int num = tmp.getNumbers()[i]; //��÷��ȣ ù��° ��
			//user �迭�� num�� �ִ��� Ȯ��
			if(user.isContain(num)) {
				count++;
			}
		}
		//4.rankȮ�� -> ���
		int rank = -1;
		switch(count) {
		case 6: rank =1; break;
		case 5: if(user.isContain(tmp.getBonus())) {
			rank =2;
		}else {
			rank =3;
		}
		break;
		case 4: rank =4; break;
		case 3: rank =5; break;
		default : break;
	}
	if(rank != -1) {
		System.out.println(rank+"��÷"+count+"�� ��÷");
	}else {
		System.out.println("��");
	}
	}

	@Override
	public void printLotto() {
		//��ü ��÷ ����Ʈ
		//for�� �̿��Ͽ� lotto �迭 ���
		System.out.println("��������������������������������������������");
		System.out.println("-���� ��÷ ��ȣ ����Ʈ--");
		for(int i =0; i<cnt; i++) {
			System.out.println((i+1)+"ȸ�� ��÷��ȣ:"+lotto[i]);
		}
	}
	
	
	
	
	
	
	
	

}
