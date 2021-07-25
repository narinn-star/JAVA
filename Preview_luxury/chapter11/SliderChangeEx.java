package chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame {
	private JLabel colorLabel;
	private JSlider [] sl = new JSlider [3]; //3���� �����̴� �迭 ����
	
	public SliderChangeEx() {
		setTitle("�����̴��� ChangeEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		colorLabel = new JLabel("     SLIDER EXAMPLE      ");
		
		//�����̴��� 3�� �����ϰ� ����� �����Ѵ�.
		for(int i = 0; i<sl.length; i++) {
			//0~255 ������ ���� ������ �� �ִ� �����̴� ����. �ʱ갪�� 128
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			
			//�����̴��� Change ������ ���
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]); //�����̴��� ����Ʈ�ҿ� ����
		}
		
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		
		//���� 3���� �����̴��κ��� ���� ��� �ʱ� colorLabel�� ���� ����
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		colorLabel.setOpaque(true); //������ ��µǵ��� ������ ����
		colorLabel.setBackground(new Color(r,g,b));
		
		c.add(colorLabel);
		setSize(300, 230);
		setVisible(true);
	}
	
	//Change ������ ����
	class MyChangeListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			colorLabel.setBackground(new Color(r,g,b));
		}
	}
	public static void main(String[] args) {
		new SliderChangeEx();
	}
}