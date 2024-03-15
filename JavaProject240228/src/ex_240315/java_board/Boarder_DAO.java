package ex_240315.java_board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

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

/**DB연결 메소드*/
public Connection getConn(){
    Connection con = null;
   
    try {
        Class.forName(DRIVER); //1. 드라이버 로딩
        con = DriverManager.getConnection(URL,USER,PASS); //2. 드라이버 연결
       
    } catch (Exception e) {
        e.printStackTrace();
    }
   
    return con;
}

/**게시판 전체 리스트 출력*/
// 반환 : 이중 리스트를 반환한다. 리스트안에, 각각의 게시글들이 있다. 
public Vector getBoarderList(){
   
    Vector data = new Vector();  
    //Jtable에 값을 쉽게 넣는 방법 1. 2차원배열   2. Vector 에 vector추가
   
       
    Connection con = null;       //연결
    PreparedStatement ps = null; //명령
    ResultSet rs = null;         //결과
   
    try{
       
        con = getConn();
        // 날짜를 기준으로 큰값에서, 작은 값으로 내려가는 내림차순이니,-> 최신순이 먼저옴.
        // 날짜가 큰값이 최신 날짜임. 
        String sql = "select * from BOARDER_JAVA order by regDate dsc";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
       
        while(rs.next()){
            String id = rs.getString("id");
            String writer = rs.getString("writer");
            String subject = rs.getString("subject");
            String content = rs.getString("content");
            String regDate = rs.getString("regDate");
            String viewsCount = rs.getString("viewsCount");
           
            Vector row = new Vector();
            row.add(id);
            row.add(writer);
            row.add(subject);
            row.add(content);
            row.add(regDate);
            row.add(viewsCount);
           
            data.add(row);       
            // 결론은 Vector -> 리스트, 리스트 안에 리스트, 이중 리스트 구조. 
            // 연습, 국,영,수 배열 안에 배열. 
        }//while
    }catch(Exception e){
        e.printStackTrace();
    }
    return data;
}//getMemberList()

/**DB데이터 다시 불러오기*/   
public void boarderSelectAll(DefaultTableModel model) {
   
   
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
   
    try {
        con = getConn();
        String sql = "select * from BOARDER_JAVA order by regDate dsc";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
       
        // DefaultTableModel에 있는 데이터 지우기
        for (int i = 0; i < model.getRowCount();) {
            model.removeRow(0);
        }

        while (rs.next()) {
        	// 각 행마다, 컬럼들이 6개씩 있음. 
            Object data[] = { rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getString(4),
                   rs.getString(5),
                    rs.getInt(6),
                   };

            // 테이블에 각행을 각각 추가함. 
            model.addRow(data);                
        }

    } catch (SQLException e) {
        System.out.println(e + "=> boarderSelectAll fail");
    } finally{
       
        if(rs!=null)
            try {
                rs.close();
            } catch (SQLException e2) {
                // TODO Auto-generated catch block
                e2.printStackTrace();
            }
        if(ps!=null)
            try {
                ps.close();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        if(con!=null)
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}



}
