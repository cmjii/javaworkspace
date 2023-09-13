package day_20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class BufferedReader03 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, FileReader �� �̿��Ͽ� out.txt ������
		 * map�� �����ϰ�, �հ�� �� �ο����� ���
		 * �Է��� ���� �о���̸� ���� ���� String
		 * ����� ���ؼ��� int �ڷ������� ��ȯ�� �ʿ�
		 * Integer.parseInt(��): String -> int
		 * */
		

	
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		while (true) {
			String Line = br.readLine();
			if(Line == null) {
				break;
			}
			System.out.println(Line);
		}
		br.close();
	}

}
