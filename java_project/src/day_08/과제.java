package day_08;

import java.util.Scanner;

public class ���� {
 static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static�� �ƴ� ���, ��ü�� �����Ͽ� ��ü��.�޼����() ȣ�� ����
		
		/*�߱�����
		 * ��ǻ�Ͱ� (1~9,�ߺ��Ұ�)3�ڸ��� ���ڸ� ���� ����
		 * ������ 3�ڸ� ���ڸ� ���߸� ����
		 * �ڸ��� ���ڰ� ���� ���� ��Ʈ����ũ
		 * �ڸ��� �ȸ°� ���ڸ� ��ġ�ϸ� ��
		 * ���ڵ� �ڸ��� �ȸ����� �ƿ�
		 * 
		 * -�߱����� ����-
		 * ��ǻ�Ͱ� ���ڸ� ���߽��ϴ�.
		 * ���� �Է� (1~9, 3�ڸ�) :
		 * 345
		 * ��� 3s �� ������ ���� (������� ���߾����� Ƚ�� ���)
		 * */
		
//		���ο����� ���
//		1.�Է��� ���� ��ĳ�� ����
//		2.���� ���� (��ǻ�� �迭, ���� �迭, ���� Ƚ�� ��¿� ����)
//		3. ��ǻ�Ͱ� ������ 3���� ���ڸ� �ߺ����� �ʰ� ����
//		4. ����� ���� �Է� (while , ����ڰ� ������ ���� �� ���� �����̱� ������ ���Ϲ��� �˸���)
//		(������ �� ���� �ʰ� �ٲ� Ȯ���� ���� �͵��� while���� ����.)
//		while(true) {
//			int s =0; int b=0; System.out.println("���� �Է�");
//			
//			for (int i =0; i<����� ����; i++) {
//				����ڼ���[i] = scan.nextInt();
//			} count ++ (���� Ƚ�� ī��Ʈ ����)
//		5. ���ں�
//		for(int i = 0; i<��ǻ��; ��++) {
//			for(int j =0; j<����ڼ���; j++) {
//				if(��[i]==������[j]&& i == j) ���ڵ� ���� ��ġ�� ����{
//					s++(��Ʈ����ũ ����)
//				}else if(��[i]==��[j]&&i!=j) {
//					b++ (�� Ƚ��)
//				}
//			}
//		}
//		
//		//for�� ���� �������� �� ���
//		if(s==0&&b==0) {
//			System.out.println("out");
//		}else {
//			System.out.println(s+"s "+b+"b ");
//			System.out.println("����Ƚ��" + count);
//		}if(s==3) {
//			System.out.println("����"); break; //while�� ���
//		}
//	}
		
		System.out.println("---�߱�����---");
		System.out.println("��ǻ�Ͱ� ���ڸ� �����Ͽ����ϴ�.");
		int comp[]=com();
		int use[]=user();
	
	}


	public static int[]com(){
		int num[] = new int [3];
		for(int i =0; i<num.length; i++) {
			num[i] = (int)(Math.random()*3)+1;
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--; break;
				}
			}
		}return num;	
	}

	public static int[]user(){	
		System.out.println("���� 3�ڸ��� �Է��ϼ���.");
		int num = scan.nextInt(); int num1=scan.nextInt(); int num2=scan.nextInt();
		int [] use = {num, num1, num2};
		return use;
			}

//	public static void answer(int comp[],int use[]) {
//		for(int i =0; )
//	
//		
//	}

}
