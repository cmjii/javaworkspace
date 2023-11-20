package new02;

import java.net.URL;

public class Network02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=104");
		
		System.out.println(url.getContent());
		System.out.println(url.getAuthority()); //인증이 허락된 곳
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getQuery());
		System.out.println(url.getPath());
	}

}
