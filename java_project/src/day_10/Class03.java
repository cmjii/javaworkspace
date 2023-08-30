package day_10;

public class Class03 {

	public static void main(String[] args) {
		// TV클래스
		// 매개변수 : channel, on,off, vol, name, color
		// 메서드 : 채널, 파워, 음량
		
		TV t = new TV ("삼성티비","검은색");
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
	
	
	public void po() { //전원 메서드
		if(power == true) {
			System.out.println("전원이 켜졌습니다.");
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	
	public void chup() {
		if(power == false) {
			System.out.println("전원부터 켜주세요.");
		}
		channel++;
		System.out.println("현재 채널 : "+channel+"번");
		
		if(channel>=5) {
			channel =1;
			System.out.println("현재채널 : " + channel+"번");
		}
	}
	
	public void chdown() {
		channel--;
		System.out.println("현재 채널 : "+channel+"번");
		
		if(channel<=0) {
			channel =5;
			System.out.println("현재채널 : " + channel+"번");
		}
	}
	
	public void voup() {
		vol++;
		System.out.println("음량 : "+vol);
		if(vol>5) {
			System.out.println("더이상 음량을 올릴 수 없습니다.");
		} 
	}
	
	public void vodown() {
		vol--;
		System.out.println("음량 : "+vol);
		if(vol<0) {
			System.out.println("더이상 음량을 내릴 수 없습니다.");
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