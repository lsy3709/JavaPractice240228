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

	// 디폴트 생성자. 서버 클래스 인스턴스 생성시 반드시 실행이 되는 부분임. 
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
		container.setLayout(new BorderLayout());
		container.add(jta,BorderLayout.CENTER);
		container.add(jtf,BorderLayout.SOUTH);
		container.add(new JScrollPane(jta),BorderLayout.CENTER);
		
		// 이벤트 핸들러
		// 현재 클래스가 , ActionListener 인터페이스를 구현하고 있어서, 
		// 추상메스드를 이용해서 사용가능.
		// this -> 현재 클래스 의미. 
		// 구현 한 인터페이스에 정의된 메서드 명 : actionPerformed, 우리는 반드시 재정의해야 함. 
		jtf.addActionListener(this);
		// 부모창을 종료시 설정하는 기능. 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 부모창을 보여주기. 
		setVisible(true);
		// 부모창의 위치는 윈도우즈 창으로부터 x 200 만큼, y 100 만큼 이동하고, 
		// 창의 길이는 가로 400, 높이 600
		setBounds(200, 100, 400, 600);
		// 창의 제목 
		setTitle("서버부분");
		// server : 백그라운드의 인스턴스에서, 
		// 해당 인스턴스의 멤버중에, 현재 작업하는 클래스 이름 : ServerGUI
		// 멤버로 가지고 있고, setGui 세터를 통해서, 멤버를 업데이트함. 
		server.setGui(this);
		
		// ServerGUI -> 화면 부분 설명 후 , 다시 돌아와서 설명하기. 
		
		server.setting(); // GUI가 실행될때 서버도 같이 동작하도록..
	}

	public static void main(String[] args) throws IOException {
		// 해당 클래스를 실행하게 되면, 
		// 본인의 디폴트 생성자를 호출 하면서, 실행이됨. 
		// 화면도 그리면서, 백그라운드도 같이 동작을 합니다. 
		// 왜? 현재 클래스에는 본인의 화면을 그리는 업무 외, 서버의 인스턴스를 가지고 있어서, 
		// 해당 기능을 사용이 가능해서, 
		new ServerGUI();
	}

	// jtf 의 이벤트 핸들러가 동작시, 수행하는 메서드 부분. 
	@Override
	public void actionPerformed(ActionEvent e) {
		//  jtf.getText(), 입력창에 입력된 메세지 가져오기(게터)
		String msg = "서버 : " + jtf.getText() + "\n";
		// 본인 콘솔에 출력하고, 
		System.out.print(msg);
		// 상대방(클라이언트)들에게 메세지 전달하는 기능. 
		server.sendMessage(msg);
		// 현재 본인 창에(서버창) 내용을 붙이기. 
		appendMsg(msg);
		// 메세지 입력 후에는 , 입력란 비우기. 
		
		// 추후 계획, 이 대화의 내용을 데이터베이스 저장하면 어떻까?
		
		jtf.setText("");
	}

	public void appendMsg(String msg) {
		// 채팅창에 해당 메세지 붙이기. 
		jta.append(msg);
	}
}
