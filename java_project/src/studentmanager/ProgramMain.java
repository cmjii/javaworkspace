package studentmanager;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		//�޴��� ����ϴ� ����ڷκ��� � ����� ������ ������ ó��
//		 1.�л��߰� 2.�л�����Ʈ 3.�л��˻�
//		 * 4.�л����� 5. �л����� 6.�����߰�
//		 * 7.�������� 8.������� 9.����
//		 */

			Scanner scan = new Scanner(System.in);
			StudentManager sm = new StudentManager();
			
			int menu =0;
			do {
				
				System.out.println("---�л��������α׷�---");
				System.out.println("1.�л��߰� 2.�л�����Ʈ 3.�л��˻�");
				System.out.println("4.�л����� 5. �л����� 6.�����߰�");
				System.out.println("7.�������� 8.������� 9.����");
				menu = scan.nextInt();
				
				switch(menu) {
				
				case 1 : sm.addStd(scan); break;
				case 2 : sm.printStd(); break;
				case 3 : sm.searchStd(scan); break;
				case 4 : sm.modStd(scan); break;
				case 5 : sm.delStd(scan); break;
				case 6 : sm.addSub(scan); break;
				case 7 : sm.modSub(scan); break;
				case 8 : sm.delSub(scan); break;
				case 9 :  break;
				default:System.out.println("�߸��� �Է��Դϴ�.");
				
				}
			} while (menu !=9);

		
		
	}

}
