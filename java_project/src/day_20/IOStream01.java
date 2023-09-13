package day_20;

import java.io.IOException;

public class IOStream01 {

	public static void main(String[] args) {
		/* ��Ʈ�� : �ܹ������� �����Ͱ� �귯���� ����
		 * �ڹٴ� �Է½�Ʈ��, ��½�Ʈ���� ���� �����͸� �����
		 * �پ��� ��ġ�� �������̰� �ϰ����ִ� ������� �����ϱ� ���� ����� ��Ʈ���� ���� �ϰ����� ����
		 * 
		 * �ΰ��� ������ ��Ʈ��
		 * - ����Ʈ ������ ��Ʈ�� : �⺻ (����, �׸�, ��Ƽ�̵��)
		 * - ���� ������ ��Ʈ�� : ���ڸ� ������� �� �� ���
		 * 
		 * ---����Ʈ ��Ʈ��---
		 * �Է� | InputStream : fileInputStream, BufferedInputStream, DataInputStream ...
		 * ��� | OutputStream : fileOutputStream, BufferedOutputStream, DataOutputStream, PrintWriter ...
		 * 
		 * 
		 * ---���� ��Ʈ��---
		 * �Է� | Reader : FileReader, BufferedReader, InputStreamReader ...
		 * ��� | Writer : FileWriter, PrintWriter, BufferedWriter ...
		 * 
		 * 
		 * ��ݽ�Ʈ�� / ������Ʈ��
		 * 
		 * ��ݽ�Ʈ�� : ��󿡼� ���� �ڷḦ �а� ���� ����� �ִ� ��Ʈ��
		 * ������Ʈ�� : ���� �а� ���� ����� ������, �߰����� ����� �����ִ� ��Ʈ��
		 * 
		 * ��ݽ�Ʈ�� | fileInputStream, fileReader, fileOutputStream, fileWriter ...
		 * 
		 * ������Ʈ�� | inputStreamReader,, bufferedReader, bufferedWriter ...
		 *  
		 * */
		
		//ǥ�� ��� (����� = �ܼ�) ��Ʈ��
		System.out.println();
		
		//ǥ�� �Է� (Ű����) ��Ʈ��
		try {
			//�ѹ��� �ѹ���Ʈ �б�
			int b = System.in.read();
			System.out.println("read() > "+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		//ǥ�� ���� ��� ��Ʈ��
		System.err.println("111");
	}

}
