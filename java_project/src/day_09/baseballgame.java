package day_09;

import java.util.Scanner;

public class baseballgame {
	 static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�߱����� -> �޼���� 
		
		//������ȣ ����
		//�迭�� �߰�(�ߺ����� �޼���)
		//��¸޼���
		//��Ʈ����ũ �޼��� -> ���� ����
		//�� �޼��� -> ���� ���� 
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		System.out.println("<�߱�����>");
		System.out.println("��ǻ�Ͱ� ���ڸ� ������ϴ�.");
		
		
		

		
	/* ������ȣ ���� : �Ű������� ������ ����
	 * (int)(Math.random()*9(����)+1(���۰�);
	 * �Ű����� -> ����, ���۰�
	 * ifó�� -> ������ ���۰��� �ٲ� ���� �� ó��
	 * */
	
}
	
	public static int random(int count, int start) {
		return (int)(Math.random()*9)+1;
	}
	
	public static void com(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			int r = ();
			for(int j =0; j<arr.length; j++) {
				if (arr[j]!=r) {
					arr[i]=r;
				}else {
					i--; break;
				}
			}
		}
	}
	
	public static void print(int arr[]) {
		
	}
	
}