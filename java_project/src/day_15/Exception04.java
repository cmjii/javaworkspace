package day_15;

public class Exception04 {

	public static void main(String[] args) {
		// ��Ƽ ĳġ
		/* try {
		 * 
		 * }catch(���� ���� Ŭ���� e) {
		 * 
		 * }catch(���� ���� Ŭ���� e) {
		 * 
		 * }catch(Exception e) {
		 * 
		 * }
		 * */
		try {
			//int res = 1/0;
			//System.out.println(res);
			int arr[] = null;
			//int arr1[] = new int[3];
			//arr1[5]=10;
			
		} catch(ArithmeticException | NullPointerException e) {
			System.out.println("���� �߻�");
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ �Ѿ���ϴ�.");
		}catch (Exception e) { //�������� �ֻ��� exception default����
			e.printStackTrace();
		}
		System.out.println("����");
	}

}
