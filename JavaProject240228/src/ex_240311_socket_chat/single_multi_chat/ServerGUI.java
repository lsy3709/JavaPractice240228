package ex_240311_socket_chat.single_multi_chat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextArea jta = new JTextArea(40, 25);
	private JTextField jtf = new JTextField(25);
	private ServerBackground server = new ServerBackground();
	
	// JTextArea 스크롤 패널 붙이기 
//	JTextArea txtLog = new JTextArea();
	JScrollPane scrollPane = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//	contentPane.add(scrollPane);
//	출처: https://unikys.tistory.com/211 [All-round programmer:티스토리]

	public ServerGUI() throws IOException {

		add(jta, BorderLayout.CENTER);
		scrollPane.setVisible(true);
		
		
		add(scrollPane, BorderLayout.EAST);
		add(jtf, BorderLayout.SOUTH);
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
