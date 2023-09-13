package day_14;

public class Silver extends Customer{
	
	private int customerID = 3333;

		
	public Silver(){
		super("훈이","Silver");
	}
		
	public int calcPrice(int price) {
		 bonusPoint += (int)(price*bonusRatio);
		 int rprice = (int)(price*saleRatio);
		 System.out.println("실구매가는 "+rprice+"입니다.");
		 return rprice;
	}
	
}


