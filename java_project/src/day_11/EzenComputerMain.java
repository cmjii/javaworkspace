package day_11;



public class EzenComputerMain {

	public static void main(String[] args) {
		// EzenComputer�� ��ü ���� �� ���
		
		EzenComputer E = new EzenComputer("ȫ�浿","010-1111-2222");
		E.setBirth("1999-07-01");
		E.setAge(20);
		E.setBranch("��õ");	
		E.student();
		E.academy();
	
		E.addc("java", "8/16");
		E.addc("�ڹ�", "8/16");
		E.course();

		EzenComputer E1 = new EzenComputer("�迵��","010-2222-2222","990000",22,"����");
		E1.student();
		E1.addc("db", "3����");
		E1.course();
		
		//�л�Ŭ������ ���� �� �ִ� �迭�� ���� �� 5���� �л��� ���

		EzenComputer[] std = new EzenComputer[7];
		std[0]= new EzenComputer("����", "010-5555-5555", "980101", 20, "��õ");
		std[1]= new EzenComputer("����", "010-5555-6666", "980105", 24, "��õ");
		std[2]= new EzenComputer("ö��", "010-5555-7777", "980110", 23, "��õ");
		std[3]= new EzenComputer("����", "010-5555-8888", "980115", 22, "����");
		std[4]= new EzenComputer("����", "010-5555-9999", "980120", 21, "����");
		std[5]= E;
		std[6]= E1;
		std[0].addc("DB", "1����");
		std[1].addc("java", "3����");
		std[1].addc("css", "2����");
		
		/* �л� �̸����� �˻� -> ��� ���� ���
		 * ���������� �˻� �� -> �ش� ���� �л� ������ ��ü
		 * �ڹ� ������ ��� �л��� �˻� -> �л�����, �������� ���
		 * */
		
		System.out.println("=========================");
		int cnt =0;
		String searchname = "ȫ�浿";
		System.out.println(searchname+" ���� ����--------");
		for(int i =0; i<std.length; i++) {
		if(searchname.equals(std[i].getName())) {
			std[i].student();  std[i].academy(); std[i].course();
			cnt++;
		}
		}
		if(cnt==0) {
			System.out.println("�˻������ �����ϴ�.");
		}
		

	
		String searchbranch = "��õ";
//		System.out.println(searchbranch+" ���� ����--------");
//		for(int i =0; i<std.length; i++) {
//			if(searchbranch.equals(std[i].getBranch())) {
//				std[i].student(); std[i].academy(); std[i].course();
//		}
//		}
		
		
		//���� for�� -> �ϼ��� �迭������ ��� ����
		System.out.println(searchbranch+" ���� ����--------");
		for(EzenComputer e: std) { //���� for���� ����ϱ� ���� ��ü ���� EzenComputer e
			if(e.getBranch().equals(searchbranch)) {
				e.student();
			}
		}
		
		
		String searchaCourse= "java";
		System.out.println(searchaCourse+" ���� ����--------");
		for(EzenComputer e: std) {
			for(int i =0; i<e.getCnt(); i++) {
				if(e.getCourse()[i].equals(searchaCourse)) {
					e.student(); e.course();
				}
			}
		}
		
		
		
	}



}

