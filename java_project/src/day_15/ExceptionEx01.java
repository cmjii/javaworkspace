package day_15;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx01 ex01 = new ExceptionEx01();
		
		try {
			int arr [] = null;
			arr=ex01.array(-1, 1, 10); //�迭�� ����
			for(int i =0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			arr=null;
			int arr2[] = new int[size];
			ex01.
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}



/*	�޼��� ����
 * 	��� :  �迭�� ���̰� �־����� ���̸�ŭ �迭�� �����Ͽ� �迭�� �����ִ� �޼���
 * 		 - �迭 �ȿ� random ���� ä���� ���� 1~10 start=1, count=10
 * 		 - throw :  size�� 0���� ������ ���ܹ߻� , start�� 0���� �۴ٸ� ���ܹ߻�		   
 * */
 
/* ��� : �迭�� �޾Ƽ� �迭�� �������� ä��� �޼��� (arr, start, count)
 * 		- arr �迭�� null�� ��� ���ܹ߻�
 * 		- arr �迭�� ���̰� 0���� ���� ��� ���ܹ߻�
 * */

	public int[] array(int size, int start, int count) throws RuntimeException {
		
		if(size<0) {
			throw new RuntimeException("�迭�� ���̰� 0���� �۽��ϴ�.");
		}
		if(start<0) {
			throw new RuntimeException("random ���۹����� 0���� �۽��ϴ�.");
		}
		int arr[] = new int [size];
		for(int i =0; i<size; i++) {
			arr[i] = (int)(Math.random()*count)+start;
		}return arr;
		
		
//	int arr[] = new int[size];
//	
//	
//	for (int i =0; i<size; i++) {
//		arr[i] = (int) (Math.random()*count)+start;	
//		if(start < 0 || size <0) {
//			throw new RuntimeException ("���� ���");
//		}
//	} 
//	
//		return arr;

	
	
}

	
	
	public void createArr(int arr[], int start, int count) throws Exception {
		if(arr == null) {
			throw new Exception("�迭�� null�Դϴ�.");
		}
		if(arr.length<0) {
			throw new Exception("�迭�� ���̰� 0���� �۽��ϴ�.");
		}
		for(int i =0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*count)+start;
		}
	}


}