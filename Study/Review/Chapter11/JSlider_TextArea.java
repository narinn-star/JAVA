package Chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;

public class JSlider_TextArea extends JFrame {
	JTextArea area = new JTextArea();
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);

	public JSlider_TextArea() {
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(null);
		area.setLocation(5, 5);
		area.setSize(375, 180);
		c.add(area);

		slider.setPaintLabels(true); 		// 슬라이더 라벨 보임
		slider.setPaintTicks(true); 		// 슬라이더 눈금 보임
		slider.setPaintTrack(true); 		// 슬라이더 트랙 보임
		slider.setMajorTickSpacing(20); 	// 큰 눈금 간격 20으로 설정
		slider.setLocation(5, 180);
		slider.setSize(370, 100);
		c.add(slider, BorderLayout.SOUTH);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider = (JSlider) e.getSource();
				if (area.getText().length() <= slider.getValue())
					slider.setValue(area.getText().length());
				else {
					try {
						area.setText(area.getText(0, slider.getValue()));
					} catch (BadLocationException ex) {
					}

				}
			}
		});

		area.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				area = (JTextArea) e.getSource();
				int size = area.getText().length();
				if (size >= 100) {
					try {
						area.setText(area.getText(0, 100));
					} catch (BadLocationException ex) {}
				}
				slider.setValue(size);
			}
		});

		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JSlider_TextArea();
	}
}
