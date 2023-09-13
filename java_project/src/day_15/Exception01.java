package day_15;

public class Exception01 {

	public static void main(String[] args) {
		/* Exception : ����ó��
		 * => ����� �߻��� �� �ִ� ���ܸ� ó���Ͽ� ����ó���� ������Ű�� ���
		 * ClassCastException
		 * ������ �� ���� Ÿ�� ��ȯ�� ���� �� ���
		 * - ArrayIndexOutofBoundException
		 * �迭�� �߸��� �ε����� ����Ϸ� ������ ���
		 * -NullpointerException
		 * null ��ü�� �ν��Ͻ� �޼��带 ȣ���ϴ� ���� ���
		 * - ArithmeticException
		 * ��� ���꿡�� ������ 0���� ������ �� ������ ������ �� ���� ���
		 * 
		 * try ~ catch ~ finally
		 * try : ���ܰ� �߻��� ���ɼ��� �ִ� ������ �ۼ�
		 * catch : try �������� �߻��� ���ܸ� ó��
		 * finally : try ���� �� �ݵ�� ����Ǿ�� �ϴ� ���� (������ ��� X)
 		 * */
		int arr[] = new int[5];
		try {
			//���� �߻� �ڵ�
			arr[0] = 45;
			arr[1]=56;
			arr[6]=1; //���ܹ߻��ڵ�
			arr[3]=78; //���� �ȵ�
			
		}
		catch (Exception e) {
			System.out.println("���� ���");
			e.printStackTrace(); //���� �޽��� ���
			e.getMessage();
		}
		
		//���ܰ� �߻��ϸ� ���� �߻� ������ �ڵ�� ����ȵ�
		
	System.out.println("�Է¿Ϸ�");

	for(int i =0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

}
