package day_04;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5���� ������ �Է¹޾Ƽ� �迭�� �����ϰ�,
		//������ �հ�� ����� ���
		//�ְ�����
		int size = 5;
		int [] arr = new int [size]; 
		int t =0; double b =0; int c=0; int min=100;//�ʱⰪ�� �׻� 0�� �ƴ�.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("������ ���ʴ�� �Է����ּ���.");
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			t = t+arr[i];
			b = (double)t/arr.length;
			c= Math.max(arr[i], c);
			min = Math.min(arr[i],min);
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//					
		}
		
		System.out.println("�հ� : " + t);
		System.out.println("��� : " + b);
		System.out.println("�ְ����� : " + c);
		System.out.println("�ּ� ���� : " + min);
		
		scan.close();
		
		
		
		
		
		
	}

}
