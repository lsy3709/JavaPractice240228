package ex_240311_picture_board;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class ch13_Buttons implements MouseListener {
	String[] drawStrings = { "자유선", "직선", "사각형", "원", "지우개" };
	String[] toolStrings = { "캔버스 추가", "캔버스 삭제", "클리어", "색선택", "이전", "다음", "글상자" };
	JButton[] drawbuttons = new JButton[5];
	JButton[] toolbuttons = new JButton[7];
	static boolean[] draw = new boolean[5];

	// JTabbedPane 상속 받아서 탭 추가하기.
	static ch13_CanvasGroup canvas = new ch13_CanvasGroup();
	ch13_Stroke stroke = new ch13_Stroke();

	static boolean clear;
	static boolean erase;
	static boolean text;

	int canvasNum = 0;

	ch13_Buttons() {

		// 그리기 버튼 만들기
		for (int i = 0; i < drawbuttons.length; i++) {
			drawbuttons[i] = new JButton(drawStrings[i]);
			drawbuttons[i].setBorderPainted(false);
			drawbuttons[i].addMouseListener(this);
		}

		// 툴 버튼 만들기
		for (int i = 0; i < toolbuttons.length; i++) {
			toolbuttons[i] = new JButton(toolStrings[i]);
			toolbuttons[i].setBorderPainted(false);
			toolbuttons[i].addMouseListener(this);
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();

		// 자유선
		if (button == drawbuttons[0]) {
			setDraw(button);
		}

		// 직선
		if (button == drawbuttons[1]) {
			setDraw(button);
		}

		// 사각형
		if (button == drawbuttons[2]) {
			setDraw(button);
		}

		// 원 추가
		if (button == drawbuttons[3]) {
			setDraw(button);
		}

		// 사각지우개 추가
		if (button == drawbuttons[4]) {
			setDraw(button);
		}

		// 캔버스추가
		if (button == toolbuttons[0]) {
			setInit();
			addCanvas();
		}

		// 캔버스 삭제
		if (button == toolbuttons[1]) {
			// setInit();
			ch13_CheckFrame check = new ch13_CheckFrame();
		}

		// 클리어
		if (button == toolbuttons[2]) {
			setInit();
			clear = true;
			canvas.getSelectedComponent().repaint();
			System.out.println("클리어 버튼 클릭");
		}

		// 색선택
		if (button == toolbuttons[3]) {
			ch13_ColorFrame colorFrame = new ch13_ColorFrame();
		}

		// 이전
		if (button == toolbuttons[4]) {
			undo();
		}

		// 다음
		if (button == toolbuttons[5]) {
			redo();
		}

		// 글상자
		if (button == toolbuttons[6]) {
			setText();
			ch13_TextBoard textBoard = new ch13_TextBoard();
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// 그림 그리기 버튼 선택시 , 해당 그리기 버튼 상태 변수 draw 가 true 이고
	// 버튼 테두리 경계선 활성화
	// 나머지 그리기 버튼의 상태는 false로 변경. 경계 테두리는 비활성화
	private void setDraw(JButton button) {

		for (int i = 0; i < drawbuttons.length; i++) {
			if (button == drawbuttons[i]) {
				draw[i] = true;
				drawbuttons[i].setBorderPainted(true);
			} else {
				draw[i] = false;
				drawbuttons[i].setBorderPainted(false);
			}
		}

	}

	// 그리기 버튼 상태 모두 false , 버튼 테두리 선 모두 해제.
	private void setInit() {
		erase = false;
		text = false;

		for (int i = 0; i < drawbuttons.length; i++) {
			draw[i] = false;
			drawbuttons[i].setBorderPainted(false);
		}

	}

	// 캔버스 객체 생성해서, 탭에 추가 . JTabbedPane을 상속한 CanvasGroup에 추가하기.
	private void addCanvas() {
		ch13_Canvas newCanvas = new ch13_Canvas();

		newCanvas.setBackground(Color.white);
		newCanvas.setOpaque(true);

		canvas.add("canvas" + canvasNum, newCanvas);
		canvasNum++;

	}

	// 지우는 상태 true, 해당 버튼 제외하고 나머지 버튼 테두리 체크 해제 및 그리기 상태 모두 false
	private void setEraser() {
		erase = true;

		for (int i = 0; i < toolbuttons.length; i++) {
			toolbuttons[i].setBorderPainted(false);
		}

		for (int i = 0; i < drawbuttons.length; i++) {
			draw[i] = false;
			drawbuttons[i].setBorderPainted(false);
		}

		toolbuttons[2].setBorderPainted(true);

	}

	//
	private void setText() {
		erase = false;
		text = true;

		for (int i = 0; i < toolbuttons.length; i++) {
			toolbuttons[i].setBorderPainted(false);
		}

		for (int i = 0; i < drawbuttons.length; i++) {
			draw[i] = false;
			drawbuttons[i].setBorderPainted(false);
		}

		toolbuttons[6].setBorderPainted(true);
	}

	private void undo() {
		ch13_ColorFrame.colorChange = true;

		// 해당 Memory 클래스에 memory 객체 가
		// Stack 클래스에 , 형 Object
		// 비웠다면 아무것도 안하고
		// 뭔가 있다면

		if (ch13_Memory.memory.isEmpty() == true)
			;

		else {
			// peek() 해당 스택에 꼭대기(최근에 담은것) 없다면
			//
			if (ch13_Memory.memory.peek() == null) {
				// Sketch 클래스에 Stack 클래스에 , 형 Object
				// 시작점, 끝점을 pop() 꺼내기
				ch13_Sketch.redoStart.push(ch13_Sketch.start.pop());
				ch13_Sketch.redoEnd.push(ch13_Sketch.end.pop());
			}

			// peek() 해당 스택에 꼭대기(최근에 담은것) 있다면
			// 해당 메모리 클래스에 각 시작점, 끝점 가져오기.
			ch13_Memory.redoMemory.push(ch13_Memory.memory.pop());
			ch13_Memory.redoColorMemory.push(ch13_Memory.colorMemory.pop());
			ch13_Memory.redoThicknessMemory.push(ch13_Memory.thicknessMemory.pop());

			canvas.getSelectedComponent().repaint();
		}
	}

	private void redo() {
		ch13_ColorFrame.colorChange = true;

		if (ch13_Memory.redoMemory.isEmpty() == true)
			;
		else {
			if (ch13_Memory.redoMemory.peek() == null) {
				ch13_Sketch.start.push(ch13_Sketch.redoStart.pop());
				ch13_Sketch.end.push(ch13_Sketch.redoEnd.pop());
			}

			ch13_Memory.memory.push(ch13_Memory.redoMemory.pop());
			ch13_Memory.colorMemory.push(ch13_Memory.redoColorMemory.pop());
			ch13_Memory.thicknessMemory.push(ch13_Memory.redoThicknessMemory.pop());

			canvas.getSelectedComponent().repaint();
		}
	}

}
