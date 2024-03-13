package ex_240313;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

// 조금 전에는
// 준비물
// 1) 스레드를 상속 또는 구현한 클래스. 2) 해당 클래스를 실행하는 클래스 
// 이번에는 , 실행하는 클래스에서, 
// 한번에, Runnable 인터페이스도 구현하고, 
//  JFrame 이라고 해서 UI 도 같이 상속받기. 
public class Ex_03_Thread_class_with_UI_Event extends JFrame implements Runnable{
	// 인터페이스 구현해서 스레드 동작 할려면, 
	// 인터페이스 구현한 클래스의 인스턴스를, Thread 생성자에 인자값으로 사용해야함. 
	// 그래서, Thread 타입의 레퍼런스가 필요함. 
	
	// 스레드 동작하기 위한 인스턴스
	private Thread th;
	
	// JFrame 상속 받아서, 자바에서 제공 해주는 Swing 패키지안에 있는 UI 요소를 사용할 예정. 
	// 생성자를 이용해서, 창을 그리기 준비. 
	Ex_03_Thread_class_with_UI_Event(){
		// 창의 제목 설정. 
		setTitle("클릭시 창이 진동하는 것처럼 보이기, 스레드 연습 ");
		// 창 닫을 때, 종료하기. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 가로 세로 크기. 
		setSize(400,400);
		// 부모 창의 왼쪽 위의 모서를, 
		// 화면으로부터 , 왼쪽에서 300px 떨어지게,
		// 화면으로부터 , 위쪽에서 300px 떨어지게,
		setLocation(300,300);
		
		// 화면 표시하는 메서드. 
		setVisible(true);
		
		// 이벤트 핸들러 추가하기. 특정의 인터페이스를 구현한 익명 클래스를 인자값으로 이용함. 
		// 자바에서, 이벤트 핸들러 같이, 1회용으로 사용이 되는 클래스를 말함. 
		// 익명 클래스, -> 람다식(화살표 함수로 변경해서 사용하곤 합니다.)
		// 해당 컨버스에서, 창에서, 어딘가 클릭시 이벤트 처리를 하기 위한 리스너 구성. 
		// 리스너 : 액션(클릭, 키 입력 등) 이 있는지를 리스닝(듣고있다. 감시 중).
		getContentPane().addMouseListener(
				// MouseAdapter 클래스는, 마우스 클릭, 드래그, 더블 클릭, 클릭 해제(마우스 누르고 뗀 순간)
				// 메서드 가지고 있는 추상 클래스 
				new MouseAdapter() {
					// 그중에서 클릭시 뭔가를 수행하기 위해서, mousePressed 메서드 수행.
					// MouseEvent -> 클릭을 의미함. 
					public void mousePressed(MouseEvent e) {
						// 클릭을 했을 때, 스레드가 살아있다면, interrupt 방해하는 메서드를 호출하고, 
						// 클릭을 했을 때, 스레드가 죽었다면, 리턴 나가기. 
						if(!th.isAlive()) return;
							th.interrupt();
					}
				}
				);
		
		// 스레드 동작 시키기. 초기화 늦게함.
		// 
		th = new Thread(this);
		th.start();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_03_Thread_class_with_UI_Event test = new Ex_03_Thread_class_with_UI_Event();


	}

	@Override
	public void run() {
		// 진동 구현하기. 
		// 특정 시간마다, 진동하기. 
		Random random = new Random();
		while(true) {
			try {
				// 해당 스레드가 0.03초 마다 실행되기
				Thread.sleep(30);
			} catch (Exception e) {
				System.out.println("인터럽트 호출을 당해서 종료");
				return;
				// TODO: handle exception
			}
			//  getX(), 부모 클래스에서 제공해주는 , 해당 창의 x 좌표 가져오기. 
			// random.nextInt() -> 랜덤한 숫자를 의미하고, 이숫자를 % 로 나누기. 
			// 가능한 숫자 범위 : 0 ~ 4 
			int x = getX() + random.nextInt()%5; // 새로운 x 의 위치
			int y = getY() + random.nextInt()%5; // 새로운 y 의 위치
			// 창의 위치를 0.03 초마다, 변경하기, 하도 빠르니, 진동하는 것처럼 보임. 
			setLocation(x,y);
		}
		
	}

}
