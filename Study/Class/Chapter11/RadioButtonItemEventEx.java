package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton[] radio = new JRadioButton[3];
	private String [] text = {"사과", "배", "체리"	};
	private ImageIcon[] images = { new ImageIcon("images/apple.jpg"), new ImageIcon("images/pear.jpg"), new ImageIcon("images/cherry.jpg")};
	private JLabel label = new JLabel();
	
	public RadioButtonItemEventEx() {
		setTitle("라디오버튼 Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		
		ButtonGroup group = new ButtonGroup();
		for(int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			group.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.DESELECTED)
						return;
					if(radio[0].isSelected())
						label.setIcon(images[0]);
					else if(radio[1].isSelected())
						label.setIcon(images[1]);
					else
						label.setIcon(images[2]);
				}
			});
		}
		
		radio[2].setSelected(true);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(label, BorderLayout.SOUTH);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}
}