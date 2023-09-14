package day_21;

import java.io.File;

public class FileObject {

	public static void main(String[] args) {
		// 파일이 가지고 있는 정보 출력
		File f = new File("D:\\cmj\\javaworkspace\\java_project\\out.txt");
		System.out.println(f.getName()); //경로를 제외한 이름
		System.out.println(f.getPath()); //경로 + 이름
		System.out.println(f.getParent()); //경로만
		System.out.println(File.separator); //파일구분자 (많이사용)
		
		//파일명과 경로가 String 형태로 들어온다면... 구분
		String fstr = f.toString();
		System.out.println(fstr);
		
		System.out.println();
		
		//fstr 드라이브만 추출
		
		System.out.println("드라이브 : "+ fstr.substring(0,fstr.indexOf(File.separator)));
		
		//파일경로만 추출
		
		System.out.println("경로 : "+ fstr.substring(fstr.indexOf(File.separator),fstr.lastIndexOf(File.separator)));
		
		//파일명만 추출
		
		System.out.println("파일명 : " + fstr.substring(fstr.lastIndexOf(File.separator)+1));
		
	}

}
