package day_07;

public class Method04 {

//	public static int[]random() {
//		int [] arr = new int [5];
//		for(int i =0; i<arr.length; i++) {
//			arr[i]=(int)(Math.random()*100)+1;
//		} return arr;
//	}
//	
//	
//	public static double avg(int arr[]) {
//		int sum = 0;
//		double avg = 0;
//		for(int i = 0; i<arr.length; i++) {
//			sum+=arr[i];
//		} avg = (double)sum/arr.length;
//		 return avg;
//	}
//	
//	public static void call(int arr[]) {
//	
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//			System.out.println(arr[i]);
//		} 
//		
//		
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 메서드 : 기능을 하기 위한 코드 조각
//		 접근제한자, 리턴타입, 메서드명(매개변수) {
//		 코드;
//		 }
//		 
//		 return : 메서드에서 전달해야하는 값을 전달하는 역할
//		 메서드에서 return을 만나면 리턴 타입의 값을 전달하고, 메서드를 종료 / 리턴 뒤에 적힌 건 실행 안됨.
//		
//		1. 랜덤 (1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
//		2. 배열을 전달 받아서 평균을 연산하는 메서드 (평균을 리턴)
//		3. 배열의 정수 5개와 평균을 출력하는 메서드
//		4. 메인에서는 연산식이 있으면 안됨.
//		5. 메인은 메서드간의 데이터 전달 및 호출만 있어야 됨
//		6. 카페에 제출
//		*리턴타입 : 정수배열 ->int[]
//      매개변수 : X
//		메서드명 : random
		
		
		
		
		int arr[] = random();
		double avg = avg(arr);
		print(arr,avg);
		
		
		//메서드간 호출
	
		
		
		
		
		
	}
	
	
//	1. 랜덤 (1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
//	*리턴타입 : 정수배열 ->int[]
//  *매개변수 : X
//	*메서드명 : random
	public static int[]random() {
		int arr[]=new int[5];
		for(int i =0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		} return arr;
	}
	
	
	
//	2. 배열을 전달 받아서 평균을 연산하는 메서드 (평균을 리턴)
//	*리턴타입 : 평균을 리턴 -> double
//	*매개변수 : 배열 -> int arr[]
//	*메서드명 : avg	
	public static double avg(int arr[]) { //랜덤수를 생성한 배열이 이미 있다.
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum+=arr[i];
		} return (double)sum/arr.length;
	}
	
	
//	3. 배열의 정수 5개와 평균을 출력하는 메서드
//	*리턴타입 : void없음
//	*매개변수 : 정수배열, 평균 -> int arr[], double avg
//	*메서드명 : print	
	public static void print (int arr[], double avg) {
		System.out.println("5개의 랜덤 정수 값  > " );
		//System.out.println(arr); 주소만 출력
		for (int tmp : arr) {
			System.out.print(tmp+" ");
		} System.out.println(); //줄바꿈
		System.out.print("평균 : " + avg);
	}
	
	
//	배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
//	매개변수 : X
//	리턴타입 : X
//	메서드명 : avg
//	메서드 오버로딩 : 같은 메서드명을 쓰더라도, 매개변수의 종류나 개수가 다르면 사용 가능
	
	public static void avg() {
		int arr[]=random(); //랜덤 배열 생성
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum+=arr[i];
		}
	double avg1 = (double)sum/arr.length;
	
	//print 호출
	print(arr,avg1);
	}
	
	
	
}
