package day_15;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx01 ex01 = new ExceptionEx01();
		
		try {
			int arr [] = null;
			arr=ex01.array(-1, 1, 10); //배열을 리턴
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



/*	메서드 생성
 * 	기능 :  배열의 길이가 주어지면 길이만큼 배열을 생성하여 배열을 돌려주는 메서드
 * 		 - 배열 안에 random 값을 채워서 리턴 1~10 start=1, count=10
 * 		 - throw :  size가 0보다 작으면 예외발생 , start가 0보다 작다면 예외발생		   
 * */
 
/* 기능 : 배열을 받아서 배열에 랜덤값을 채우는 메서드 (arr, start, count)
 * 		- arr 배열이 null일 경우 예외발생
 * 		- arr 배열의 길이가 0보다 작을 경우 예외발생
 * */

	public int[] array(int size, int start, int count) throws RuntimeException {
		
		if(size<0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		if(start<0) {
			throw new RuntimeException("random 시작범위가 0보다 작습니다.");
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
//			throw new RuntimeException ("범위 벗어남");
//		}
//	} 
//	
//		return arr;

	
	
}

	
	
	public void createArr(int arr[], int start, int count) throws Exception {
		if(arr == null) {
			throw new Exception("배열이 null입니다.");
		}
		if(arr.length<0) {
			throw new Exception("배열의 길이가 0보다 작습니다.");
		}
		for(int i =0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*count)+start;
		}
	}


}