package source25_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// PreparedStatement 인터페이스
// 1. Statement 인터페이스의 자식 인터페이스임(Statement 인터페이스의 기능 향상)
// 2. SQL문을 미리 만들어 두고 사용 할수 있기 때문에
// 3. 매개변수의 인자와 관련된 작업이 특화됨  
// 4. 코드 안정성이 높으며, 가독성도 좋음
// 5. 코드량이 증가 할 수있음. 매개변수를 set처리 해줘야 하기 때문임 
	
class MyStudentDB05{
	Connection con = null;
	PreparedStatement pstmt = null;
	
	public MyStudentDB05() throws SQLException {
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("성공");
			//2. 드라이버 매니저를 이용해서 db 접속하고 Connection 객체 얻어오기
			// url = ""
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속성공");
			
			// PreparedStatement 객체에 저장될 sql 구문은 변수가 들어갈 위치에 ?를 넣습니다.
			String sql = "DELETE from student WHERE NUM = ?";
			
			// 3. sql 명령어를 실행시키기위한 객체 생성
			pstmt = con.prepareStatement(sql);
			// 4. 원하는 작업하기
			// student 테이블에서 NUM 칼럼의 조건(WHERE)이 5번인 데이터 삭제 처리
			// 1은 ?를 의미하고  5는 그 자리에 5를 넣는다는것
			pstmt.setInt(1, 5);
			int delCount = pstmt.executeUpdate();
			System.out.println(delCount + "개의 데이터가 삭제되었습니다.");

		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다.");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				} if(con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	
}
public class Test05 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB05();
	}
}
