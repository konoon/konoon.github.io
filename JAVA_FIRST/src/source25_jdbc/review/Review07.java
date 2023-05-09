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

class MyReview07{
	Connection con = null;  // DB와 연결을 위한 연결 객체 생성 및 초기화
	Statement stmt = null; // DB 처리 쿼리문을 담기위한 stmt 변수 생성 후 초기화
	ResultSet rs = null; // 결과 집합 조회를 위한 rs 변수 생성
	ResultSetMetaData rsmd = null;
	
	public MyReview07() throws SQLException {
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로딩 성공!");
			
			// 2. 드라이버 매니저를 이용해서 DB 접속하고 Connection 객체 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속 성공!");
			
			stmt = con.createStatement();
			String sql = "select * from student";
			
			rs = stmt.executeQuery(sql);
			// 메타 데이터란 저장된 데이터 자체가 아니라 해당 데이터에 대한 정보를 갖는 데이터를 의미함 예를들면 데이터 베이스 소유 정보,  데이터의 크기에 관련된 정보 등을 말함. ResultSet 객체로 getMetaData()메서드를 호출하여 ResultSetMetaData() 객체 생성
			
			rsmd = rs.getMetaData();
			// 칼럼 갯수 얻어오기
			int count = rsmd.getColumnCount();
			for (int i = 1; i < count+1; i++) {
				// 칼럼명 얻어오기
				String colName = rsmd.getColumnClassName(i);
				System.out.println(colName + "\t");
			}
			System.out.println("");
			for (int i = 1; i < count+1; i++) {
				// 칼럼의 데이터타입 얻어오기
				String typeName = rsmd.getColumnTypeName(i);
				System.out.println(typeName + "\t");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다!");
			System.out.println(e.getMessage());
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

public class Review07 {
	public static void main(String[] args) throws SQLException {
			new MyReview07();
	}
}
