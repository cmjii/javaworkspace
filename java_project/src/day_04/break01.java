package day_04;

import java.util.Scanner;

public class break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* break��: �ݺ����� ���������� �ϴ� Ű����
		 * �ݺ������� ���ǹ��� �����Ͽ� ������ �����ϸ� �ݺ����� ����� ����
		 * ���� for�������� ���� �����ϴ� for���� ��� �� ����.
		 * �ٱ��� for���� ����� ���� ���� for �̸��� �ٿ� ��� �� ����.
		 * 
		 * a : for() {
		 *  if() {
		 *    break a;
		 *  }
		 * }
		 * */
		
		/* 1~10���� ���
		 * ���ǽ��� ����(���ѷ���) beak�� �̿��Ͽ� 10�� �Ǹ� ����� ����
		 * */
		
//		for(int i=1; ; i ++) {
//			System.out.println(i +" ");
//			if (i == 10) {
//				break;
//			}
//		}
		
		//�� ���ڸ� �Է� �޾Ƽ� ���ڸ� �״�� ���
		//y �Է¹����� ����
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		
		for(; ;) {
			System.out.println("�Է�>");
			char i = scan.next().charAt(0);
			if (i != 'y') {
				System.out.println(i+ " -> " +i);
			}else if (i == 'y') {
				System.out.println("����");
				break;
			}
		}
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
