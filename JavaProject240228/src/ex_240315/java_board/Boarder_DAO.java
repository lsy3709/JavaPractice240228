package ex_240315.java_board;

public class Boarder_DAO {
	// 데이터베이스 기본 연결하는 구조 그대로 가지고 오기
	// 게시판의 게시글의 정보를 전체 조회 하는 기능 하나 구현. 
	// 처음에는 콘솔에 출력. 
	// 화면에도 출력. 
	
	private static final String DRIVER
    = "oracle.jdbc.driver.OracleDriver";
private static final String URL
    = "jdbc:oracle:thin:@localhost:1521:XE";

private static final String USER = "system"; //DB ID
private static final String PASS = "oracle"; //DB 패스워드

// 게시글의 정보들을 출력하는 리스트 
Boarder_List boarder_List;

public Boarder_DAO() {
	
};
public Boarder_DAO(Boarder_List boarder_List) {
	this.boarder_List = boarder_List;
    System.out.println("DAO=>"+boarder_List);
}



}
