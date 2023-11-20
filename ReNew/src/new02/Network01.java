package new02;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network01 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = null;
		ip = InetAddress.getByName("www.naver.com");
		System.out.println("naver ip");
		System.out.println("HostAddress > "+ ip.getHostAddress());
		System.out.println("HostName > " + ip.getHostName());
		System.out.println(ip.toString()); //toString 으로 찍어야 내용이 나옴 ip만 찍으면 객체 주소가 나옴
		
		
	}

}
