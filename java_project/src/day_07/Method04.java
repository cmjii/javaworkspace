package day_07;

public class Method04 {

//	public static int[]random() {
//		int [] arr = new int [5];
//		for(int i =0; i<arr.length; i++) {
//			arr[i]=(int)(Math.random()*100)+1;
//		} return arr;
//	}
//	
//	
//	public static double avg(int arr[]) {
//		int sum = 0;
//		double avg = 0;
//		for(int i = 0; i<arr.length; i++) {
//			sum+=arr[i];
//		} avg = (double)sum/arr.length;
//		 return avg;
//	}
//	
//	public static void call(int arr[]) {
//	
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//			System.out.println(arr[i]);
//		} 
//		
//		
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 �޼��� : ����� �ϱ� ���� �ڵ� ����
//		 ����������, ����Ÿ��, �޼����(�Ű�����) {
//		 �ڵ�;
//		 }
//		 
//		 return : �޼��忡�� �����ؾ��ϴ� ���� �����ϴ� ����
//		 �޼��忡�� return�� ������ ���� Ÿ���� ���� �����ϰ�, �޼��带 ���� / ���� �ڿ� ���� �� ���� �ȵ�.
//		
//		1. ���� (1~100) ���� 5���� �迭�� ��� �޼��� (���� �迭�� ����)
//		2. �迭�� ���� �޾Ƽ� ����� �����ϴ� �޼��� (����� ����)
//		3. �迭�� ���� 5���� ����� ����ϴ� �޼���
//		4. ���ο����� ������� ������ �ȵ�.
//		5. ������ �޼��尣�� ������ ���� �� ȣ�⸸ �־�� ��
//		6. ī�信 ����
//		*����Ÿ�� : �����迭 ->int[]
//      �Ű����� : X
//		�޼���� : random
		
		
		
		
		int arr[] = random();
		double avg = avg(arr);
		print(arr,avg);
		
		
		//�޼��尣 ȣ��
	
		
		
		
		
		
	}
	
	
//	1. ���� (1~100) ���� 5���� �迭�� ��� �޼��� (���� �迭�� ����)
//	*����Ÿ�� : �����迭 ->int[]
//  *�Ű����� : X
//	*�޼���� : random
	public static int[]random() {
		int arr[]=new int[5];
		for(int i =0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		} return arr;
	}
	
	
	
//	2. �迭�� ���� �޾Ƽ� ����� �����ϴ� �޼��� (����� ����)
//	*����Ÿ�� : ����� ���� -> double
//	*�Ű����� : �迭 -> int arr[]
//	*�޼���� : avg	
	public static double avg(int arr[]) { //�������� ������ �迭�� �̹� �ִ�.
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum+=arr[i];
		} return (double)sum/arr.length;
	}
	
	
//	3. �迭�� ���� 5���� ����� ����ϴ� �޼���
//	*����Ÿ�� : void����
//	*�Ű����� : �����迭, ��� -> int arr[], double avg
//	*�޼���� : print	
	public static void print (int arr[], double avg) {
		System.out.println("5���� ���� ���� ��  > " );
		//System.out.println(arr); �ּҸ� ���
		for (int tmp : arr) {
			System.out.print(tmp+" ");
		} System.out.println(); //�ٹٲ�
		System.out.print("��� : " + avg);
	}
	
	
//	�迭�� ���޹޾Ƽ� ����� �����ϴ� �޼��� (����� ����)
//	�Ű����� : X
//	����Ÿ�� : X
//	�޼���� : avg
//	�޼��� �����ε� : ���� �޼������ ������, �Ű������� ������ ������ �ٸ��� ��� ����
	
	public static void avg() {
		int arr[]=random(); //���� �迭 ����
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum+=arr[i];
		}
	double avg1 = (double)sum/arr.length;
	
	//print ȣ��
	print(arr,avg1);
	}
	
	
	
}