package ex_240315.java_board;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ex_240311_jdbc_member_with_swing_oracle.MemberDAO;
import ex_240311_jdbc_member_with_swing_oracle.MemberProc;
import ex_240311_jdbc_member_with_swing_oracle.Member_List;

public class Boarder_List extends JFrame implements MouseListener, ActionListener {
	// 동기화를 지원 해주는 컬렉션의 리스트
	Vector v;
	Vector cols;
	// 테이블 기능을 지원해주는 인스턴스
	DefaultTableModel model;
	// 표 형식
	JTable jTable;
	// 스크롤
	JScrollPane pane;
	// 패널은 창에 추가로 붙이는 공간.
	JPanel pbtn;
	// 버튼.
	JButton btnInsert;

	// 생성자
	Boarder_List() {
		// 부모 JFrame의 제목을 설정하는 생성자.
		super("생자바 게시판 만들기 연습");
		// v=getMemberList();
		// MemberDAO
		// 데이터베이스에 접근 및 crud 기능이 있음.
		Boarder_DAO dao = new Boarder_DAO();
		// 디비 내용을 조회한 결과를 받아두기.
		// 순서 있는 리스트
		v = dao.getBoarderList();
		//
		System.out.println("v=" + v);
		// 각 열의 정보를 의미.
		// cols , 벡터 타입의 리스트
		cols = getColumn();
		// Vector v; 데이터베이스에서 조회한 전체 게시글들
		// Vector cols; 헤더명
		model = new DefaultTableModel(v, cols);

		// 자바에서 지원해주는 표 형식.
		jTable = new JTable(model);
		// 스크롤 기능을 해당 패널에 추가.
		pane = new JScrollPane(jTable);
		// 프레임이라는 창에 , 요소 붙이기.
		add(pane);

		// 버튼을 붙이는 패널 , 캔버스
		pbtn = new JPanel();
		// 버튼
		btnInsert = new JButton("글쓰기");
		// 버튼을 붙이는 패널 , 버튼 붙이기.
		pbtn.add(btnInsert);
		add(pbtn, BorderLayout.NORTH);

		// 이벤트 핸들러 등록,
		// 인터페이스이고, -> 추상메서드를 가지고 있으니, 필수 재정의 해주기.
		// 결론, 액션의 역할, 새로운 입력창을 불러오기.
		jTable.addMouseListener(this); // 리스너 등록
		btnInsert.addActionListener(this); // 회원가입버튼 리스너 등록

		setSize(600, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// JTable의 컬럼, 헤더명
	public Vector getColumn() {
		Vector col = new Vector();
		col.add("아이디");
		col.add("작성자");
		col.add("제목");
		col.add("내용");
		col.add("등록일");
		col.add("조회수");
		return col;
	}// getColumn

	// Jtable 내용 갱신 메서드
	public void jTableRefresh() {

		Boarder_DAO dao = new Boarder_DAO();
		DefaultTableModel model = new DefaultTableModel(dao.getBoarderList(), getColumn());
		jTable.setModel(model);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Boarder_List();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 클릭하면
		if (e.getSource() == btnInsert) {
			new Boarder_Proc(this);


		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
