package day_08;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �ζǹ�ȣ ���� (1~45�������� ����)
		 * �ζǹ�ȣ -> 1~45���� 6�� = ����ڹ�ȣ
		 * ��÷��ȣ -> 1~45���� 7�� -> ���ʽ� ��ȣ
		 * 
		 * �ߺ����� ����
		 * �ζǹ�ȣ (6�ڸ�) 123456
		 * ��÷��ȣ (6�ڸ� + 1�ڸ�) 123456[7]
		 * �ζ� ��� Ȯ��
		 * 1�� : 6�ڸ� ��ġ
		 * 2�� : 5�ڸ� ��ġ + ���ʽ� ��ȣ ��ġ
		 * 3�� : 5�ڸ� ��ġ
		 * 4�� : 4�ڸ� ��ġ
		 * 5�� : 3�ڸ� ��ġ
		 * ������ ��
		 * */
		System.out.println("�ζǹ�ȣ");
			int num[] =number();
			System.out.println();
		System.out.println("��÷��ȣ");
			int lo[] = lotto();
			System.out.println();
			System.out.println("���");
		number(num,lo);
			
		
			
	}
	//�ζǹ�ȣ 6��
	public static int [] number() {
		int [] num1 = new int [6]; 
		
		for(int i = 0; i<num1.length; i++) {
			num1[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(num1[i]==num1[j]) {
					i--; break;
				}
			}	
		}	
		for(int i = 0; i<num1.length; i++) {
			System.out.print(num1[i]+" ");
		}
		return num1;
	}
	//��÷��ȣ 7��
	public static int [] lotto() {
		int [] num2 = new int [7]; 
		
		for(int i = 0; i<num2.length; i++) {
			num2[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) { //�ߺ�����
				if(num2[i]==num2[j]) {
					i--; break;
				}
			}	
		}	
		for(int i = 0; i<num2.length; i++) {
			System.out.print(num2[i]+" ");
		}
		return num2;
	}
	
	public static void number(int num1[], int num2[]) {
		int cnt =0;
		for(int i =0; i<num1.length; i++) {
			for(int j=0; j<num1.length; j++) {
				if (num2[i]==num1[i]) {
					cnt++;
				}
			}
		}
		
		if(cnt==6) {
			System.out.println("1��");
		}else if(cnt==5) {
			for(int i =0; i<num1.length; i++) {
				if(num1[i]==num2[6]) {
					System.out.println("2��");
					
				}
			}
		} else if (cnt==5) {
			System.out.println("3��");
		} else if (cnt==4) {
			System.out.println("4��");
		} else if (cnt==3) {
			System.out.println("5��");
		} else {
			System.out.println("��");
		}
	}
	
}
	
	

	
	