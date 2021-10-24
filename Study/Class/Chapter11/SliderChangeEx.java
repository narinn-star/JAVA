package Chapter11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderChangeEx extends JFrame {
	static JSlider[] sl = new JSlider [3];
	static JLabel la = new JLabel("SLIDER EXAMPLE");
	public SliderChangeEx() {
		super("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		

		for(int i = 0; i < sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 250, 125);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		
		la.setOpaque(true);
		la.setBackground(new Color(r,g,b));
		
		c.add(la);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			la.setBackground(new Color(r,g,b));
		}
	}

	public static void main(String[] args) {
		new SliderChangeEx();
	}
}