package day_04;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			//�迭 : ���� Ÿ��, ���� �ǹ̸� ������ ������ ���� (��������)
		// ���������� �ʱ�ȭ�� �̸� �Ǿ�����. null or 0
		// �⺻�� ������ �ʱ�ȭ�� ������ ����. �ݵ�� ���� �ʱ�ȭ ���־����
		// Ÿ�� [] �迭�̸�; 
		// Ÿ�� �迭�̸�[];

	//�迭 ���� & �ʱ�ȭ
		// Ÿ��[] �����̸� = new Ÿ��[����]; ���� �Ϲ����� ���
		// Ÿ��[] �迭�̸� = new Ÿ��[]{��,��,��,��,��,,,,}
		// Ÿ��[] �迭�̸� = {��, ��, ��, ��, ��,,,,} ����� ���ÿ� �ʱ�ȭ�� �� ���� ����
		// �迭�� ���̴� 0�̻��̾�� �Ѵ�.
		// �迭�� ���̴� length Ȯ���� �� ����.
		// �迭�� ���۹����� 0�������� ����
		// �迭[3] => 0 1 2 
		// �迭�� ������ ������ �׻� length -1
		
		
	int[] arr;
	arr= new int[5];
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	int arr1[];
	int arr2[]=new int[] {1,2,3,4,5};
	
//	System.out.println(arr);
//	System.out.println(arr2);
//	
//	 System.out.println();
//	 
//	int arr3[]= {1,2,3};
//	System.out.println(arr3[0]);
//	System.out.println(arr3[1]);
//	System.out.println(arr3[2]);
	
	for(int i=0; i< arr2.length; i++) {
		System.out.print(arr2[i] +" ");
	}
	
	
	//�迭�� ����ϴ� ����
	//�ݺ����� �̿��� �� �ֱ� ������ ����
	//������ ����.
	System.out.println();
	for(int i =0; i<arr.length; i++) {
		arr[i]=(i*10)+10;
		System.out.println(arr[i]);
	} 
	
System.out.println();
	
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	
	//�迭 ���� �� 12345 ����, ���
	
	int a [] = new int [] {1,2,3,4,5};
	System.out.println(a[4]);
	
System.out.println();
	
	int [] b = new int [5];
	for(int i =0; i< b.length; i++) {
		b[i] = i+1;
		System.out.println(b[i]);
	}

	System.out.println();
	
	int [] c = new int[10];
	for(int i = 0; i<c.length; i++) {
		c[i]=i+1;
		if(c[i]%2==0) {
			System.out.print(c[i]+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	}

}
