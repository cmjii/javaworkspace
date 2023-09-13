package day_20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class BufferedReader03 {

	public static void main(String[] args) throws IOException {
		/* BufferedReader, FileReader 를 이용하여 out.txt 파일은
		 * map에 저장하고, 합계와 총 인원수를 출력
		 * 입력한 값을 읽어들이면 값은 전부 String
		 * 계산을 위해서는 int 자료형으로 변환이 필요
		 * Integer.parseInt(값): String -> int
		 * */
		

	
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		while (true) {
			String Line = br.readLine();
			if(Line == null) {
				break;
			}
			System.out.println(Line);
		}
		br.close();
	}

}
