package ex_240313;

import java.util.Iterator;

// 공유 프린터 역할하는 클래스 
class SharedPrinter {
	public void print(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			System.out.println();
		}

	}

}

public class Ex_04_Thread_class_with_synchronized extends Thread {
	// 클래스 참조형으로 선언만 하기.
	private SharedPrinter sharedPrinter;
	// 테스트로 출력할 문자열을 받을 배열 선언. 
	private String [] text;
	
	// 생성자 정의 
	Ex_04_Thread_class_with_synchronized(SharedPrinter sharedPrinter, String [] text){
		this.sharedPrinter = sharedPrinter;
		this.text = text;
	}

	// run 메서드 재정의하기.
	// 실제로 동시에 작업할 내용을 적기. 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0 ; i < text.length; i++) {
			// 공유 프린터 인스턴스를 이용해서, 해당 메서드로 출력하기. 
			sharedPrinter.print(text[i]);
		}
	}
	
	public static void main(String[] args) {
		
		//사용하기. 
		// 공유 프린터 사용하기 위한 인스턴스 
		SharedPrinter sharedPrinter = new SharedPrinter();
		
		// 샘플 데이터
		String [] engTextStrings = {"abcd","efgh","ijkl","mnop","qrst","uvwxyz"};
		
		String [] korTextStrings = {"사과","바나나","수박","파인애플","딸기"};
		
		// 스레드 인스턴스 생성 
		//  매개변수가 2개인 생성자, 1번째 매개변수: 공유프린터의 인스턴스
		// 2번째 매개변수: 출력할 샘플데이터, 문자열 타입의 배열 인스턴스
		Ex_04_Thread_class_with_synchronized th1 = 
				new Ex_04_Thread_class_with_synchronized(sharedPrinter,engTextStrings);
		
		Ex_04_Thread_class_with_synchronized th2 = 
				new Ex_04_Thread_class_with_synchronized(sharedPrinter,korTextStrings);
		
		// 정의한 스레드를 start 메서드 이용해서 호출해보기.
		// 먼저, 문제점을 제시, sychronized 키워드 없을 시 실행 결과 보기. 
		// sychronized 이용해서 정상 동작 확인 해보기.
		
		th1.start();
		th2.start();
		

	}

}
