package source25_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

	
class MyStudentDB3{
	Connection con = null;
	Statement stmt = null;
	Scanner scan = new Scanner(System.in);
	
	public MyStudentDB3() throws SQLException {
		
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
			
			find();
			
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

	public void find() throws SQLException {
		System.out.print("조회할 번호를 입력해 주시기 바랍니다. ==> ");
		int sn = scan.nextInt();
		String sql = "select * from student where num = " + sn;
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			System.out.println("\n =============" + sn + "번 학생의 데이터 ===");
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String addr = rs.getString("addr");
			String phone = rs.getString("phone");
			System.out.println("번호" + num + ", 이름 = " + phone + ", 이름 = " + name + ", 주소 = " + addr );
		} else {
			System.out.print("검색된 데이터 ㄴㄴ");
		}
	}
	
}
public class Test03_01 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB3();
	}
}
