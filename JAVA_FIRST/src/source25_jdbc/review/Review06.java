package source25_jdbc.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

class MyReview06{
	Connection con = null;  // DB와 연결을 위한 연결 객체 생성 및 초기화
	PreparedStatement pstmt1 = null;
	PreparedStatement pstmt2 = null;
	PreparedStatement pstmt3 = null;
	Scanner scan = new Scanner(System.in);
	
	public MyReview06() throws SQLException {
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로딩 성공!");
			
			// 2. 드라이버 매니저를 이용해서 DB 접속하고 Connection 객체 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속 성공!");
			
			String sql = "select * from student";
			pstmt1 = con.prepareStatement(sql);
			ResultSet rs = pstmt1.executeQuery();
			
			// 전체 데이터 출력
			System.out.println("번호\t이름\t전화번호\t주소");
			System.out.println("========================================");
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				
				System.out.println(num + "\t" + name + "\t" + phone + "\t" + addr);				
			}
			System.out.println("========================================");			
			// PreparedStatement 객체에 저장될 sql 구문은
			// 변수가 들어갈 위치에 ?를 넣습니다.
			String sql2 = "insert into STUDENT(num, name, phone, addr) values(?, ?, ?, ?)";
			pstmt2 = con.prepareStatement(sql2);
			pstmt2.setInt(1, 10);
			pstmt2.setString(2, "전지현");
			pstmt2.setString(3, "010-3333-5555");
			pstmt2.setString(4, "인천시");
			
			int result = pstmt2.executeUpdate();
			System.out.println("삽입된 레코드 행의 수는 " + result + "개 입니다!");
			System.out.println("========================================");
			
			String sql3 = "select * from student where num = ?";
			pstmt3 = con.prepareStatement(sql3);			
			pstmt3.setInt(1, 10);
			rs = pstmt3.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				System.out.println(num + "\t" + name + "\t" + phone + "\t" + addr);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다!");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally { // 5. DB 접속 해제하기
			try {
				if(pstmt1 != null) {
					pstmt1.close();
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

public class Review06 {
	public static void main(String[] args) throws SQLException {
			new MyReview06();
	}
}

/* 실행 결과
드라이브 로딩 성공!
DB 접속 성공!
번호	이름	전화번호	주소
========================================
11	닥슨투	010-2222-3333	강아지집
8	퐁키	010-1111-2222	퐁키집
21	김다미	010-2345-6789	송파구
1	홍길동	010-111-1234	서대문구
2	김다미	010-222-2222	이태원
3	장나라	010-333-3333	건대
4	이영자	010-8888-9999	잠실
========================================
삽입된 레코드 행의 수는 1개 입니다!
========================================
10	전지현	010-3333-5555	인천시
*/
