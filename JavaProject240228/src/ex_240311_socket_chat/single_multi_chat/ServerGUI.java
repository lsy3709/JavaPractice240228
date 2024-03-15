package ex_240311_socket_chat.single_multi_chat;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGUI extends JFrame implements ActionListener {
	// 서버, 클라이언트, 기본적인, 텍스트 입력창, 채팅 보여주는 목록창. 
	// 이벤트 핸들러가 추가되어 있다. 

	// 직렬화 객체 -> 중간 데이터 타입으로 변경. 
	// 시리얼라이즈드, 객체를 -> 중간 데이터 변환 전달하고, -> 객체로 역직렬화를 함. 
	// 직렬화를 할 때, 변경 사항에 대해서 체크를 하는 아이디가 있는데, 
	// serialVersionUID 를 사용함. 
	// 이serialVersionUID 가 변경이 되므로 해서, 변경 유무를 확인 할수가 있다. 
	// 이런 기법 ? , 예) 모바일에서, 해당 앱 버전의 1.0.0, 업데이트 할 때. 
	// 버전의 숫자를 변경해서, 프로그램에 저장, 
	// 예) 커밋 번호와 비슷하다. 버전 관리를 하는 식별 번호다. 
	private static final long serialVersionUID = 1L;
	
	// HTML input 타입에서, 텍스트 필드 (여러 입력이 가능한, 멀티 라인)
	// 채팅 대화 화면
	private JTextArea jta = new JTextArea(40, 25);
	// 채팅의 입력 화면 
	private JTextField jtf = new JTextField(25);
	// 백그라운드에서, 실행에 필요한 인스턴스 도구. 
	// 서버에서 실행을 하면, 내부에 server라는 인스턴스가 있으니, 
	// 우리는 서버의 기능을 이용이 가능함. 
	private ServerBackground server = new ServerBackground();

	public ServerGUI() throws IOException {
		//현재 , 보더 레이아웃, 배치관리자, 요소를 정렬를 어떻게 할거니, 
		// 동 서 남 북 가운데, 정렬이 가능한 배치 관리자. 
		// 플로우 레이아웃으로 변경해서, 확인 해보기. -> flex 랑 비슷하다. 
		// 요소의 위치를 , 순서대로 나열을 한다. 
		// 배치 관리자를 특정 지정을 안하면, 기본은 보더 레이아웃.
		// 프레임라는 창에 , 요소를 붙이는 도구. 
		Container container = getContentPane();
		// 배치관리자를 선정.
		// 요소의 위치를 지정. 
		
		// new FlowLayout()
//		container.setLayout(new FlowLayout());
//		container.add(jta);
//		container.add(jtf);
//		container.add(new JScrollPane(jta));
		
		// 보더 레이아웃 
		container.setLayout(new FlowLayout());
		container.add(jta,BorderLayout.CENTER);
		container.add(jtf,BorderLayout.SOUTH);
		container.add(new JScrollPane(jta),BorderLayout.CENTER);

		jtf.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(200, 100, 400, 600);
		setTitle("서버부분");
		server.setGui(this);
		server.setting(); // GUI가 실행될때 서버도 같이 동작하도록..
	}

	public static void main(String[] args) throws IOException {
		new ServerGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = "서버 : " + jtf.getText() + "\n";
		System.out.print(msg);
		server.sendMessage(msg);
		appendMsg(msg);
		jtf.setText("");
	}

	public void appendMsg(String msg) {
		jta.append(msg);
	}
}
