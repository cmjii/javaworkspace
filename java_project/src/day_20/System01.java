package day_20;

import java.io.IOException;

public class System01 {

	public static void main(String[] args) throws IOException {
		/*	system.in�� �̿��Ͽ� ���ĺ� �ϳ��� ���� Enter�� ������ ���ĺ��� �ֿܼ� ���
		 * */

		System.out.println("���ĺ� �Է� > ");
		int i;
		while(	(i=System.in.read()) != '\n') {
				System.out.print((char)i);
		}
		
	}

}
