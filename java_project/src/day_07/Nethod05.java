package day_07;

public class Nethod05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2~100까지 소수 출력
		//2~100까지 for문을 돌려서 메서드 호출하여 true 출력
		
		//2~100까지 소수의 합계
		//값을 입력받아서 소수인지 아닌지 출력
		
		int sum=0;
		for(int i =2; i<=100; i++) {
			if(isprime(i)) {
				System.out.print(i + " ");
				sum+=i;
			}
		}
		System.out.println("1~100 소수의 합: " +sum);
		
	}
	
	//기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단 (true false)
	//소수는 1과 자기 자신만을 약수로 가지는 수
	//리턴타입: boolean
	//매개변수: 정수 -> int num
	//메서드명: prime
	
	public static boolean isprime(int num) {
		int cnt=0;
		for(int i =1; i<=num; i++) { //1~num까지 반복하여 약수의 개수를 확인
			if(num%i ==0) { //약수 찾기
				cnt++; //약수의 개수
			}
		}
		if (cnt==2) {
			return true;
		}
		return false;	

	}
				
	


	
	
	
	
	
	
	
	
}
