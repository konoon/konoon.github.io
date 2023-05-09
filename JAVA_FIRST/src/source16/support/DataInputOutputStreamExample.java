package source16.support;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 이름, 성적, 순위 순으로 파일에 출력하고
// 다시 이름, 성적, 순위 순으로 파일로부터 입력받는 자바 프로그램 제작
public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {

		// 바이트 기반 출력 스트림을 생성하고 DataOutputStream 보조 스트림 연결 처리함		
		FileOutputStream fos = new FileOutputStream("C:/Test/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 기본 타입 값 출력
		dos.writeUTF("장나라");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김희선");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		// 출력 스트림 닫기 처리함
		dos.flush();
		dos.close();
		
		// 바이트 기반 입력 스트림을 생성하고 DataInputStream 보조 스트림 연결 처리함.
		FileInputStream fis = new FileInputStream("C:/Test/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for (int i = 0; i < 2; i++) {
			// 기본 타입 값 읽기
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close(); // 입력 스트림 닫기
	}
}



