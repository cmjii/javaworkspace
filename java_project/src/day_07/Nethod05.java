package day_07;

public class Nethod05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2~100���� �Ҽ� ���
		//2~100���� for���� ������ �޼��� ȣ���Ͽ� true ���
		
		//2~100���� �Ҽ��� �հ�
		//���� �Է¹޾Ƽ� �Ҽ����� �ƴ��� ���
		
		int sum=0;
		for(int i =2; i<=100; i++) {
			if(isprime(i)) {
				System.out.print(i + " ");
				sum+=i;
			}
		}
		System.out.println("1~100 �Ҽ��� ��: " +sum);
		
	}
	
	//��� : ������ �־����� �� ������ �Ҽ����� �ƴ��� �Ǵ� (true false)
	//�Ҽ��� 1�� �ڱ� �ڽŸ��� ����� ������ ��
	//����Ÿ��: boolean
	//�Ű�����: ���� -> int num
	//�޼����: prime
	
	public static boolean isprime(int num) {
		int cnt=0;
		for(int i =1; i<=num; i++) { //1~num���� �ݺ��Ͽ� ����� ������ Ȯ��
			if(num%i ==0) { //��� ã��
				cnt++; //����� ����
			}
		}
		if (cnt==2) {
			return true;
		}
		return false;	

	}
				
	


	
	
	
	
	
	
	
	
}