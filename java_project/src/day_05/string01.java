package day_05;

public class string01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String Ŭ���� : ���ڿ��� �ٷ�� Ŭ����
		 * String str = new String();
		 * String str = "������"; //�Ϲ� �ڷ���ó�� �̿��� ����
		 * index 0���� ����
		 * */
		
		String str = "Hello world~";
				System.out.println(str);
		
		
		//charAt(index) : index������ �ִ� �ѱ��ڸ� ��ȯ
		System.out.println("==charAt==");
		System.out.println(str.charAt(0)); //0�������� ����
		
		
		//length : ���ڿ��� ��ü ���� ��������
		System.out.println("==length==");
		System.out.println(str.length());
		
		
		//compareTo(str) : str���ڿ��� ���Ͽ� ������ 0
		//���������� ���̸� -1, �ڸ� 1
		System.out.println("==compareTo==");
		System.out.println("b".compareTo("d"));
		
		
		//concat(str) : �̾���̱� (+�����ڿ� ���� �ǹ�)
		System.out.println("==cancat==");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		
		//equals(str) : �� ���ڿ��� ������ Ȯ�� (��ҹ��� ����)
		//== �ּҰ� ������ Ȯ�� / equals�� ������ ������ Ȯ��
		System.out.println("==equals==");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("bcd"));
		
		
		//indexOf(str) : ������ ��ġ�� ã���ִ� ���
		//ã�� ���ڰ� ������ -1 ����
		System.out.println("==indexOf==");
		System.out.println("abs".indexOf("a"));
		String email = "alswl0244@naver.com";
		System.out.println(email.indexOf("."));//ù��° ��ġ���� �˷���
		System.out.println(email.lastIndexOf("l"));//�Ȱ��� ���� �� �������� ��� ã�� �� (�߰��� ã�� �� ���� for���� �̿��ؼ� �������� ���ؾ� ��)
		
		
		//substring : ���ڿ� ����
		System.out.println("==substring==");
		System.out.println(email.substring(0,5)); // ���۹����� ����, �������� ���� X 0,5 �ϰ�� �ּ�0~4�������� ����
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@"))); //�������� �������� ���������� �ڵ������� ����.
		System.out.println(email.substring(email.indexOf("@")+1));
		
		
		//trim : ���ʿ��� ���� ����
		System.out.println("==trim==");
		System.out.println("        HELLO      ".trim());
		
		//replace : ���� ġȯ
		System.out.println("==replace==");
		System.out.println("Hello World".replace("World","java"));
		
		
		//split :Ư�� ���� �������� ������
		System.out.println("==split==");
		String str1 = "dog,cat,tiger";
		String[] str2 = str1.split(",");
		for(String s : str2) {
			System.out.println(s);
		}
		
		
		//parseInt : ���ڸ� ���ڷ� ��ȯ
		System.out.println("===parseInt===");
		String num1 ="1";
		String num2 ="2";
		System.out.println(num1+num2);
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		
		//contains(str) : �ش���ڸ� �����ϰ� �ִ����� üũ boolean
		System.out.println("===contains===");
		String filename = "�̰����ڹٴ�.txt";
		System.out.println(filename.contains("�ڹ�"));
		
		
	}

}
