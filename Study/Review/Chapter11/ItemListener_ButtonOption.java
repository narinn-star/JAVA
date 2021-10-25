package Chapter11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ItemListener_ButtonOption extends JFrame {
	public ItemListener_ButtonOption() {
		super("CheckBox Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox[] checkBox = new JCheckBox[2];
		checkBox[0] = new JCheckBox("버튼 비활성화");
		checkBox[1] = new JCheckBox("버튼 감추기");
		JButton btn = new JButton("test button");
		
		checkBox[0].addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setEnabled(false);
				else
					btn.setEnabled(true);
			}
		});
		checkBox[1].addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					btn.setVisible(false);
				else
					btn.setVisible(true);
			}
		});
		
		c.add(checkBox[0]);
		c.add(checkBox[1]);
		c.add(btn);		
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ItemListener_ButtonOption();
	}
}