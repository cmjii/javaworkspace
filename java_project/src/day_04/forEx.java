package day_04;

import java.util.Scanner;

public class forEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Ҽ� : ����� 1�� �� �ڽ��� ���� ������ ���� �Ҽ�
		//�Ҽ� : 3,5,7,11,13,17
		
		//num�� �Է¹޾Ƽ� num�� �Ҽ����� �ƴ��� �Ǻ�
		// ex) num = 13-> �Ҽ��Դϴ�.
		//     num = 12-> �Ҽ��� �ƴմϴ�.
		
		
//		  Scanner scan = new Scanner(System.in);
//		   System.out.println("���ڸ� �Է��ϼ���."); 
//		   int num = scan.nextInt(); 
//		   int count=0;
//		  for(int i = 1; i<= num; i ++) {
//			  if(num%i ==0) {
//				  count = count +1; //count++; 
//			  } System.out.println(count);
//			  }
//		  
//		  if(count==2) { 
//			  System.out.println("�Ҽ��Դϴ�."); 
//			  }else {
//				  System.out.println("�Ҽ��� �ƴմϴ�."); }
//		 
		
		
		
		//2~100���� �� �Ҽ��� ���
		 

		int count =0; 
	for (int i = 2; i <=100; i ++) { //num 2~100����
		count = 0; //�� num���� �Ǽ��� ���� = 0���� ����
			for (int a = 1; a<=i; a++) {		//����� ���ϱ� ���� ������ ��	
				if(i%a==0) {	//���
					count++;
			}
		}
			//System.out.println(count);
		
		if(count ==2) {
			System.out.print(i + " ");
		}			
		
	}
		
		
		
		
		

		
		
		
		
	}

}
