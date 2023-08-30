package day_05;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 예제
		// 5개의 값을 가지는 배열을 생성
		//1~50 사이의 랜덤값을 저장한 후 출력
		
		int [] arr = new int [5];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = ((int)(Math.random()*50)+1);
			System.out.print(arr[i]+" ");
		}
		
	System.out.println();
	
	//오름차순 정렬

	for (int i = 0; i<arr.length; i++) {
		for(int j= i+1; j<arr.length; j++ ) {
			if(arr[i]>arr[j]) {//오름차순      if(arr[i]<arr[j]-> 내림차순
				//교환
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			
			}
	} 
	}		
		//출력
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
		
		System.out.println();
		
		//향상된 for문
	System.out.println();
	System.out.print("향상된 for > ");
	for (int tmp : arr) { //이미 완성되어 있는 것을 확인하는 것. 값을 넣는 것은 안됨 
		System.out.print(tmp+" ");
	}
		
		
		
		
		
		
	}

}
