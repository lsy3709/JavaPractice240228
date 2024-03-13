package ex_240313;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 화면 UI 담당 클래스
// 막대만 그리는 클래스.
// 실제 전체 창 등은, 메인에서 그리기. 
class MyLabel extends JLabel {
	// JFrame : 자바 버전의 화면 그리는 도구 모음집.
	// 막대 바의 수치를 담을 변수, 전체를 100
	// 해당 막다의 수치가 커질수록, 분홍색(마젠타색)으로 채울 예정.
	private int barSize = 0;
	// 최대 막대의 크기 : 100으로 할 예정.
	private int maxBarSize;

	// 생성자
	MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}

	// 그림을 그려주는 기능 부분, 조금 어렵습니다.
	// 간단히 한번 보기.
	// paintComponent 메서드, 매개변수 : Graphics 타입의 레퍼런스 정의.
	// 분홍색 바의 수치가 증가하면, 수치에 맞게끔 , 상태바가 증가하는 그림을 그려주는 역할.
	
	public void paintComponent(Graphics g) { 
		// 그림을 그릴때, 부모의 기능을 재정의 해서 사용할 예정.
		  super.paintComponent(g); 
		// 그릴려는 막대의 색깔 설정. : 분홍색.
		  g.setColor(Color.MAGENTA); 
		// 막대의 전체 사이즈가 예 : 100, 1/100 의미, 1%씩 그리는 수치.
		  int width = (int)(((double)(this.getWidth())) 
		    /maxBarSize*barSize); 
		// 분홍색 막대 그래프가 없을 때,
		  if(width==0) return;  
			// 사각형을 그려주는 메서드 (색깔이 분홍색이 막대를 그려준다.채워준다.)
			// 첫번째 매개변수 : x 위치
			// 두번째 매개변수 : y 위치
			// 세번째 매개변수 : 막대의 가로 길이
			// 네번째 매개변수 : 막대의 세로 길이
		  g.fillRect(0, 0, width, this.getHeight()); 
		 }
	
	
	//동기화, 
	// 1단계 : 키 입력 받으면 분홍색 막대 증가 기능.
	// 2단계 : 키 입력 없다면, 분홍색 막대 감소 기능. 
	// 2가지 기능이 섞인다면, 우리가 원하는 기능 구현이 안됨.
	
	// 키 입력시 , 분홍색 막대 채우는 기능. 
	synchronized void fill() {
		// 처음 이거나, 가만히 있거나 했을 경우. 
		if(barSize == maxBarSize) {
			try {
				// 해당 스레드를 잠시 대기함, 
				// notify()  메서드가 호출이되면, 이제 다시 스레드가 동작을함. 
				wait();
			} catch (Exception e) {
				return;
				// TODO: handle exception
			}
		}
		// 그려주는 역할.
		barSize++;
		repaint();// 분홍색 막대를 다시 그리기. 
		notify(); // wait로 대기중인 스레드를 깨워서 동작 시키기. 
	}
	
	// 2단계 : 키 입력 없다면, 분홍색 막대 감소 기능. 
	synchronized void consume() {
		if(barSize == 0) {
			try {
				// 키 입력 없으면, 호출. 
				wait();
			} catch (Exception e) {
				return;
				// TODO: handle exception
			}
		} 
		barSize--;
		repaint(); // 분홍색 막대를 1만큼씩 감소
		notify(); // wait로 대기중인 스레드를 깨우기,-> 계속 그림을 그린다. 
		// 분홍색으로 1씩 그리거나, 1씩 감소해서 그리거나, 
		
	}
	

}

// 스레드 담당 클래스 
class ConsumerThread extends Thread {
	// 막대 그림을 그려주는 인스턴스 .
	private MyLabel barLabel;
	
	ConsumerThread(MyLabel barLabel) {
		// 스레드 담당 클래스에, 막대 인스턴스 넘겨주기. 
		this.barLabel = barLabel;
	}
	
	@Override
	public void run() {
//		super.run();
		while(true) {
			try {
				// 0.2 초씩 대기하기
				sleep(200);
				// 키 입력이 없다면, 
				// 0.2 초씩 마다, 분홍색 1씩 감소 시키기 , 무한 실행하기. 
				barLabel.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// 오류가 난 원인의 역학조사 필요없으면 그냥 주석. 
				//e.printStackTrace();
				return;
			}
			
		}
	}
	
}

// 실행용 클래스 사용1
//  부모의 윈도우 창 의미, 
// MyLabel -> 막대 그림만 의미. 
// 결론, MyLabel을 윈도우 창에 붙이기 예정. 
public class Ex_05_Thread_class_with_UI_Event_Bar extends JFrame {
	// 사용할 막대 인스턴스를 생성. 최대 크기는 임의로 100으로 잡기. 
	private MyLabel bar = new MyLabel(100);
	
	// 실행할 클래스에서 생성자 호출. 
	Ex_05_Thread_class_with_UI_Event_Bar(){
		setTitle("분홍색 막대 바 채우기 스레드 동기화 이용, wait, notify 사용하기. ");
		// 창 닫기 기능. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 패널 요소를 배치(정렬방법)
		// 틀린요소1
		Container container = getContentPane();
		// 요소의 정렬 기능이 없다.
		// 여기서는 단순히, 막대바 하나로 확인중이라서, 
		container.setLayout(null);
		// 기본 막대의 배경색 : 오렌지 색.
		bar.setBackground(Color.ORANGE);
		// JLabel 의 기본이 투명도가 있어서, 추가로 메서드 호출을해서 지정.
		// 배경색 적용. 
		bar.setOpaque(true);
		// 창으로 부터, 가로 20만큼 떨어지고, 50 만큼 아래로 떨어지기
		bar.setLocation(20,50);
		bar.setSize(300,20);
		
		//창에 막대 붙이기 작업. 
		container.add(bar);
		
		// 이벤트 핸들러 추가하기. 
		// 키 입력시, 채우는 기능 넣기.
		// new KeyAdapter() { : 익명 클래스, 이름 없는 클래스 이고, 
		// 주로, 1회용으로 사용시 이용. 보통) 이벤트 핸들러 많이 사용함. 
		container.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
//				super.keyPressed(e);
				// 기본 배경인 오렌지색 막대에, 키 입력으로 , 분홍색 막대를 1씩 채우는 역할. 
				bar.fill();
			}
		});
		
		// 부모의 창 크기. 
		setSize(350,200);
		// 창 보이기 옵션. 
		setVisible(true);
		
		//부모 창에서 옵션, 포커스 
		// 요소의 집중. 입력란에 커서 깜박이는 것처럼, 해당 요소를 가리키고 있다. 
		container.setFocusable(true);
		// 막대가 그려질 때마다, 해당 창을 봐주세요. 
		container.requestFocus();
		
		// 스레드 동작 시키기 
		ConsumerThread consumerThread = new ConsumerThread(bar);
		// 스레드 호출 
		consumerThread.start();
	}

	public static void main(String[] args) {
		// 메인 클래스의 기본 생성자 호출을 바로 함. 
		// 원래는 인스턴스 명에 담아서, 호출,
		// 방법1
		 new Ex_05_Thread_class_with_UI_Event_Bar();
		// 방법 2
//		Ex_05_Thread_class_with_UI_Event_Bar test = 
//				new Ex_05_Thread_class_with_UI_Event_Bar();
		

	}

}
