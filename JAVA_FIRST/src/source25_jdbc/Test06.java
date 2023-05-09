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
	
class MyStudentDB06{
	Connection con = null;
	PreparedStatement pstmt1 = null;
	PreparedStatement pstmt2 = null;
	PreparedStatement pstmt3 = null;
	Scanner scan = new Scanner(System.in);
	
	public MyStudentDB06() throws SQLException {
		
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
			String sql = "select * from student";
			pstmt1 = con.prepareStatement(sql);
			ResultSet rs = pstmt1.executeQuery();
			
			// 전체 데이터 출력
			System.out.println("번호\t이름\t전화번호\t주소");
			System.out.println("=================================");
			while (rs.next()) {
				 int number = rs.getInt("num");
				 String name = rs.getString("name");
				 String phone = rs.getString("phone");
				 String addr = rs.getString("addr");
				 
				 System.out.println(number + "\t" + name + "\t" + phone + "\t" + addr);
			}

			System.out.println("========================");
			String sql2 = "INSERT INTO student(num, name, phone, addr) values(?, ?, ?, ?)";
			pstmt2 = con.prepareStatement(sql2);
			pstmt2.setInt(1, 1);
			pstmt2.setString(2, "남주혁");
			pstmt2.setString(3, "010-1111-2222");
			pstmt2.setString(4, "광주");
			
			int result = pstmt2.executeUpdate();
			System.out.println("삽입된 레코드 행의 수는 " + result + "개 입니다.");
			
			System.out.println("=====================");
			
			String sql3 = "SELECT * from student WHERE NUM = ?";
			pstmt3 = con.prepareStatement(sql3);
			pstmt3.setInt(1, 3);
			
			rs = pstmt3.executeQuery();
			while (rs.next()) {
				 int number = rs.getInt("num");
				 String name = rs.getString("name");
				 String phone = rs.getString("phone");
				 String addr = rs.getString("addr");
				 
				 System.out.println(number + "\t" + name + "\t" + phone + "\t" + addr);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다.");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(pstmt1 != null) {
					pstmt1.close();
				} if(con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	
}
public class Test06 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB06();
	}
}
