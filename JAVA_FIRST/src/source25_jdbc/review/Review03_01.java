package source25_jdbc.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class MyReview03_01 {

	Connection con = null; // DB와 연결을 위한 연결 객체 생성
	Statement stmt = null; // DB 처리 쿼리문을 담기위한 stmt 변수 생성 후 초기화
	Scanner scan = new Scanner(System.in);
	public MyReview03_01() throws SQLException {
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로딩 성공");
			
		// 2. 드라이버 매니저를 이용해서 DB 접속하고 Connection 객체 얻어오기
			// 오라클 디폴트 포트는 1521
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속 성공");
			
		// 3. SQL 명령어를  실행시키기 위한  객체 생성
			stmt = con.createStatement();
			
		// 4. 원하는 작업하기
			find();
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다.");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally { // 5. DB 접속 해제하기
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}

	public void find() throws SQLException {
		System.out.println("조회할 번호를 입력해 주시기 바랍니다.");
		int sn = scan.nextInt();
		String sql = "select * from student where num = " + sn;
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			System.out.println("\n =============" + sn + "번 학생의 데이터 ===");
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String addr = rs.getString("addr");
			System.out.println("번호" + num + ", 이름 = " + name + ", 주소 = " + addr );
		} else {
			System.out.print("검색된 데이터 없음");
		}
		rs.close();
	}
}

public class Review03_01 {
	public static void main(String[] args) throws SQLException {
		new MyReview03_01();
	}
}
