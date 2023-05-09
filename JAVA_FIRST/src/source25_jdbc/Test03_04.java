package source25_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

	
class MyStudentDB6{
	Connection con = null;
	Statement stmt = null;
	Scanner scan = new Scanner(System.in);
	
	public MyStudentDB6() throws SQLException {
		
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
			
//			find();
//			update();
//			insert();
			delete();
			
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

	public void delete() throws SQLException {
		System.out.println("삭제할 번호를 입력해 주시기 바랍니다. ==> ");
		int delNumber = scan.nextInt();
		String sql = "DELETE from student WHERE NUM = '" + delNumber + "'";
		int deleteCount = stmt.executeUpdate(sql);
		System.out.println(deleteCount + "개의 데이터가 삭제 되었습니다.");
	}

	public void insert() throws SQLException {
		System.out.print("삽입할 번호를 입력해 주시기 바랍니다. ==> ");
		int n = scan.nextInt();
		System.out.print("삽입할 이름을 입력해 주시기 바랍니다. ==>");
		String name = scan.next();
		System.out.print("삽입할 연락처 정보를 입력해 주시기 바랍니다. ==> ");
		String phone = scan.next();
		System.out.print("삽입할 주소를 입력해 주시기 바랍니다. ==> ");
		String addr = scan.next();
		String sql = "INSERT INTO student VALUES(" + n + ", '" + name + "', '" + phone + "', '" + addr + "')";
		int insertCount = stmt.executeUpdate(sql);
		System.out.println(insertCount + "개의 데이터가 수정되었습니다.");
		
	}

	public void update() throws SQLException {
		System.out.print("수정할 번호를 입력해 주시기 바랍니다. ==> ");
		int sn = scan.nextInt();
		System.out.print(sn + "번 학생의 수정할 주소를 입력해 주세요. ==> ");
		String addr = scan.next();
		String sql = "UPDATE student SET ADDR = '" + addr + "'WHERE NUM = " + sn;
		// SQL> UPDATE student SET ADDR = '서초구' WHERE NUM = 5;
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
public class Test03_04 {
	public static void main(String[] args) throws SQLException {
		new MyStudentDB6();
	}
}
