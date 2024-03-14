package ex_240314.jdbcTest;

public class Ex_01_jdbc_test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 준비물 
		// 1) 본인 자리에 오라클 디비 서버 가 설치 유무
		// 2) sql developer 설치 되었는지
		// 3) 연결할 아이디 확인. id : system , pw : oracle
		
		// jdbc 드라이버 , 프로젝트에 적용하는 방법. 
		// 4) ojdbc8_g.jar , 파일을 본인 이클립스 패키지에 복사하고
		// 5) 자바 프로젝트 우클릭 -> build path -> 마지막 메뉴 선택 
		// 6) 3번째 탭 라이브러리즈에서, 2번째 classpath에 -> add jar 선택 하고
		// 7) 해당 자바 프로젝트 -> 패키지-> ojdbc8_g.jar 선택하기. 
		
		//준비물 샘플 디비 
		// sql developer 에서 진행하기. 
//		CREATE TABLE TEST_JAVA(
//			    id varchar2(20) NOT NULL, --아이디 // 없는게 정상, primary key  에 포함. 
//			    pwd varchar2(30) NOT NULL, --비밀번호
//			    name varchar2(30) NOT NULL, -- 이름
//			    CONSTRAINT pk_member_java PRIMARY KEY(id)  -- 기본키 지정
//			);
//			select * from TEST_JAVA;
		
		//더미 디비 
//		insert into TEST_JAVA values ('lsy','1234','이상용');
//		insert into TEST_JAVA values ('lsy2','1234','이상용2');
//		insert into TEST_JAVA values ('lsy3','1234','이상용3');
		// commit 해주기.

	}

}
