package day_17;

import java.util.HashMap;
import java.util.Scanner;

public class map03 {

	public static void main(String[] args) {
		// ����� ������ �Է� �޾� ����:����, �հ� , ���
		//���� Ű���尡 ���� �� ���� �ݺ� ����Ű���� =0
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		
		int sum =0;
		int y =0;
		do {
		System.out.println("����> ");
		String kor = scan.next();
		System.out.println("����> ");
		int knum = scan.nextInt();
		map.put(kor, knum);
		System.out.println("�����Ͻ÷��� 0�� �����ּ���. ��� �Է��Ͻ÷��� 1�� �����ּ���.");
		y = scan.nextInt();
		
		for(String tmp : map.keySet()) {
			sum+= map.get(tmp);
		}
		
		}while(y !=0);
		System.out.println("����");
		System.out.println("�հ�: "+sum);
		System.out.println("��� : "+(double)sum/map.size());
	}

}
