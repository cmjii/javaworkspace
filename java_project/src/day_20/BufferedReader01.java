package day_20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {

	public static void main(String[] args) throws IOException {
		// BufferedReader : ���ڱ�� ������Ʈ��
		/* ���� ������ �бⰡ ����
		 * �� �̻� ���� ������ ������ null�� ����
		 * ������Ʈ�� : ���� �а� ���� ����� ���� ������ ��� ��Ʈ���� �Ű������� �����ؾ� �Ѵ�.
		 * */
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		while(true) {
			String line = br.readLine(); //�Ѷ��� �о����
			if(line == null ) { //���̻� ���� ������ ����.
				break;
			}
			System.out.println(line);
		}	
		br.close();
	}

}