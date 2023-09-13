package day_15;

public class ���� {

	public static void main(String[] args) {
		/* 5���� ���ڿ� �迭�� ������ ��, 5���� ���ϸ��� �Է¹޴� �ڵ带 �ۼ�
		 * �Է¹��� ���� �� �̹��� ������ �˻��Ͽ� ����ϴ� �ڵ� �ۼ�
		 * �̹������� ������ (jpg, png, gif, jpeg)
		 * String[] fileName = {"java.txt","String.jpg","method.png",
		 * "String.pdf","java.pdf"}
		 * 
		 * --�̹��� ����--
		 * String.jpg
		 * method.png
		 * */
		
		 ���� ex = new ����();
		
		 String[] fileName = {"java.txt","String.jpg","method.png", "String.pdf","java.pdf"};
		 
		 String [] img = {"jpg","png","gif","jpeg"}; //����
		 
		 try {
			
			 for(String tmpFile : fileName) {
				 String search = tmpFile.substring(tmpFile.lastIndexOf(".")+1);
				 //System.out.println(search);
				
				 if(ex.iscontains(img, search)) {
					 System.out.println(tmpFile);
				 }
			 }
			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		 
	}
	
	//isContains -> �迭���� ã�� ���ڰ� ������ true, false
	public boolean iscontains(String arr[] , String search) {
		if(arr==null || arr.length==0) {
			throw new RuntimeException("�迭�� �������� �ʽ��ϴ�.");
		}
		if(search == null) {
			throw new RuntimeException("�˻�� �����ϴ�.");
		}
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false;
	}
	
	
}
