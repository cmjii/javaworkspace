package day_14;

public class Gold extends Customer{
	
	
	
	//������ 
		private double saleRatio;
		
		public Gold() {}
		public Gold(int id, String name) {
		super(id, name); 
			customerGrade = "Gold";
			bonusRatio= 0.02;
			saleRatio=0.1;
		}
		
		//�޼��� �� ���αݾ��� ������ �� �ֵ��� calcPrice�޼��带 �������̵�.
		@Override
		public int calcPrice(int price) {
			bonusPoint = bonusPoint+(int)(price * bonusRatio);
			price = price - (int)(price * saleRatio);
			return price;
		}
		
		public double getSaleRatio() {
			return saleRatio;
		}
		public void setSaleRatio(double saleRatio) {
			this.saleRatio = saleRatio;
		}
	
}
