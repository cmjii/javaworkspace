package day_20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {

	public static void main(String[] args) {

		
		try {
			FileWriter fw = new FileWriter("test.txt");
			for(int i =1; i<=10; i++) {
				String data = i+". test�Դϴ�. \r\n";
				fw.write(data);
			}
			fw.close();
			
			//���� �߰� ��� ("���ϸ�",true)
			FileWriter fw2 = new FileWriter("test.txt",true);
			for(int i =11; i<20; i++) {
				String data = i+". test�Դϴ�. \r\n" ;
				fw2.write(data);
			}
			fw2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
