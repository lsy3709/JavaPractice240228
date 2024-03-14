package ex_240314.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_02_jdbc_test_2_dao {
	
	// DAO 패턴(Data Access Object) : DB에 접근해서 사용할 기능들의 모음집. 
	// select, insert, update , delete 기능을 하나의 클래스에 모아두기. 
	
	// JDBC 연결을 위한 인스턴스 준비
	// 드라이버, 유저명, 패스워드
	// 반복이 되는 설정 코드, 그래서, 처음만 한번 타이핑 연습하고,나중에 복붙하기.
	// 4가지는 반복 고정, 그래서, 나중에,
	// 만약, 디비를 Mysql 를 사용한다면, 각제조사가 변경시 마다 바꾸면, 그게 아니면 계속 고정.
	// , 고정
	private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private final static String USER_ID = "system";
	private final static String USER_PW = "oracle";

	static // 연결하기위한 인스턴스 , 고정
	Connection con = null;
	// 쿼리를 전달 하기 위한 인스턴스 , 고정
	static PreparedStatement pstmt = null;
	// 만약 , 조회를 한다면, 조회한 결과를 담을 테이블 같은 인스턴스, : 조회시 만 필요.
	// insert, update, delete 시에는 안씀. , 고정
	static ResultSet rs = null;

	// 조회하는 기능
	public static void select() throws ClassNotFoundException, SQLException {
		// select 조회 하기위한 순서

		try {
			// 순서1, 고정
			// 드라이버 , 메모리에 올려야함. 로드
			// 해당 패키지 읽기 위해서는 반드시 강제로, try catch 하라고 함.
			Class.forName(DRIVER);
//					System.out.println("Class.forName(DRIVER) 실행 후");

			// 순서2 , 고정
			// 연결하기위 한 Connection 타입의 con 을 초기화하기.
			con = DriverManager.getConnection(URL, USER_ID, USER_PW);
//					System.out.println("DriverManager.getConnection(URL, USER_ID, USER_PW) 실행 후");

			// 순서3 , 값 변경, select, insert, update, delete
			// 지금 조회 연습 중이니, 조회하는 sql 전달 명령어 준비하기.
			String query = "SELECT id,pwd,name FROM test_java";

			// 순서4 , 해당 쿼리를 전달하는 PreparedStatement(pstmt) 초기화하기.
			pstmt = con.prepareStatement(query);
//					System.out.println("con.prepareStatement(query) 실행 후");

			// 순서5, DB에서 조회가 된 결과를 테이블에 담아 둔다.
			// 테이블 역할을 하는 ResultSet (rs)초기화하기.
			// 메모리 상에 조회된 데이터가 있다.
			// 바로 볼수 없으니, 우리가 보기 편하게 재가공
			// 현재) 자바 1) 콘솔 2) 스윙UI 3) HTML(웹)
			rs = pstmt.executeQuery();

			// 순서6, 반복문으로 데이터를 조회해보기.
			// rs.next() -> 기준이 0행부터 시작해서, 다음 행인 1행이 있는지 확인함..
//					System.out.println("while (rs.next()) { 실행 전");
			while (rs.next()) {
				String user_id = rs.getString("id");
				String user_pwd = rs.getString("pwd");
				String user_name = rs.getString("name");
				System.out.println("ID: " + user_id + ", PWD: " + user_pwd + ", NAME: " + user_name);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 순서7, 자원반납, 사용의 역순 ,
			// 사용순서 1) con 2) pstmt 3) rs
			rs.close();
			pstmt.close();
			con.close();
		}
	}

	// insert 하는 기능, 매개변수 ( id, pwd, name ) 받아서 전달할 예정.
	public static void insert(String id, String pwd, String name) throws SQLException  {
		// 순서1 ~ 순서7 반복.
		// 순서1
		try {
			Class.forName(DRIVER);
			// 순서2
			con = DriverManager.getConnection(URL, USER_ID, USER_PW);
			// 순서3 , insert 이부분 조금 다름. -> 수정 할 예정.
			String query = "SELECT id,pwd,name FROM test_java";
			// 순서4
			pstmt = con.prepareStatement(query);
			// 순서5
			int resultNum = pstmt.executeUpdate();
			System.out.println("레코드가 " + resultNum + "개 저장되었습니다.");

			// 순서6, select 할 때 사용.
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// 순서7, 자원반납, 사용의 역순 ,
			// 사용순서 1) con 2) pstmt 3) rs
			rs.close();
			pstmt.close();
			con.close();
		}
	}

	// delete 하는 기능, 해당 id를 받아서 삭제할 예정.

	// update 는 id 제외하고, pwd , name 만 변경하기.

}
