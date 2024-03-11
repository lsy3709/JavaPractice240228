package ex_240311_picture_board;


import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ch13_Stroke extends JSpinner implements ChangeListener{
	SpinnerNumberModel thickness = new SpinnerNumberModel(1,1,50,1);
	static int thick = 1;
	
	ch13_Stroke() {
		setModel(thickness);
		addChangeListener(this);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		thick = (Integer)this.getValue();
	}

}
