package day_14;

public class Silver extends Customer{
	
	private int customerID = 3333;

		
	public Silver(){
		super("����","Silver");
	}
		
	public int calcPrice(int price) {
		 bonusPoint += (int)(price*bonusRatio);
		 int rprice = (int)(price*saleRatio);
		 System.out.println("�Ǳ��Ű��� "+rprice+"�Դϴ�.");
		 return rprice;
	}
	
}


