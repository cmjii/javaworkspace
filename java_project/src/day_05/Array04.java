package day_05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//5�ڸ��� ���ڸ� �Է� �޾Ƽ� �Է¹��� ���ڸ� �Ųٷ� ���
		//ex) 11456 -> 65411
		//�� �ڸ��� �հ� ��� 6+5+4+1+1
		//ex) 19547 -> 74591 -> 1+9+5+4+7
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ټ��ڸ� ���ڸ� �Է����ּ���.");
		int num = scan.nextInt();
		int arr[] = new int[5];
		
		arr[0] = num/10000%10;
		arr[1] = num/1000%10;
		arr[2] = num/100%10;
		arr[3] = num/10%10;
		arr[4] = num%10;
		
		for(int i = 0; i<arr.length; i++) {
			int a = 4-i;
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum = sum + arr[i];	
			}System.out.print(sum);
		
		


		
		scan.close();
		
		
		
		
		// ������(/), ������(%)
		//12345 -> %10 -> 5 �迭�� ����
		//���� ���� �� �ٽ� ���������� ����
		//12345/10 -> ������ ����. %10���� ������ �ٽ� �������� ���Ѵ�
		//1234->%10->4->�迭�� ����
		
		
		
		
		
		
		
/*		int sum=0;
		int i =0;
		
		while(num>0) {       �Է¹��� num�� 0���� �۾����� false
			int b = num%10;
			arr[i] = b;
			sum+=b;
			num=num/10;
			system.out. println(arr[i]);
			i++;
		} system.out.println("sum:"+sum);
		
*/		
		
		
		
		
		
		
		
		
		
		
		
	}

}
