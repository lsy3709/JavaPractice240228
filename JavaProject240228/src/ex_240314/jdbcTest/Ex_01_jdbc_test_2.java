package ex_240314.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex_01_jdbc_test_2 {
	// JDBC 연결을 위한 인스턴스 준비
	// 드라이버, 유저명, 패스워드 
	// 반복이 되는 설정 코드, 그래서, 처음만 한번 타이핑 연습하고,나중에 복붙하기.
	// 4가지는 반복 고정, 그래서, 나중에, 
	// 만약, 디비를  Mysql 를 사용한다면, 각제조사가 변경시 마다 바꾸면, 그게 아니면 계속 고정. 
	private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private final static String USER_ID = "system";
	private final static String USER_PW = "oracle";
	
	
	
	public static void main(String[] args) {
		// 연결하기위한 인스턴스 
		Connection con = null;
		// 쿼리를 전달 하기 위한 인스턴스 
		PreparedStatement pstmt = null;
		// 만약 , 조회를 한다면, 조회한 결과를 담을 테이블 같은 인스턴스, : 조회시 만 필요. 
		// insert, update, delete  시에는 안씀.
		ResultSet r = null;
		
		// select 조회 하기위한 순서
 
		try {
			// 순서1
			// 드라이버 , 메모리에 올려야함. 로드
			// 해당 패키지 읽기 위해서는 반드시 강제로, try catch 하라고 함.
			Class.forName(DRIVER);
		
			try {
				// 순서2 
				// 연결하기위 한 Connection 타입의 con 을 초기화하기. 
				con = DriverManager.getConnection(URL,USER_ID,USER_PW);
				
				// 순서3 
				// 지금 조회 연습 중이니, 조회하는 sql 전달 명령어 준비하기. 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
