package day_20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReader02 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, PrintWriter
		 * ������ �о�鿩, �����Ͽ� ��ü ����
		 * test.txt -> test2.txt�� ����
		 * */
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		final String Path_OUT = "test2.txt"; //������ ��ü��
		System.out.println("���縦 �����մϴٶ���");
		
		br = new BufferedReader(new FileReader("test.txt"));
		pw = new PrintWriter(new FileWriter(Path_OUT));
		
		System.out.println("���縦 ���� ��ü ���� �Ϸ�");
		
		String line = "";
		
		while((line = br.readLine())!=null) {
			System.out.println(line); //�ܼ����
			pw.println(line); //�ٹٲ� ����
			//pw.print(line + "\r\n"); //�ٹٲ� ������
		}
		
		System.out.println("�ؽ�Ʈ ���� �Ϸ�");
		br.close(); pw.close(); //�Ϲ���
		if(br != null) {
			br.close();
		}if(pw != null) {
			pw.close();
		}
		
	}

}
