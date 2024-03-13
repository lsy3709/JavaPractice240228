package ex_240313;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 스레드 상속받은 클래스 정의 
// 방법1.
class TimerThread2 extends Thread {
	// JLabel , 자바 버정의 화면 UI -> 빈 도화지 역할.
	public JLabel timerLabel;

	// 매개변수가 1개인 생성자를 호출하는데. timerLabel , 화면을 인스턴스로 받기
	public TimerThread2(JLabel timerLabel) { // label 로 받기
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		super.run();
		int n = 0; // 타이머에 사용이 될 숫자값.
		while (true) {
			// 숫자 타입을 문자열 타입으로 변환. Wrapper 클래스, Integer
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//방법2, 인터페이스를 Runnable 구현해서 이용하기.
//
class TimerThread3 implements Runnable {
	// JLabel , 자바 버정의 화면 UI -> 빈 도화지 역할.
	public JLabel timerLabel;

	// 매개변수가 1개인 생성자를 호출하는데. timerLabel , 화면을 인스턴스로 받기
	public TimerThread3(JLabel timerLabel) { // label 로 받기
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 0; // 타이머에 사용이 될 숫자값.
		while (true) {
			// 숫자 타입을 문자열 타입으로 변환. Wrapper 클래스, Integer
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				// Thread 의 정적 메서드라서, 바로 호출.
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Ex_01_Thread_class_with_UI2 extends JFrame {
	// 화면을 그리기 위해서, 기본생성자에서, 화면을 그리기 위한 준비단계
	Ex_01_Thread_class_with_UI2() {
		// 윈도우 부모 창에 제목
		setTitle("상속 받은 스레드 클래스 테스트 ");
		// 창에 엑스 표시 누르면, 창을 종료함.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 부모 창에, 흰 캔버스에 설정. 배치를 어떻게 할지도 같이 지정.
		Container container = getContentPane();
		// FlowLayout : HTML -> flex 와 비슷, 순서대로 나열하는 방식
		// 정렬 방식을 설정.
		container.setLayout(new FlowLayout());

		// 시간을 표시하는 라벨(패널)을 붙이는 작업하기.
		// 순서.
		// 라벨을 먼저 만들기.
		JLabel timerLabel = new JLabel();
		// 옵션, 글꼴 모양, 기울기, 크기등 .
		// timerLabel 의 많은 메서드 중에서, setFont 메서드를 이용해고,
		// setFont (Font 참조형변수)
		// Font font = new Font("Gothic",Font.ITALIC, 100));
		// setFont (font)
		// 변수에 담아서 재사용하지 않고, 바로 할당했음. 1회용처럼.
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 100));
		timerLabel.setBackground(Color.BLUE);
		JLabel testLabel = new JLabel("test");
		testLabel.setBackground(Color.CYAN);
		
		// 2번째 숫자 카운팅 화면 패널 
		JLabel timerLabel2 = new JLabel();
		timerLabel2.setFont(new Font("Gothic", Font.ITALIC, 100));

		// 해당 라벨을 -> 부모의 캔버스 에 붙이는 작업.
		container.add(timerLabel);
		container.add(testLabel);
		container.add(new JButton("test2"));
		
		// 2번째 카운팅 패널 붙이기. 
		container.add(timerLabel2);

		// 부모 창에 가로 세로 크기 지정.
		setSize(300, 200);
		// 부모 창을 보여 줄지 여부 지정.
		setVisible(true);
		container.setBackground(Color.ORANGE);
		
		// 스레드 작업.
		TimerThread2 tt2 = new TimerThread2(timerLabel);
		tt2.start();
		// 방법2의 스레드 호출하기. 
		TimerThread3 tt3 = new TimerThread3(timerLabel2);
		// 순서3 추가 부분. Thread 생성자에 입력하기. 
		Thread th3 = new Thread(tt3);
		// 시작. 
		th3.start();
		

	}
	
	

	public static void main(String[] args) {
		// JLabel 를 패널이라고하고, 패널을 붙이는 창이 필요함. 프레임(window 창같음)
		// UI 기능을 많이 가지고 있는 클래스 하나를 상속을 받고.
		// JFrame 클래스 상속받기.
		Ex_01_Thread_class_with_UI2 test = new Ex_01_Thread_class_with_UI2();

	}

	// 화면을 그려주는 정적 메서드
	public static void makeUI() {

	}

}
