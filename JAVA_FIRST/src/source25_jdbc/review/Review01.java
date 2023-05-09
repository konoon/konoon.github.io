package source25_jdbc.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class MyReview01 {
	public MyReview01() throws SQLException {
		Connection con = null; // DB와 연결을 위한 연결 객체 생성
		Statement stmt = null; // DB 처리 쿼리문을 담기위한 stmt 변수 생성 후 초기화
		
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
//			String aa = "INSERT INTO student VALUES(11, '김희태', '010-55441-4444', '독도')";
//			int insertCount = stmt.executeUpdate(aa);
//			System.out.println(insertCount + "개의 베이터가 추가 되었습니다.");
			
//			String upDate = "UPDATE student SET NAME = '김희선', PHONE = '010-1541-5465' WHERE NUM = '10'";
//			int upCount = stmt.executeUpdate(upDate);
			
			String del = "DELETE from student WHERE NUM = '7'";
			int delCount = stmt.executeUpdate(del);
			
			System.out.println("SQL 명령어가 성공적으로 실행 되었습니다.");
			
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
}

public class Review01 {
	public static void main(String[] args) throws SQLException {
		new MyReview01();
	}
}
