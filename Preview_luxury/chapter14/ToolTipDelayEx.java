package chapter14;

import javax.swing.*;
import java.awt.*;

public class ToolTipDelayEx extends JFrame {
	public ToolTipDelayEx() {
		setTitle("툴팁 지연 시간 제어 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//체리 이미지
		JLabel cherry = new JLabel(new ImageIcon("images/cherry.jpg"));
		cherry.setToolTipText("체리 이미지 어때요");
		
		//사과 이미지
		JLabel apple = new JLabel(new ImageIcon("images/apple.jpg"));
		apple.setToolTipText("사과 이미지 어때요");
		
		c.add(cherry);
		c.add(apple);
		
		//ToolTipManager 객체 얻기
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0); //초기 툴팁 출력 지연 시간 0초
		m.setDismissDelay(10000); //툴팁 지속 시간 10초
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ToolTipDelayEx();
	}
}