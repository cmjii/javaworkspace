package day_07;

public class Method_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		������ ���
//		1.�� 1���� �ְ�, ������ ���
//		2.2~9���� �ݺ��Ͽ� ��� ���� ���
//		3. ��� ��� 2*1=2

		dan(5);
		System.out.println("----------------------------");
		
	
		for(int i=2; i<=9; i++) {
			dan(i);
			System.out.println("--------------------------");
		}
	}
//	��� : ���� �־����� �� ���� �������� ���(����x)
	
	public static void dan(int num) {
		for(int i =1; i<=9; i++) {
			if(num>=2&&num<=9) {
				int a = 0;
				a = num*i;
				 System.out.println(num+"*"+i+"="+a);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}