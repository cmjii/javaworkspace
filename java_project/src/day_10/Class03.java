package day_10;

public class Class03 {

	public static void main(String[] args) {
		// TVŬ����
		// �Ű����� : channel, on,off, vol, name, color
		// �޼��� : ä��, �Ŀ�, ����
		
		TV t = new TV ("�ＺƼ��","������");
		t.setPower(true);
		t.po();
		
		
	}

}

class TV{
	private int channel;
	private boolean power;
	private int vol;
	private String name;
	private String color;
	
	public TV() {}
	public TV(String name, String color) {
		this.name=name;
		this.color=color;
	}
	
	
	public void po() { //���� �޼���
		if(power == true) {
			System.out.println("������ �������ϴ�.");
		}else {
			System.out.println("������ �������ϴ�.");
		}
	}
	
	
	public void chup() {
		if(power == false) {
			System.out.println("�������� ���ּ���.");
		}
		channel++;
		System.out.println("���� ä�� : "+channel+"��");
		
		if(channel>=5) {
			channel =1;
			System.out.println("����ä�� : " + channel+"��");
		}
	}
	
	public void chdown() {
		channel--;
		System.out.println("���� ä�� : "+channel+"��");
		
		if(channel<=0) {
			channel =5;
			System.out.println("����ä�� : " + channel+"��");
		}
	}
	
	public void voup() {
		vol++;
		System.out.println("���� : "+vol);
		if(vol>5) {
			System.out.println("���̻� ������ �ø� �� �����ϴ�.");
		} 
	}
	
	public void vodown() {
		vol--;
		System.out.println("���� : "+vol);
		if(vol<0) {
			System.out.println("���̻� ������ ���� �� �����ϴ�.");
		}
		
	}
	
	
	
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}