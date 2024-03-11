package ex_240311_picture_board;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JToolBar;

public class ch13_ToolBar extends JToolBar {
	ch13_Buttons buttons = new ch13_Buttons();
	
	ch13_ToolBar() {
		setBackground(Color.LIGHT_GRAY);
		
	for (int i = 0; i < buttons.drawbuttons.length; i++) {
		add(buttons.drawbuttons[i]);
	}
	
	addSeparator();
	//캔버스 추가
	add(buttons.toolbuttons[0]);
	//캔버스 삭제
	add(buttons.toolbuttons[1]);
	//지우기
	add(buttons.toolbuttons[2]);
	
	addSeparator();
	// 굵기 선택
	add(buttons.stroke);
	
	// 색선택
	add(buttons.toolbuttons[3]);
	addSeparator();
	// 이전 
	add(buttons.toolbuttons[4]);
	// 다음
	add(buttons.toolbuttons[5]);
	// 글상자
	add(buttons.toolbuttons[6]);
	addSeparator(new Dimension(880,1));
	}
}
