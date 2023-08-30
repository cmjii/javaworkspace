package day_04;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			//배열 : 같은 타입, 같은 의미를 가지는 변수의 집합 (참조변수)
		// 참조변수는 초기화가 미리 되어있음. null or 0
		// 기본형 변수는 초기화를 해주지 않음. 반드시 직접 초기화 해주어야함
		// 타입 [] 배열이름; 
		// 타입 배열이름[];

	//배열 선언 & 초기화
		// 타임[] 베열이름 = new 타입[길이]; 가장 일반적인 방법
		// 타입[] 배열이름 = new 타입[]{값,값,값,값,값,,,,}
		// 타입[] 배열이름 = {값, 값, 값, 값, 값,,,,} 선언과 동시에 초기화를 할 때만 가능
		// 배열의 길이는 0이상이어야 한다.
		// 배열의 길이는 length 확인할 수 있음.
		// 배열의 시작번지는 0번지부터 시작
		// 배열[3] => 0 1 2 
		// 배열의 마지막 번지는 항상 length -1
		
		
	int[] arr;
	arr= new int[5];
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	int arr1[];
	int arr2[]=new int[] {1,2,3,4,5};
	
//	System.out.println(arr);
//	System.out.println(arr2);
//	
//	 System.out.println();
//	 
//	int arr3[]= {1,2,3};
//	System.out.println(arr3[0]);
//	System.out.println(arr3[1]);
//	System.out.println(arr3[2]);
	
	for(int i=0; i< arr2.length; i++) {
		System.out.print(arr2[i] +" ");
	}
	
	
	//배열을 사용하는 이유
	//반복문을 이용할 수 있기 때문에 편리함
	//관리가 쉬움.
	System.out.println();
	for(int i =0; i<arr.length; i++) {
		arr[i]=(i*10)+10;
		System.out.println(arr[i]);
	} 
	
System.out.println();
	
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	
	//배열 생성 후 12345 저장, 출력
	
	int a [] = new int [] {1,2,3,4,5};
	System.out.println(a[4]);
	
System.out.println();
	
	int [] b = new int [5];
	for(int i =0; i< b.length; i++) {
		b[i] = i+1;
		System.out.println(b[i]);
	}

	System.out.println();
	
	int [] c = new int[10];
	for(int i = 0; i<c.length; i++) {
		c[i]=i+1;
		if(c[i]%2==0) {
			System.out.print(c[i]+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	}

}
