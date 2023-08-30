package day_05;

public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* arraycopy : 배열복사
		 * 객체를 다시 생성해서 값을 복사
		 * 배열은 길이를 가지고 있음.
		 * 한번 정해진 길이는 늘리거나 줄일 수 없음
		 * 이후 추가, 삭제 불가능
		 * 배열의 길이를 늘리거나 줄이고 싶을 때 배열 복살르 통해 길이를 조정
		 * */
		
		
		int arr[] = new int[] {10,15,20};
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		 System.out.println();
		 
		 int arr1[] = new int[5];
		 
		 //arraycopy이용
		 System.arraycopy(arr,0,arr1,0,arr.length);
		 
//		 for(int i = 0; i<arr.length; i++) {
//			 arr1[i]= arr[i];
//		 }
		 
		for(int tmp:arr1) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("--------------------------------");
		
		//3개의 값을 담을 수 있는 string 배열 생성
		//국 영 수 글자를 담은 후 출력 (향상된 for문으로 출력)
		// 5개의 값을 담을 수 있은 string 배열을 생성 후 arraycopy
		// 사회 과학을 추가하여 향상된 for문으로 출력
		
		
		String [] arr2 = {"국어","수학","영어"};
		for(String tmp:arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		String arr3 [] = {"","","","사회","과학"};
		System.arraycopy(arr2, 0, arr3, 0, arr2.length);
		
		for(String tmp:arr3) {
			System.out.print(tmp+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
