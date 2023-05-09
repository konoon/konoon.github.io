package source25_jdbc.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class MyReview04 {
	Connection con = null; // DB와 연결을 위한 연결 객체 생성
	Statement stmt = null; // DB 처리 쿼리문을 담기위한 stmt 변수 생성 후 초기화
	Scanner scan = new Scanner(System.in);
	
	public MyReview04() throws SQLException {
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
//			update();
//			insert();
			delete();
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다.");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
	}

	public void dbClose() {
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
	
	public void delete() throws SQLException {
		System.out.print("삭제할 번호를 입력해 주시기 바랍니다. ==> ");
		int delNum = scan.nextInt();
		String sql = "delete from STUDENT where num =" + delNum;
		int delCount = stmt.executeUpdate(sql);
		System.out.println(delCount + "개의 데이터가 수정되었습니다.");
	}

	public void insert() throws SQLException {
		System.out.print("삽입할 번호를 입력해 주시기 바랍니다. ==> ");
		int n = scan.nextInt();
		System.out.print("삽입할 이름을 입력해 주시기 바랍니다 . ==> ");
		String name = scan.next();
		System.out.print("삽입할 연락처를 입력해 주시기 바랍니다 . ==> ");
		String phone = scan.next();
		System.out.print("삽입할 주소를 입력해 주시기 바랍니다 . ==> ");
		String addr = scan.next();
		String sql = "insert into STUDENT values( " + n + ", '" + name + "', '" + phone + "', '" + addr + "')";
		int updateCount = stmt.executeUpdate(sql);
		System.out.println(updateCount + "개의 데이터가 수정되었습니다.");
		
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

public class Review04 {
	public static void main(String[] args) throws SQLException {
//		new MyReview04();
		MyReview04 db04 = new MyReview04();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("======== [자바 CRUD 프로그램 시작] =====");
			System.out.println("===== 1. 추가, 2. 삭제, 3. 검색, 4. 수정, 5. 종료");
			
			int num = scan.nextInt();
			switch (num) {
			case 1:
				db04.insert();
				break;
			case 2:
				db04.delete();
				break;
			case 3:
				db04.find();
				break;
			case 4:
				db04.update();
				break;
			case 5:
				System.out.println("서비스를 이용해주셔서 감사합니다.");
				db04.dbClose();
				System.exit(0);
				scan.close();
				break;
			}
		}
	}
}
