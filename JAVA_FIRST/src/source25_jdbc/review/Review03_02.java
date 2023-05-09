package source25_jdbc.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class MyReview03_02 {
	Connection con = null; // DB와 연결을 위한 연결 객체 생성
	Statement stmt = null; // DB 처리 쿼리문을 담기위한 stmt 변수 생성 후 초기화
	Scanner scan = new Scanner(System.in);
	public MyReview03_02() throws SQLException {
		
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
			update();
			
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

	public void update() throws SQLException {
		System.out.print("수정할 번호를 입력해 주시기 바랍니다. ==> ");
		int updateNumber = scan.nextInt();
		System.out.println(updateNumber + "번 학생 수정할 주소를 입력해 주시기 바랍니다. ==> ");
		String addr = scan.next();
		String sql = "update STUDENT set addr = '" + addr + "' where num = " + updateNumber;
		int updateCount = stmt.executeUpdate(sql);
		System.out.println(updateCount + "개의 데이터가 수정되었습니다.");
	}
}

public class Review03_02 {
	public static void main(String[] args) throws SQLException {
		new MyReview03_02();
	}
}
