package day_08;

public class �ζ� {

	public static void main(String[] args) {
		/* �ζǹ�ȣ ���� (1~45�������� ����)
		 * �ζǹ�ȣ => 1~45���� 6��  => ����ڹ�ȣ
		 * ��÷��ȣ => 1~45���� 7��  => ���ʽ���ȣ
		 * 
		 * �ζǹ�ȣ (6�ڸ�)      1 2 3 4 5 6
		 * ��÷��ȣ (6�ڸ�+1�ڸ�) 1 2 3 4 5 6 [7]
		 * �ζǹ�ȣ�� �ߺ��Ǹ� �ȵ�.
		 * �ζ� ��� Ȯ��
		 * 1�� => 6�ڸ� ��ġ
		 * 2�� => 5�ڸ� ��ġ + ���ʽ���ȣ
		 * 3�� => 5�ڸ� ��ġ
		 * 4�� => 4�ڸ� ��ġ
		 * 5�� => 3�ڸ� ��ġ
		 * ��~!!
		 * */
		//�迭�� ����
		int lotto[] = new int[7]; //��÷��ȣ
		int user[] = new int[6];
		randomArray(user);
		randomArray(lotto);
		System.out.println(">> ����� ��ȣ");
		printArray(user);
		System.out.println(">> ��÷ ��ȣ");
		printArray(lotto);
		System.out.println("--------");
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("��~!!");
		}else {
			System.out.println("��~!! "+ rank+"�� �Դϴ�.");
		}

	}
	/* 1. ��ȣ�� �������� ������� (������ȣ�� 1���� ���� �� ����)
	 * 1~45������ ���� ��ȣ�� ���� �� ����
	 * */
	public static int random() {
		return (int)(Math.random()*10)+1;
	}
	
	/* 2. 1.��ȣ�� �迭�� �����ϴ� ���.
	 * �迭�� �ϼ� => ����X void
	 * �Ű����� => �迭 (�ζ�, ����)
	 * */
	public static void randomArray(int arr[]) {
		//�ߺ�������� ä���
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = random();
//		}
		
		//�ߺ� ���� ä���
//		for(int i=0; i<arr.length; i++) { // 11 0 0 0 0 0 
//			int r = random();
//			for(int j=0; j<arr.length; j++) {
//				if(arr[j] != r) { //���ٸ�...
//					arr[i] =r;
//				}else {
//					i--;
//					break;
//				}
//				
//			}
//		}
		
		int i=0;
		while(i < arr.length) {
			int r = random();
			if(!isContain(arr, r)) {
				arr[i]=r;
				i++;
			}
		}
		
	}
	
	/* 3. �迭 ��� �޼���
	 * �迭�� �ְ�, ���
	 * */
	public static void printArray(int arr[]) {
		if(arr.length == 7) {
			for(int i=0; i<arr.length-1; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.print("["+arr[arr.length-1]+"]");
			System.out.println();
		}else {
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
	/* 4. �ߺ�üũ �޼���
	 * �ߺ��̸� true, �ߺ��� �ƴϸ� false
	 * ����Ÿ�� : boolean
	 * �Ű����� : int arr[], random ��
	 * �޼���� : isContain
	 * */
	public static boolean isContain(int arr[], int random) {
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}
	
	/* 5. ����� üũ�ϴ� ���
	 * ����Ÿ�� : ��� int => ����� �ش����� �ʴ°��� -1�� ����
	 * �Ű����� : �ζǹ�ȣ, ������ȣ
	 * �޼���� : lottoRank()
	 * 1�� => 6�ڸ� ��ġ
	 * 2�� => 5�ڸ� ��ġ + ���ʽ���ȣ
	 * 3�� => 5�ڸ� ��ġ
	 * 4�� => 4�ڸ� ��ġ
	 * 5�� => 3�ڸ� ��ġ
	 * ��~!! (-1����)
	 * */
	public static int lottoRank(int lotto[], int user[]) {
		//lotto�迭�� user �迭�� ������ �ٸ��Ƿ� ������ ���ƾ���.
		if(lotto.length <= user.length){
			return -1;
		}
		
		int cnt = 0; //��÷ ���� ī��Ʈ
		for(int i=0; i<user.length; i++) {
			if(isContain(user, lotto[i])) {
				cnt++;
			}
		}
		
		switch(cnt) {
		case 6: return 1; 
		case 5:
			if(isContain(user, lotto[lotto.length-1])) {
				return 2;
			}else {
				return 3;
			}
			//isContain(user, lotto[lotto.length-1])? 2: 3;
		case 4:
			return 4;
		case 3:
			return 5;
			default :
				return -1;
		}
	}
}
