package ex_240314.jdbcTest;

import java.sql.SQLException;

public class Ex_02_jdbc_test_2_main {

	public static void main(String[] args) {
		try {
			// 분리된 조회 기능 호출 해보기.
			Ex_02_jdbc_test_2_dao.select();
			
			// 분리된 기능, 데이터 입력해보기. 
//			Ex_02_jdbc_test_2_dao.insert("lsy4", "1234", "이상용4");
			
			// 데이터 삭제 기능 구현
//			Ex_02_jdbc_test_2_dao.delete("lsy4");
			
			// 데이터 수정 기능 구현. 
			// 아이디 : lsy, pwd : 123456, name: 이상용이름변경 
			// public static void update(String id, String pwd, String name)
			Ex_02_jdbc_test_2_dao.update("lsy","123456", "이상용이름변경");
			Ex_02_jdbc_test_2_dao.select();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
