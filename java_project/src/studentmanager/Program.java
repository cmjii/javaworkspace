package studentmanager;

import java.util.Scanner;

public interface Program {
	/* �������̽� ���� 
	 * 1.�л��߰� 2.�л�����Ʈ 3.�л��˻�
	 * 4.�л����� 5. �л����� 6.�����߰�
	 * 7.�������� 8.������� 9.����
	 */
	
	void addStd(Scanner scan);
	void printStd();
	void searchStd(Scanner scan);
	void modStd(Scanner scan);
	void delStd(Scanner scan);
	void addSub(Scanner scan);
	void modSub(Scanner scan);
	void delSub(Scanner scan);
	
	
}
