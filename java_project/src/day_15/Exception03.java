package day_15;

public class Exception03 {

	public static void main(String[] args) {
		/*	���� �߻��ϴ� ���� �ڵ�� 
		 * */
		// - ArithmeticException : by zero
		//System.out.println(1/0);
		
		// - ArrayIndexOutOfBoundsException : �迭�� ������ �Ѿ� ���� ��
		int arr[] = new int[5];
		//arr[6] = 1;
		
		// - ClassCastException : Ŭ������ ĳ������ �߸��Ǿ��� ��� (����ȯ ����)
		P p = new P();
		//C c = (C)p;
		
		// - NullPointerException : ��ü�� �������� ���� ���
		C c = null;
		c.print();
	}

}

class P{
	int num =10;
}

class C extends P {
	int num1 =100;
	
	public void print() {
		
	}
}