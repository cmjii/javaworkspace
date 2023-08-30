package day_08;

public class Method08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 배열이 주어졌을 때 배열을 출력하는 메서드 생성
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

	/* 배열을 받아서 콘솔에 출력하는 메서드
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : printArray
	 * 옆으로 출력 / 5개씩 한줄로 나열
	 * */
	
	public static void printArray(int arr[]) {
			for(int i = 0; i<arr.length; i++) {
				if(i%5==0 && i!=0)
				System.out.println();
				System.out.print(arr[i]+" "); 
			}	
//			int row = (int)Math.ceil((double)arr.length/5);
//			int cnt = 0;
//			for(int i = 1; i<=3; i++) { //행
//				for(int j =1; j<=5; j++) { //열
//					System.out.print(arr[cnt]+" ");
//					cnt++;
//					if(cnt==arr.length) {
//						break a;
//					}
//				}
//			
//			}

	}
	
	
	// 주어진 정수 배열을 정렬하는 기능
	// 매개변수 : 배열 -> int arr[]
	// 리턴타입 : void
	
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
	
	// 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	// 랜덤수 범위 (1~100)
	// 매개변수 : 배열개수
	// 리턴타입 : 배열
	// 메서드명 : randomArray()
	
	
	public static int[] randomArray(int size) {
		int [] random = new int [size];
		for(int i =0; i<random.length; i++) {
			random[i] = (int)(Math.random()*100)+1;
			
		} return random;
		
		
	}
	
	
	
}
