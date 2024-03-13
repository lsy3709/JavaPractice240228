package ex_240313;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

class TimerThread extends Thread {
	int num = 0 ;
	
	@Override
	public void run() {
		while(true) {
			System.out.println("스레드 기본 출력 테스트 num : " + num);
			num++;
			try {
				// 스레드가 1000 ms 만큼 기다렸다가 동작을함. 
				sleep(1000);
			}
			catch (Exception e) {
				System.out.println("error : " + e.getMessage());
			}
		}
	}
}

class DateTimer extends Thread {
	// 컴파일러 한테, 내가 부모의 메서드 run을 재정의 했거든
	// 나중에, 체크 잘해줘 , 부탁하기.
	@Override
	public void run() {
		super.run();
		while(true) {
			try {
				// 날짜
				LocalDate currentDate = LocalDate.now();
				// 시간
				LocalTime currentTime = LocalTime.now();  
				System.out.println("현재 날짜 및 시간 : " + currentDate + " " +currentTime );
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}

public class Ex_01_Thread_class_1 {

	public static void main(String[] args) {
		//자바, 스레드 기초, 
		// 멀티 스레딩 방식으로 작업을 주로 함. 
		// jvm -> 응용프로그램 안에서 (스레드1,스레드2,스레드3,...) 구성이된다. 
		// 실무에서, 실제 웹, 모바일이라든지 작업시, 
		// 해당 프레임워크에 내재된 기능 또는 외부 API(기능)에 탑재가 거의 되어있음. 
		// 그래서, 처음 주로, 이용하는 편으로, API가 아니라, 우리가 서비스 기능을 무언가 만들 때, 
		// 그 때 이용이 될것임. 
		// 정의, 사용. 
		// 클래스 이용해서, 상속 받아서 구현해보기. 
		
		// 예) class Person extends Thread 
		// run 메서드를 재정의를 해서 , 동시에 작업할 내용을 작성. 
		// 스레드를 상속받은 클래스의 인스턴스에서, start 메서드를 호출하면. 
		// run 이라는 메서드가 동작을 하면서, 그 때 스레드 시작을 함. 
		
		// 순서1, 스레드 클래스의 인스터스 생성하기. 
		TimerThread tt = new TimerThread();
		// 순서2, 스레드를 상속받은 클래스의 인스턴스에서, start 메서드 호출 함. 
		tt.start();
		// run 메서드가 동작을 하게 됨. 
		
		// 두번째 스레드 동작하기. 
		DateTimer dt = new DateTimer();
		dt.start();

	}

}
