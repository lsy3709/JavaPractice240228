package ex_240315.java_board;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ex_240311_jdbc_member_with_swing_oracle.MemberProc;
import ex_240311_jdbc_member_with_swing_oracle.Member_List;

public class Boarder_Proc extends JFrame implements ActionListener {
	// 글쓰기 창, 
	// 게시글의 상세보기 창. 
	
	JPanel p;
//	작성자(자동)-> 임시 수동입력, 제목, 내용
	   JTextField tfWriter, tfSubject ;
	   // 본문의 내용
	   JTextArea tfContent;
	   JButton btnInsert, btnCancel, btnUpdate,btnDelete; //글쓰기, 취소, 수정 , 삭제 버튼
	  
	   GridBagLayout gb;
	   GridBagConstraints gbc;
	   Boarder_List boarder_List ;
	   
	   public Boarder_Proc(){ //글쓰기용 생성자
		      
	       createUI(); // UI작성해주는 메소드
	       btnUpdate.setEnabled(false);
	       btnUpdate.setVisible(false);
	       btnDelete.setEnabled(false);
	       btnDelete.setVisible(false);
	      
	      
	   }//생성자  
	   public Boarder_Proc(Boarder_List boarder_List){ //가입용 생성자
		      
	       createUI(); // UI작성해주는 메소드
	       btnUpdate.setEnabled(false);
	       btnUpdate.setVisible(false);
	       btnDelete.setEnabled(false);
	       btnDelete.setVisible(false);
	       this.boarder_List = boarder_List;
	      
	   }//생성자
	   
	   private void createUI(){
	       this.setTitle("글쓰기 폼");
	       // 표 형태의 배치 관리자. 4 x 2, 행 x 열  
	       gb = new GridBagLayout();
	       // 정렬 형태를 지정.
	       setLayout(gb);
	       // 표 형태의 옵션, 가로 , 세로 크기, 또는 전체를 가득 채우기 등. 
	       gbc = new GridBagConstraints();
	       // 가로 , 세로 가득 채우기.
	       gbc.fill = GridBagConstraints.BOTH;
	       // 크기 
	       gbc.weightx = 1.0;
	       gbc.weighty = 1.0;
	      
	      
	       //작성자
	       JLabel bId = new JLabel("작성자 : ");
	       tfWriter = new JTextField(20);     
	       //그리드백에 붙이기
	       gbAdd(bId, 0, 0, 1, 1);
	       gbAdd(tfWriter, 1, 0, 3, 1);
	      
	       //제목
	       JLabel bPwd = new JLabel("제목 : ");
	       tfSubject = new JTextField(20);
	       gbAdd(bPwd, 0, 1, 1, 1);
	       gbAdd(tfSubject, 1, 1, 3, 1);
	      
	       //내용
	       JLabel bIntro = new JLabel("내용: ");
	       tfContent = new JTextArea(5, 20); //행 : 열
	       JScrollPane pane = new JScrollPane(tfContent);
	       gbAdd(bIntro,0,9,1,1);
	       
	       gbAdd(pane,1,9,3,1);
	       
	      
	       //버튼
	       JPanel pButton = new JPanel();
	       btnInsert = new JButton("글쓰기");
	       btnUpdate = new JButton("수정"); 
	       btnDelete = new JButton("삭제");
	       btnCancel = new JButton("취소");     
	       pButton.add(btnInsert);
	       pButton.add(btnUpdate);
	       pButton.add(btnDelete);
	       pButton.add(btnCancel);    
	       gbAdd(pButton, 0, 10, 4, 1);
	      
	       //버튼에 감지기를 붙이자
	       btnInsert.addActionListener(this);
	       btnUpdate.addActionListener(this);
	       btnCancel.addActionListener(this);
	       btnDelete.addActionListener(this);
	      
	       setSize(350,500);
	       setVisible(true);
	       //setDefaultCloseOperation(EXIT_ON_CLOSE); //System.exit(0) //프로그램종료
	       setDefaultCloseOperation(DISPOSE_ON_CLOSE); //dispose(); //현재창만 닫는다.
	      
	      
	   }//createUI
	  
	   //그리드백레이아웃에 붙이는 메소드
	   private void gbAdd(JComponent c, int x, int y, int w, int h){
	       gbc.gridx = x;
	       gbc.gridy = y;
	       gbc.gridwidth = w;
	       gbc.gridheight = h;
	       gb.setConstraints(c, gbc);
	       gbc.insets = new Insets(2, 2, 2, 2);
	       add(c, gbc);
	   }//gbAdd
	   
	   public static void main(String[] args) {
		   new Boarder_Proc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	   
	   
}
