package source25_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

	
class MyStudentDB1{
	public MyStudentDB1() throws SQLException {
		Connection con = null;
		Statement stmt = null;
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("성공");
			//2. 드라이버 매니저를 이용해서 db 접속하고 Connection 객체 얻어오기
			// url = ""
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속성공");
			
			stmt = con.createStatement();
			// 4. 원하는 작업하기
//			String aa = "INSERT into student values(7, '전지현', '010-1111-2222', '부산')";
			String aa = "INSERT into student values(8, '김태희', '010-1111-2222', '서울')";
			
			String del = "delete from student where num=8";
			int delCount = stmt.executeUpdate(del);
			
			System.out.println(delCount + "개의 데이터가 삭제 되었습니다.");
			
			int n = stmt.executeUpdate(aa);
			System.out.println(n + "개의 데이터가 추가 되었습니다.");
			System.out.println("SQL 명령어가 성공적으로 실행되었습니다.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("못찾음");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				} if(con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	
}
public class Test01 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB1();
	}
}
