package Lotto;
//* �ζ� ��� Ȯ��
//* 1�� : 6�ڸ� ��ġ
//* 2�� : 5�ڸ� ��ġ + ���ʽ� ��ȣ ��ġ
//* 3�� : 5�ڸ� ��ġ
//* 4�� : 4�ڸ� ��ġ
//* 5�� : 3�ڸ� ��ġ
//* ������ ��
public class LottoE extends Lotto {

	// ��÷��ȣ ���� Ŭ���� Lotto�� ��ӹ޾Ƽ� ���ʽ� ��ȣ���� ó��
	// �������
	private int bonus; //���ʽ� ��ȣ

	
	
	//�޼���
	//�������̵� �޼��� : randomLotto(), init, toString , insertNumbers
	
	@Override
	protected void randomLotto() {
		// ���� �޼��� numbers�� �迭�� �̹� ä���� ��Ȳ
		super.randomLotto();
		while(true){
			int r = random();
			if(isContain(r)) {
				bonus = r;
				break; //���� ������ ������ �극��ũ�� ���������� 
			}
		}
		
	}

	@Override
	protected void init() {
		//numbers �迭 �����
		super.init();
		bonus = 0; //���ʽ� ��ȣ �ʱ�ȭ
	}

	@Override
	public String toString() {
		// ���ʽ� ��ȣ �߰�
		return super.toString()+"["+bonus+"]";
	}

	@Override
	protected void insertNumbers(int[] arr) { //7�ڸ�
		// �������� 7�ڸ� �迭�� ���´ٸ� 
		super.insertNumbers(arr); //6�ڸ� �迭����
		//������ ���ڸ��� �����ִ� ��Ȳ
		//���ʽ� ��ȣ�� �߰�
		bonus = arr[arr.length-1];
	}

	public void insertNumbers(int[]arr, int bouns) {
		super.insertNumbers(arr);
		//���ʽ� ��ȣ�� �߰� 
		this.bonus=bonus;
	}
	
	//getter

	public int getBonus() {
		return bonus;
	}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


