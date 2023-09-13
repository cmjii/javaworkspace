package day_11;



public class EzenComputerMain {

	public static void main(String[] args) {
		// EzenComputer의 객체 생성 후 출력
		
		EzenComputer E = new EzenComputer("홍길동","010-1111-2222");
		E.setBirth("1999-07-01");
		E.setAge(20);
		E.setBranch("인천");	
		E.student();
		E.academy();
	
		E.addc("java", "8/16");
		E.addc("자바", "8/16");
		E.course();

		EzenComputer E1 = new EzenComputer("김영희","010-2222-2222","990000",22,"서울");
		E1.student();
		E1.addc("db", "3개월");
		E1.course();
		
		//학생클래스를 담을 수 있는 배열을 생성 후 5명의 학생을 등록

		EzenComputer[] std = new EzenComputer[7];
		std[0]= new EzenComputer("영이", "010-5555-5555", "980101", 20, "인천");
		std[1]= new EzenComputer("순이", "010-5555-6666", "980105", 24, "인천");
		std[2]= new EzenComputer("철이", "010-5555-7777", "980110", 23, "인천");
		std[3]= new EzenComputer("하이", "010-5555-8888", "980115", 22, "서울");
		std[4]= new EzenComputer("구이", "010-5555-9999", "980120", 21, "서울");
		std[5]= E;
		std[6]= E1;
		std[0].addc("DB", "1개월");
		std[1].addc("java", "3개월");
		std[1].addc("css", "2개월");
		
		/* 학생 이름으로 검색 -> 모든 정보 출력
		 * 지점정보로 검색 시 -> 해당 지점 학생 정보만 전체
		 * 자바 과목을 듣는 학생만 검색 -> 학생정보, 수강정보 출력
		 * */
		
		System.out.println("=========================");
		int cnt =0;
		String searchname = "홍길동";
		System.out.println(searchname+" 님의 정보--------");
		for(int i =0; i<std.length; i++) {
		if(searchname.equals(std[i].getName())) {
			std[i].student();  std[i].academy(); std[i].course();
			cnt++;
		}
		}
		if(cnt==0) {
			System.out.println("검색결과가 없습니다.");
		}
		

	
		String searchbranch = "인천";
//		System.out.println(searchbranch+" 님의 정보--------");
//		for(int i =0; i<std.length; i++) {
//			if(searchbranch.equals(std[i].getBranch())) {
//				std[i].student(); std[i].academy(); std[i].course();
//		}
//		}
		
		
		//향상된 for문 -> 완성된 배열에서만 사용 가능
		System.out.println(searchbranch+" 님의 정보--------");
		for(EzenComputer e: std) { //향상된 for문을 사용하기 위해 객체 생성 EzenComputer e
			if(e.getBranch().equals(searchbranch)) {
				e.student();
			}
		}
		
		
		String searchaCourse= "java";
		System.out.println(searchaCourse+" 수강 정보--------");
		for(EzenComputer e: std) {
			for(int i =0; i<e.getCnt(); i++) {
				if(e.getCourse()[i].equals(searchaCourse)) {
					e.student(); e.course();
				}
			}
		}
		
		
		
	}



}

