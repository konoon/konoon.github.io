package source25_jdbc.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

class MyReview08{
	Connection con = null;  // DB와 연결을 위한 연결 객체 생성 및 초기화
	Statement stmt = null; // DB 처리 쿼리문을 담기위한 stmt 변수 생성 후 초기화
	ResultSet rs = null; // 결과 집합 조회를 위한 rs 변수 생성
	ResultSetMetaData rsmd = null;
	
	public MyReview08() throws SQLException {
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로딩 성공!");
			
			// 2. 드라이버 매니저를 이용해서 DB 접속하고 Connection 객체 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속 성공!");
			
			// 연결에 자동 커밋 모드를 사용하려면 true(디폴트 적용되고 있음)
			// 연결에 자동 커밋 모드를 해제 하려면 false 처리
			con.setAutoCommit(false);
			stmt = con.createStatement();
			
			String sql1 = "insert into STUDENT values(112, '하늬', '010-7421-7811', '디')";
			String sql2 = "insert into STUDENT values(111, '이하늬', '010-7421-7811', '디')";
			String sql3 = "insert into STUDENT values(131, '늬', '010-7421-7811', '서울')";
			
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
			stmt.executeUpdate(sql3);
			
			con.commit();
			System.out.println("데이터 추가를 성공했습니다");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다!");
			System.out.println(e.getMessage());
			if (con != null) {
				try {
					con.rollback();
					System.out.println("데이터 처리에 문제가 있어서 롤백함");
				} catch (Exception e2) {
					e2.getMessage();
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally { // 5. DB 접속 해제하기
			try {
				if(stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}

public class Review08 {
	public static void main(String[] args) throws SQLException {
			new MyReview08();
	}
}
