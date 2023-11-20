package new01;

public class New01 {

	public static void main(String[] args) {
		/* 홍길동 주밀번호는 881122-1234567
		 * 출력형태 -> 생년월일 : 881122, 성별 남(1,2) 여(2,4)
		 * */
		String pin = "881122-1234567";
		String num = pin.substring(0,6);
		
		if(pin.charAt(7)=='1'||pin.charAt(7)=='2') {
			System.out.println("생년월일 : "+ num +", " + "성별 : " + "남자");
		}else if(pin.charAt(7)=='3'||pin.charAt(7)=='4') {
			System.out.println("생년월일 : "+ num + "성별" + "여자");
		}		
		//강사님
		String birth= pin.substring(0,pin.indexOf("-"));
		String ch = pin.substring(pin.indexOf("-")+1,8);
		if(ch.equals("1")||ch.equals("2")){
			System.out.println("성별 : 남");
		}else {
			System.out.println("성별 : 여");
		}
		
		
		
	}

}
