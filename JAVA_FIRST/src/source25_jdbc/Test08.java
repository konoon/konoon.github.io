package source25_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

	
class MyStudentDB08{
	Connection con = null; // DB와 연결을 위한 연결 객체 생성 및 초기화
	Statement stmt = null; // DB 처리 쿼리문을 담기 위한 stmt 변수 생성 및 초기화
	
	public MyStudentDB08() throws SQLException {
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("성공");
			//2. 드라이버 매니저를 이용해서 db 접속하고 Connection 객체 얻어오기
			// url = ""
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속성공");
			
			// 연결에 자동 커밋 모드를 사용하려면 true, 사용하지 않으려면 false
			con.setAutoCommit(false);
			stmt = con.createStatement();
			
			String sql1 = "INSERT INTO student VALUES(201,'이하늬','010-8550-7512','영등포')";
			String sql2 = "INSERT INTO student VALUES(202,'이순신','010-7541-2451','문래')";
			String sql3 = "INSERT INTO student VALUES(203,'김유신','010-9761-7161','신도림')";
			
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
			stmt.executeUpdate(sql3);
			
			con.commit();
			System.out.println("데이터 추가를 성공했습니다.");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스못찾음");
			System.out.println(e.getMessage());
			if(con != null)
			try {
				con.rollback();
				System.out.println("데이터 처리에 문제가 있어서 롤백함");
			} catch (Exception e2) {
				e2.getMessage();
			}
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
public class Test08 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB08();
	}
}
