package day_05;

public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* arraycopy : �迭����
		 * ��ü�� �ٽ� �����ؼ� ���� ����
		 * �迭�� ���̸� ������ ����.
		 * �ѹ� ������ ���̴� �ø��ų� ���� �� ����
		 * ���� �߰�, ���� �Ұ���
		 * �迭�� ���̸� �ø��ų� ���̰� ���� �� �迭 ���츣 ���� ���̸� ����
		 * */
		
		
		int arr[] = new int[] {10,15,20};
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		 System.out.println();
		 
		 int arr1[] = new int[5];
		 
		 //arraycopy�̿�
		 System.arraycopy(arr,0,arr1,0,arr.length);
		 
//		 for(int i = 0; i<arr.length; i++) {
//			 arr1[i]= arr[i];
//		 }
		 
		for(int tmp:arr1) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("--------------------------------");
		
		//3���� ���� ���� �� �ִ� string �迭 ����
		//�� �� �� ���ڸ� ���� �� ��� (���� for������ ���)
		// 5���� ���� ���� �� ���� string �迭�� ���� �� arraycopy
		// ��ȸ ������ �߰��Ͽ� ���� for������ ���
		
		
		String [] arr2 = {"����","����","����"};
		for(String tmp:arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		String arr3 [] = {"","","","��ȸ","����"};
		System.arraycopy(arr2, 0, arr3, 0, arr2.length);
		
		for(String tmp:arr3) {
			System.out.print(tmp+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
