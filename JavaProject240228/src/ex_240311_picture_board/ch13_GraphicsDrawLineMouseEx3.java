package ex_240311_picture_board;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Stack;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


	public class ch13_GraphicsDrawLineMouseEx3 extends JFrame {
		ch13_ToolBar toolbar = new ch13_ToolBar();
		public ch13_GraphicsDrawLineMouseEx3() {
			setTitle("버튼 클릭, 선,타원, 사각형,그리기 응용 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(1440,800);
			add(toolbar, BorderLayout.NORTH);
			add(toolbar.buttons.canvas);
			//setContentPane(new MyPanel());
			setVisible(true);
		}

		public static void main(String [] args) {
			new ch13_GraphicsDrawLineMouseEx3();
		} 
}
