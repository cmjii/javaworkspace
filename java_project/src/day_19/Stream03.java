package day_19;

import java.util.Arrays;

public class Stream03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//�����ؼ� ¦���� ���	
		int[] arr = {5,6,1,2,4,7,8,9,3,2,4,7,8};
		
		
		Arrays.stream(arr).filter(n->n%2==0).sorted().distinct().forEach(System.out::println);
		
		int result[] = Arrays.stream(arr).filter(n->n%2==0).sorted().distinct().toArray();//�迭�� ����
		for(int tmp : result) {
			System.out.print(tmp+" ");
		}
		
		//reduce() : ��� a = a-b
		int sum = Arrays.stream(arr).reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
	}

}
