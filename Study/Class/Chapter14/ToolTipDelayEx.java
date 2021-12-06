package Chapter14;

import java.awt.*;
import javax.swing.*;

public class ToolTipDelayEx extends JFrame {
	public ToolTipDelayEx() {
		super("툴팁 지연 시간 제어 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel cherry = new JLabel(new ImageIcon("images/cherry.jpg"));
		cherry.setToolTipText("체리 이미지 어때요");
		c.add(cherry);
		
		JLabel apple = new JLabel(new ImageIcon("images/apple.jpg"));
		apple.setToolTipText("사과 이미지 어때요");
		c.add(apple);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);			//초기 툴팁 지연 시간 0초
		m.setDismissDelay(10000);		//툴팁 지속 시간 10초
		
		setSize(450, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ToolTipDelayEx();
	}
}