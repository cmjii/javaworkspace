package day_16;

public class ���������Exception {

	public static void main(String[] args) {
		/* passwordException
		 * 
		 * - ��й�ȣ�� null�� �� ����. (throw)
		 * - ��й�ȣ�� ���̴� 5�� �̻�
		 * - ��й�ȣ�� ���ڷθ� �̷������ �ȵȴ�.(���� + ���� + Ư������)
		 * */
		String password = "!!!!!";
		PasswordTest pt = new PasswordTest();
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}


class PasswordTest{
	private String password;

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�.");
		}
		else if(password.length()<5) {
			throw new PasswordException("��й�ȣ�� 5�� �̻��̾�� �մϴ�.");
		}
		else if(password.matches("[a-zA-z0-9]+")) {
			throw new PasswordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ��մϴ�.");
		}
		
		this.password = password;
		
		
	}

	public String getPassword() {
		return password;
	}
	
}

