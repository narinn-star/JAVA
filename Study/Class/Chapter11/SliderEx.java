package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SliderEx extends JFrame {
	public SliderEx() {
		super("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider sl = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(50);
		sl.setMinorTickSpacing(10);
		
		c.add(sl);
		
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SliderEx();
	}
}