package day_17;

import java.util.HashMap;
import java.util.Scanner;

public class mapEx01 {

	public static void main(String[] args) {
		/* Map을 이용한 성적 관리 프로그램을 생성
		 * -- menu --
		 * 1. 성적추가
		 * 2. 성적조회 (전체출력) : 합계/평균 같이 출력
		 * 3. 성적조회(과목 조회) : 국어 -> 98점 (서치 후 일치하는 과목 출력)
		 * 4. 성적수정 : 서치 후 수정								
		 * 5. 성적삭제										
		 * 6. 종료											
		 * */					
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int a = 0;
		do {			
			menu();
			
			a = scan.nextInt();		
			
			switch(a) {
			case 1 : list(map); break;
			case 2 : list1(map); break;
			case 3 : print(map); break;
			case 4 : lists(map); break;
			case 5 : listd(map); break;
			case 6 : break;
			default : System.out.println("잘못된 입력입니다."); break;
						
			}
							
		
		} while (a != 6);
			System.out.println("프로그램 종료");						
	
	}			
	
	
	
	//성적 추가
	public static void list (HashMap<String, Integer> map) {
	
	Scanner scan = new Scanner(System.in);
	
	int y =0;
	
	do { 	
			System.out.println("추가할 과목을 입력해주세요.");
			String sub = scan.next();
			System.out.println("점수를 입력해주세요.");
			int num = scan.nextInt();
			if(num<0||num>100) {
				System.out.println("잘못된 점수입니다."); return;
			}
			if(map.get(sub)==null) {
				map.put(sub, num);
			}else {
				System.out.println("이미 추가된 과목입니다.");
			}
		
			System.out.println("과목을 추가하려면 1번, 종료하려면 0번을 눌러주세요.");
			y = scan.nextInt();
			
			
	} while (y !=0);
	
	
}		
	
	
	//전체 출력
	public static void  list1 ( HashMap<String, Integer> map) {
		Scanner scan = new Scanner(System.in);
		int sum =0;
		System.out.println("--전체--");
		for(String tmp : map.keySet()) {
			System.out.print(tmp+" :" + map.get(tmp)+" ");
		}
		for(String tmp : map.keySet()) {
			sum+= map.get(tmp);
		}
		System.out.println();
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(double)sum/map.size());
		System.out.println("메뉴로 돌아갈거면 1 번을 눌러주세요.");
		int j = scan.nextInt();
		
	}
	
	
	
	//과목조회
	public static void print (HashMap<String, Integer> map) {
		Scanner scan = new Scanner(System.in);
		int i =0;
		
	do {
		
		System.out.println("검색할 과목을 입력하세요.");
		String a = scan.next();
		if(map.containsKey(a)) {
			System.out.println(a+"->"+map.get(a));
		}
		else if(!(map.containsKey(a))) {
			System.out.println("검색하신 과목이 없습니다.");
		}
	
		System.out.println("더 검색하려면 1번, 종료하려면 0번을 눌러주세요.");
		i = scan.nextInt();
		
	}	while (i!=0);
}
	
	//성적수정
	public static void lists (HashMap<String, Integer> map) {
		Scanner scan = new Scanner(System.in);
		int f = 0;
	do {	System.out.println("수정이 필요한 과목을 입력해주세요.");
		String q = scan.next();
		
		if(map.containsKey(q)) {
			System.out.println("수정할 점수를 입력해주세요.");
			int w = scan.nextInt();
			map.put(q, w);
		}
		System.out.println("--수정 확인--");
			System.out.println(q+"->"+map.get(q));
			
			System.out.println("더 수정하려면 1번, 종료하려면 0번을 눌러주세요.");
			f = scan.nextInt();
		
	}while(f!=0);
		
		
		
	}
	
	//성적삭제
	public static void listd (HashMap<String, Integer> map) {
		Scanner scan = new Scanner(System.in);
		int h = 0;
  do {	System.out.println("삭제할 과목을 입력해주세요.");
		String p = scan.next();
		map.remove(p);
		System.out.println("--수정 후 과목--");
		for(String tmp : map.keySet()) {
			System.out.print(tmp+":" + map.get(tmp)+" ");
			System.out.println();
		}
		System.out.println("더 삭제하려면 1번, 종료하려면 0번을 눌러주세요.");
		h = scan.nextInt();
	
  		}while(h!=0);
	}
	
	
	//메뉴 메서드
	public static void menu ( ) {
		
		System.out.println("--메뉴--");
		System.out.println("1. 성적추가");
		System.out.println("2. 성적조회 (전체출력)");
		System.out.println("3. 성적조회(과목 조회)");
		System.out.println("4. 성적수정");
		System.out.println("5. 성적삭제	");
		System.out.println("6. 종료");
		 
	}
			
	
	
}


