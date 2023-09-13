package day_19;

import java.util.Arrays;

public class Stream03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//정렬해서 짝수만 출력	
		int[] arr = {5,6,1,2,4,7,8,9,3,2,4,7,8};
		
		
		Arrays.stream(arr).filter(n->n%2==0).sorted().distinct().forEach(System.out::println);
		
		int result[] = Arrays.stream(arr).filter(n->n%2==0).sorted().distinct().toArray();//배열로 리턴
		for(int tmp : result) {
			System.out.print(tmp+" ");
		}
		
		//reduce() : 계산 a = a-b
		int sum = Arrays.stream(arr).reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
	}

}
