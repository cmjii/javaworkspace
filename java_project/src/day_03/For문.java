package day_03;

public class For�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ݺ��� : ��Ģ���� �۾��� �ݺ������� ����� �� ���� ����
		//for, while, do ~ while
		// for, while ���۹���� ����. => ���ǿ� ���� ������ �ѹ��� ������ �ȵ� �� �� ����.
		// do ~ while �� ��İ� ���۹���� ���� �ٸ� => ���ǿ� ���� �ʾƵ� ������ 1���� ����
		
		
		//for(�ʱ�ȭ ; ���ǽ� ; ������)
		//���๮;
		//}
		// - �ʱ�ȭ : ���ǽ��̳� ���๮���� ����� ������ �ʱ�ȭ (��������) -> ó�� �ѹ��� ����
		// - ���ǽ� : �ݺ����� �ݺ��� �����ϴ� �� (true) (��������)
		// - ������ : ���ǽĿ��� ���Ǵ� ������ ���� / ���ҽ��� �ݺ�Ƚ���� ����
		
		//for�� ������ ������ �������� ������ �Ǳ� ������ ���� ������ �ۿ��� �ؾ���.
		
		
		
		//1~10���� ����ϴ� ����
		//�ʱ�ȭ : i���� ��� => int i =1;
		//���ǽ� : i������ 10�� �� �� ���� -> i<=10;
		//������ : i++; (i�� 1������) , (i=i+2); (2�� ������ ���� ���־����)
		//���๮ : i���
		for( int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 10; i>=1; i--) {
			System.out.print(i + " ");
		}
		
		//2���� 10���� ¦���� ���
		
		System.out.println();
		
		for(int i =2; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		
		//1���� 20���� �� ¦���� ���, if���� ����Ͽ� ���ǿ� �´� �ڷḸ ���
		
		System.out.println();
		
		for(int i =1; i<=20; i++) {
			if(i%2 ==0) {
				System.out.print(i + " ");
			}
		}
		
		
		//1���� 10���� Ȧ���� ���, ¦���϶��� pass��� ������, Ȧ�� �϶��� �׳� ���
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print("PASS"+" ");
			}else {
				System.out.print(i + " ");
			}
		}
		
		//1���� 10���� �հ� ���
		
		System.out.println();
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		} System.out.println(sum);
		
		
		//1���� 10���� ¦���� �հ� Ȧ���� ���� ���� ���
		//for 1����, 10���� 1�� �����Ͽ� ���� ��
		//if ¦������ �Ǵ� -> ¦���� �հ�
			//Ȧ������ �Ǵ� -> Ȧ���� �հ�
			//for�� ���� �� -> ���
		
		int a = 0;
		int b = 0;
		
		for(int i =1; i<=10; i++) {
			if(i%2==0) {
				a=a+i;
			}else {
				b+=i;
			}
		} 
			System.out.println("¦�� �հ� : " + a);
			System.out.println("Ȧ�� �հ� : " + b);	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
