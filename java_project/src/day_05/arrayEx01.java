package day_05;

public class arrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 2���� �迭
		 * �ڷ��� �迭��[][] = new �ڷ���[����][����];
		 * */
		
		int arr[][] = new int [3][3];
		int cnt =1; 
		//�ళ��[��][��]
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j] +" ");
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
