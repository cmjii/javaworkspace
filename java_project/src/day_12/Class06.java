package day_12;

public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EzenStudent E = new EzenStudent("ȫ�浿","4444","","��õ");
		E.print();
		System.out.println(E);
	}

}

/* ��ü�� �ʱ�ȭ �ϴ� ��� : �⺻��(null,0), ����� �ʱⰪ, �ʱ�ȭ ��, ������
 * 1. ����� �ʱ�ȭ : ��������� ����� ���ÿ� �ʱⰪ�� ���
 * 2. �ʱ�ȭ �� : {} ��������� �ʱ�ȭ
 * 3.������ : ��ü�� �ʱ�ȭ �ϴ� ���
 * �ʱ�ȭ �켱����
 * �⺻�� -> ����� �ʱⰪ -> �ʱ�ȭ�� -> ������
 * */

/* ������� : ���� , �̸�, ��, ��ȭ��ȣ
 * ������
�޼��� : ���(print) getter setter
 * */
 class EzenStudent{
	 //�⺻��
	 private String gigum="����";//=������ ���� ������ Ȯ���غ����� �⺻�� null��
	 private String name;
	 private String tel;
	 private String group;

	 {
		 //�ʱ�ȭ ��
		 gigum="incheon"; //incheon�� ������ ���� ��� : incheon
		 group="����";
	 
	 }
	 
	 public EzenStudent() {}
	 public EzenStudent (String name, String tel) { //�̸��� ��ȭ��ȣ ������
		 this.name= name;	this.tel=tel;	
	 }
	 
	 public EzenStudent (String name, String tel, String group, String gigum) { //��� ���� ������ //�����ڰ� �ʱ�ȭ ����
		 this.name= name;	this.tel=tel;	this.group=group;	this.gigum=gigum;
	 }
	 
	 public void print(){
		 System.out.print( name+" "+tel+" "+group+" "+gigum);
	 }
	 
	public String getGigum() {
		return gigum;
	}
	public void setGigum(String gigum) {
		this.gigum = gigum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	
	
	@Override
	public String toString() {
		return "EzenStudent [gigum=" + gigum + ", name=" + name + ", tel=" + tel + ", group=" + group + "]";
	}
	 
	 
	 
	 
 }