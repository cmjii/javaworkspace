package day_14;

public class Customer {

	/* �� Ŭ����
	 * �� ��� - �Ϲ� �� / Gold�� / VIP��]
	 * 
	 * ���ο��� �����ϱ� �Ϲ� ���� ���������� �ǹ� ��� ����� �������� �� ��� 
	 * 
	 * ��ID : int customerID
	 * �� �̸� : String customerName
	 * �� ��� : String customerGrade
	 * ���ʽ�����Ʈ : 
	 * ���ʽ� ����Ʈ ���� ���� : double bonusRatio
	 * ������ : double saleRatio
	 * 
	 * - Customer ��ü ���� ��
	 *  �⺻ customerGrade = Silver
	 *  �⺻ bonusRatio = 0.01 ����
	 *  
	 *  - �޼���
	 *   ���ʽ� ���� ��� �޼��� ( �޼���� : calcPrice(int price))
	 *   => ���ʽ��� �����ϰ�, ���� ���� üũ , ���� price ����'
	 *   	���űݾ��� �ְ�, ���� ���ʽ� ���, ���ʽ�����Ʈ�� ����, �� ���űݾ� ����
	 *   
	 *   - ��¸޼��� (�޼���� customerInfo())
	 *    ȫ�浿���� ����� VIP�̸�, ���ʽ� ����Ʈ�� 1000�� �Դϴ�.
	 *    ���� ���� ��ȣ�� 1111�Դϴ�. - VIP�� ���
	 *    
	 *   - silver ���
	 *     ��ǰ�� �� �� ���� ���� / ���ʽ� ����Ʈ 1%����
	 *     
	 *     - Gold ��� 
	 *     	��ǰ�� ������ �� 10%���� / ���ʽ� ����Ʈ 2%����
	 *     
	 *     - VIP���
	 *     	 ��ǰ�� ������ �� 20% ���� / ���ʽ� ����Ʈ 5%����
	 *     		������縦 ���´�. (int agentID)
	 * */
	
	//������� ����
	
	//������� ����
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//������
	public Customer() {}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01; 
	}
	
	//�޼��� 
	//������ �Ű������� �޾� ����Ʈ ���� / ������ ����
	public int calcPrice(int price) {
		bonusPoint = bonusPoint + (int)(price*bonusRatio);
		return price;
	}
	//�� ���� ��� �޼���
	public void customerInfo() {
		System.out.println(customerName+"���� ����� "+customerGrade+"�̸�, ���ʽ� ����Ʈ��"+
				bonusPoint+"�Դϴ�.");
	}
	//toString ���·� ����
//	public String customerInfo() {
//		return customerName+"���� ����� "+customerGrade+"�̸�, ���ʽ� ����Ʈ��"+
//				bonusPoint+"�Դϴ�.";
//	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
	
}
