package day_08;

public class Method08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �迭�� �־����� �� �迭�� ����ϴ� �޼��� ����
		 * */
		int arr[] = new int[] {1,2,9,13,7,5,6,10,4,8,3,11,12,14,15};
		printArray(arr);
		System.out.println();
		System.out.println("---------------------------");
		printArray1(arr);
		System.out.println();
		System.out.println("---------------------------");
		int rna[] = randomArray(20);
		
		
	}

	/* �迭�� �޾Ƽ� �ֿܼ� ����ϴ� �޼���
	 * �Ű����� : int arr[]
	 * ����Ÿ�� : void
	 * �޼���� : printArray
	 * ������ ��� / 5���� ���ٷ� ����
	 * */
	
	public static void printArray(int arr[]) {
			for(int i = 0; i<arr.length; i++) {
				if(i%5==0 && i!=0)
				System.out.println();
				System.out.print(arr[i]+" "); 
			}	
//			int row = (int)Math.ceil((double)arr.length/5);
//			int cnt = 0;
//			for(int i = 1; i<=3; i++) { //��
//				for(int j =1; j<=5; j++) { //��
//					System.out.print(arr[cnt]+" ");
//					cnt++;
//					if(cnt==arr.length) {
//						break a;
//					}
//				}
//			
//			}

	}
	
	
	// �־��� ���� �迭�� �����ϴ� ���
	// �Ű����� : �迭 -> int arr[]
	// ����Ÿ�� : void
	
	public static void printArray1(int arr[]) {
		for(int i =0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j]= tmp;
				}
			} 
		}
		for(int i =0; i< arr.length; i++) {
			if (i%5==0) {
				System.out.println();
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	// ���ο� �迭�� ���� �������� ä�� �����ϴ� �޼���
	// ������ ���� (1~100)
	// �Ű����� : �迭����
	// ����Ÿ�� : �迭
	// �޼���� : randomArray()
	
	
	public static int[] randomArray(int size) {
		int [] random = new int [size];
		for(int i =0; i<random.length; i++) {
			random[i] = (int)(Math.random()*100)+1;
			
		} return random;
		
		
	}
	
	
	
}