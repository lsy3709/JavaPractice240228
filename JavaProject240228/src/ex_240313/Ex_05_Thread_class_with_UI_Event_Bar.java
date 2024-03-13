package ex_240313;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

// 화면 UI 담당 클래스 
class MyLabel extends JFrame {
	// JFrame : 자바 버전의 화면 그리는 도구 모음집. 
	// 막대 바의 수치를 담을 변수, 전체를 100 
	// 해당 막다의 수치가 커질수록, 분홍색(마젠타색)으로 채울 예정. 
	private int barSize = 0;
	// 최대 막대의 크기 : 100으로 할 예정. 
	private int maxBarSize;
	
	// 생성자 
	MyLabel(int maxBarSize){
		this.maxBarSize = maxBarSize;
	}
	
	// 그림을 그려주는 기능 부분, 조금 어렵습니다. 
	// 간단히 한번 보기. 
	// paintComponent 메서드, 매개변수 : Graphics 타입의 레퍼런스 정의.
	// 분홍색 바의 수치가 증가하면, 수치에 맞게끔 , 상태바가 증가하는 그림을 그려주는 역할. 
	public void paintComponent(Graphics g) {
		// 그림을 그릴때, 부모의 기능을 재정의 해서 사용할 예정. 
		super.paintComponents(g);
		// 그릴려는 막대의 색깔 설정. : 분홍색. 
		g.setColor(Color.MAGENTA);
		// 막대의 전체 사이즈가 예 : 100, 1/100 의미, 1%씩 그리는 수치. 
		int width = (int)(((double)this.getWidth())/maxBarSize*barSize);
		
		// 분홍색 막대 그래프가 없을 때, 
		if(width == 0) return;
		// 사각형을 그려주는 메서드 (색깔이 분홍색이 막대를 그려준다.채워준다.)
		// 첫번째 매개변수 : x 위치
		// 두번째 매개변수 : y 위치
		// 세번째 매개변수 : 막대의 가로 길이
		// 네번째 매개변수 : 막대의 세로 길이
		
			g.fillRect(0, 0, width, this.getHeight());
	}
	
}

// 스레드 담당 클래스 

// 실행용 클래스 사용1
public class Ex_05_Thread_class_with_UI_Event_Bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
