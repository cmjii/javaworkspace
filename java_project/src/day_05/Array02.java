package day_05;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 ����
		// 5���� ���� ������ �迭�� ����
		//1~50 ������ �������� ������ �� ���
		
		int [] arr = new int [5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = ((int)(Math.random()*50)+1);
			System.out.print(arr[i]+" ");
		}
		
	System.out.println();
	
	//�������� ����

	for (int i = 0; i<arr.length; i++) {
		for(int j= i+1; j<arr.length; j++ ) {
			if(arr[i]>arr[j]) {//��������      if(arr[i]<arr[j]-> ��������
				//��ȯ
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			
			}
	} 
	}		
		//���
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
		
		System.out.println();
		
		//���� for��
	System.out.println();
	System.out.print("���� for > ");
	for (int tmp : arr) { //�̹� �ϼ��Ǿ� �ִ� ���� Ȯ���ϴ� ��. ���� �ִ� ���� �ȵ� 
		System.out.print(tmp+" ");
	}
		
		
		
		
		
		
	}

}
