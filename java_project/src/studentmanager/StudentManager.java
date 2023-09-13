package studentmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements Program{

	//멤버변수 Student List
	private  List<Student> student = new ArrayList<>();
	
	public StudentManager() {//필수면 생성자에 저장
		add();
	}
	
	//기본 학생 추가
	public void add() {
		student.add( new Student("홍길동",16,"010-7777-8888"));
		student.add( new Student("김순이",15, "010-1111-2222"));
		student.add( new Student("이순신",16,"010-3333-3333"));
		student.add( new Student("강감찬",16,"010-1111-5555"));
		student.add( new Student("바둑이"));
	}
	
	@Override //추가 메서드
	public void addStd(Scanner scan) {
		System.out.println("추가할 이름을 입력하세요.");
		String name = scan.next();
//		System.out.println("나이를 입력하세요.");
//		int age = scan.nextInt();
//		System.out.println("번호를 입력하세요.");
//		String phone = scan.next();
		student.add(new Student(name));
		
		System.out.println("--추가완료--");
	}

	@Override //리스트 메서드
	public void printStd() {
		for(int i =0; i<student.size(); i++) {
			System.out.println(student.get(i));
		}
		
	}

	@Override  //검색 메서드
	public void searchStd(Scanner scan) {
		// 학생명을 입력받아 학생 정보를 출력
		System.out.println("학생명을 입력하세요.");
		String name = scan.next();
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).printOne();
				return;
			}
		}
		System.out.println("검색한 학생을 찾을 수 없습니다.");
	}

	@Override  //수정메서드
	public void modStd(Scanner scan) {
		// 수정할 정보(이름, 나이, 전화번호)
		System.out.println("학생명을 입력하세요.");
		String name = scan.next();
		for(int i = 0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("수정할 정보를 입력하세요.");
				String op = scan.next();
				switch(op) {
				case "이름" :System.out.println("수정할 값을 입력하세요.");
							String modName = scan.next();
							student.get(i).setName(modName);
							System.out.println("--수정완료--");
							break;
				case "나이" : System.out.println("수정할 값을 입력하세요.");
							 int modage = scan.nextInt();
							 student.get(i).setAge(modage);
							 System.out.println("--수정완료--");
							 break;
				case "전화번호" :System.out.println("수정할 값을 입력하세요.");
					          String modphone = scan.next();
							  student.get(i).setPhone(modphone);
							  System.out.println("--수정완료--");
							  break;
				default : System.out.println("잘못된 입력입니다.");
				}
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
		
	}

	//remove는 index삭제
	 @Override //삭제메서드
	public void delStd(Scanner scan) {
		// 학생명을 입력받아 일치하는 학생을 삭제
		System.out.println("삭제할 학생명을 입력하세요.");
		String name = scan.next();
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.remove(i);
		System.out.println("--취소완료--");
				return;
			}
			}
		System.out.println("학생이 존재하지 않습니다.");
		
		//remove(object) 삭제 = > object 자체로 이름이 일치하면 같은 객체
//		student.remove(new Student(name));
//		if(!student.remove(new Student(name))) {
//			System.out.println("학생이 존재하지 않습니다.");
//			return;
//		}
		
	}
	
	
	

	@Override
	public void addSub(Scanner scan) {
		// 학생명/과목/점수 입력받아 과목등록 메서드 호출
		System.out.println("학생명을 입력하세요.");
		String name = scan.next();
		System.out.println("과목을 입력하세요.");
		String sub = scan.next();
		System.out.println("성적을 입력하세요.");
		int score = scan.nextInt();
		
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).addSubject(sub, score);
				return;
			}
		} System.out.println("잘못된 입력입니다.");
	}

	@Override
	public void modSub(Scanner scan) {
		// TODO Auto-generated method stub
		
		System.out.println("학생명을 입력하세요.");
		String name = scan.next();
		for(int i = 0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("수정할 정보를 입력하세요.");
				String op = scan.next();
				switch(op) {
				case "이름" :System.out.println("수정할 값을 입력하세요.");
							String modsub = scan.next();
							student.get(i).setName(modsub);
							System.out.println("--수정완료--");
							break;
				case "나이" : System.out.println("수정할 값을 입력하세요.");
							 int modage = scan.nextInt();
							 student.get(i).setAge(modage);
							 System.out.println("--수정완료--");
							 break;
				case "전화번호" :System.out.println("수정할 값을 입력하세요.");
					          String modphone = scan.next();
							  student.get(i).setPhone(modphone);
							  System.out.println("--수정완료--");
							  break;
				default : System.out.println("잘못된 입력입니다.");
				}
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
	}

	
	
	@Override
	public void delSub(Scanner scan) {
		System.out.println("학생명을 입력하세요.");
		String name = scan.next();
		System.out.println("과목을 입력하세요.");
		String sub = scan.next();
		
//		int i = index(name);
//		student.get(i).delSubject(sub);
//		if(i==-1) {
//			System.out.println("학생이 없습니다.");
//		}else {
//			student.get(i).delSubject(sub);
//		}
		
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).delSubject(sub);
				return;
			}
		}
		System.out.println("학생이 없습니다.");
	}
	
	public int index(String name) {
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				return i;
			}
		}
	return-1;
	}
	
}
