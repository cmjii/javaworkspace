package day_05;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~10까지 담고 있는 배열 arr출력
		
		int [] arr = new int [10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		System.out.print(arr[i]+" ");	
		}
		
System.out.println();

		for (int i = 0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++ ) {
				if(arr[i]<arr[j]) {
					
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				
				}
		} 
		}		
			for (int tmp : arr) {
				System.out.print(tmp + " ");
			}

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
