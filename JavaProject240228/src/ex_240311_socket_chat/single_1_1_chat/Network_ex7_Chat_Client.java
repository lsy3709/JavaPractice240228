package ex_240311_socket_chat.single_1_1_chat;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Network_ex7_Chat_Client extends Thread implements ActionListener {
// Thread 클래스를 상속받고 ActionListener 인터페이스를 구현하는 
// SimpleClient 클래스를 정의한다. 

	Frame frame;
	TextArea ta;
	TextField tf, tf2;
	Dialog dialog;
	Label label;

	Socket s1;
	DataOutputStream dos;
	DataInputStream dis;
	boolean stop;
	String host;

// 필요한 변수를 정의한다. 

	public Network_ex7_Chat_Client() {
		launchFrame();
	}
// 생성자 안에서 launchFrame() 메소드를 호출한다. 

	public void launchFrame() {
		frame = new Frame("일대일 채팅 실습");
		ta = new TextArea();
		tf = new TextField();
		frame.setBackground(Color.lightGray);
		ta.setEditable(false);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		frame.setSize(500, 300);
		frame.setVisible(true);
		tf.requestFocus();
		dialog = new Dialog(frame, " 서버 IP", true);
		label = new Label("접속할 서버 IP를 입력하세요");
		tf2 = new TextField(15);
		dialog.add(label, BorderLayout.NORTH);
		dialog.add(tf2, BorderLayout.CENTER);
		tf2.addActionListener(this);
		dialog.pack();
		dialog.show();
		service();
		tf2.requestFocus();
	}
// 변수에 대한 객체를 생성한다. 

	public void service() {
		try {
			s1 = new Socket(host, 5432);
// 서버의 IP 주소와 5432 포트 번호를 가진 
// Socket 클래스의 객체를 생성한다. 

			dis = new DataInputStream(s1.getInputStream());
			dos = new DataOutputStream(s1.getOutputStream());
// InputStream 클래스와  OutputStream 클래스를 객체 생성한다. 

			ta.append("접속완료.. \n");
			this.start();
//스레드를 start() 메소드로 호출한다. 

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Network_ex7_Chat_Client();
	}

	public void actionPerformed(ActionEvent action) {
// 텍스트 필드에 대한 이벤트 처리를 위해 actionPerformed() 
//메소드를 구현한다. 

		if (tf == action.getSource()) {
			try {
				String msg = tf.getText();
				ta.append(msg + "\n");
				if (msg.equals("exit")) {
					ta.append("bye");
					stop = true;
					dos.close();
					s1.close();
					System.exit(0);
				} else {
					dos.writeUTF("서버 : " + msg);
					tf.setText("  ");
				}
			} catch (IOException e) {
				ta.append(e.toString() + "\n");
			}
		} else {
			host = tf2.getText().trim();
			if (host.equals(""))
				host = "localhost";
			dialog.dispose();
		}
	}

	public void run() {
		System.out.println("Thread started...");
		try {
			while (!stop) {
// stop 변수가 true 될 때까지 서버에서 전송된 데이터를 입력받는다. 

				ta.append(dis.readUTF() + "\n");
			}
			dis.close();
			s1.close();
		} catch (EOFException e) {
			ta.append("서버로부터 연결이 끊어졌습니다. \n");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
