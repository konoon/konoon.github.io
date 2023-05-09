package source25_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class MyStudentDB2 {

	public MyStudentDB2() throws SQLException {
//		Connection con = null;
//		Statement stmt = null;

		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");

			// 2. 드라이버 매니저를 이용해서 db 접속하고 Connection 객체 얻어오기
			// url = "jdbc:oracle:thin:@서버주소:port번호:SID(전역데이터베이스이름)";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";

			// getConnection("DB 서버 주소 url", "사용자 계정", "비밀번호");
			Connection con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속 성공!");

			// 3. SQL 명령어를 실행시키기 위한 객체 생성
			Statement stmt = con.createStatement();

			// 4. 원하는 작업하기
			String sql = "select num, name, phone, addr from student";

			ResultSet rs = stmt.executeQuery(sql);

			// rs.next(); // 다음 행으로 이동, 다음 행이 없으면 false 리턴 처리함!
			while (rs.next()) {
				// 현재 행의 num 칼럼값 얻어오기
				int num = rs.getInt("num");
				// 현재 행의 name 칼럼값 얻어오기
				String name = rs.getString("name");
				// 현재 행의 phone 칼럼값 얻어오기
				String phone = rs.getString("phone");
				// 현재 행의 addr 칼럼값 얻어오기
				String addr = rs.getString("addr");

				System.out.println("번호 = " + num + " 이름 = " + name + " 전화번호 = " + phone + " 주소 = " + addr);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다!");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Test02 {
	public static void main(String[] args) throws SQLException {

		new MyStudentDB2();

	}
}
//드라이버 로딩 성공!
//DB 접속 성공!
//번호 = 1 이름 = 홍길동 전화번호 = 010-111-1234 주소 = 영등포
//번호 = 2 이름 = 김다미 전화번호 = 010-222-2222 주소 = 이태원
//번호 = 3 이름 = 장나라 전화번호 = 010-333-3333 주소 = 건대
//번호 = 4 이름 = 임꺽정 전화번호 = 010-444-4444 주소 = 잠실
//번호 = 5 이름 = 이순신 전화번호 = 010-555-5555 주소 = 역삼동
//번호 = 6 이름 = 김국진 전화번호 = 010-666-6666 주소 = 서초동