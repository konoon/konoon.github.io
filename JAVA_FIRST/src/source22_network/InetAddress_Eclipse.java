package source22_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddress_Eclipse {

	public static void main(String[] args) {
		InetAddress addr1 = null, addr2 = null;
		System.out.println("호스트 이름을 입력해 주시기 바랍니다.");
		Scanner in = new Scanner(System.in);
		String url = in.nextLine();
		
		try {
			addr1 = InetAddress.getByName(url);
			addr2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			
		}
		System.out.println(url + "의 IP 주소 = ");
		System.out.println(addr1.getHostAddress());
		System.out.println("로컬 IP 주소 = ");
		System.out.println(addr2.getHostAddress());
		
		in.close();
	}

}
