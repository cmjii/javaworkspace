package day_05;

public class string01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String 클래스 : 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다"; //일반 자료형처럼 이용이 가능
		 * index 0부터 시작
		 * */
		
		String str = "Hello world~";
				System.out.println(str);
		
		
		//charAt(index) : index번지에 있는 한글자를 반환
		System.out.println("==charAt==");
		System.out.println(str.charAt(0)); //0번지부터 시작
		
		
		//length : 문자열의 전체 길이 공백포함
		System.out.println("==length==");
		System.out.println(str.length());
		
		
		//compareTo(str) : str문자열과 비교하여 같으면 0
		//사전순으로 앞이면 -1, 뒤면 1
		System.out.println("==compareTo==");
		System.out.println("b".compareTo("d"));
		
		
		//concat(str) : 이어붙이기 (+연산자와 같은 의미)
		System.out.println("==cancat==");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		
		//equals(str) : 두 문자열이 같은지 확인 (대소문자 구분)
		//== 주소가 같은지 확인 / equals는 내용이 같은지 확인
		System.out.println("==equals==");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("bcd"));
		
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능
		//찾는 문자가 없으면 -1 리턴
		System.out.println("==indexOf==");
		System.out.println("abs".indexOf("a"));
		String email = "alswl0244@naver.com";
		System.out.println(email.indexOf("."));//첫번째 위치부터 알려줌
		System.out.println(email.lastIndexOf("l"));//똑같은 값일 때 마지막인 경우 찾는 법 (중간은 찾을 법 없음 for문을 이용해서 수동으로 구해야 함)
		
		
		//substring : 문자열 추출
		System.out.println("==substring==");
		System.out.println(email.substring(0,5)); // 시작번지는 포함, 끝번지는 포함 X 0,5 일경우 주소0~4번지까지 나옴
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@"))); //끝번지를 안적으면 끝번지까지 자동적으로 나옴.
		System.out.println(email.substring(email.indexOf("@")+1));
		
		
		//trim : 불필요한 공백 제거
		System.out.println("==trim==");
		System.out.println("        HELLO      ".trim());
		
		//replace : 글자 치환
		System.out.println("==replace==");
		System.out.println("Hello World".replace("World","java"));
		
		
		//split :특정 값을 기준으로 나누기
		System.out.println("==split==");
		String str1 = "dog,cat,tiger";
		String[] str2 = str1.split(",");
		for(String s : str2) {
			System.out.println(s);
		}
		
		
		//parseInt : 문자를 숫자로 변환
		System.out.println("===parseInt===");
		String num1 ="1";
		String num2 ="2";
		System.out.println(num1+num2);
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		
		//contains(str) : 해당글자를 포함하고 있는지를 체크 boolean
		System.out.println("===contains===");
		String filename = "이것이자바다.txt";
		System.out.println(filename.contains("자바"));
		
		
	}

}
