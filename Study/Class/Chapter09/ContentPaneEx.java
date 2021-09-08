package Chapter09;

import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		super("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setBackground(Color.ORANGE);
		c.setLayout(new FlowLayout()); //배치관리자
		
		JButton okBtn = new JButton("OK");
		JButton cancelBtn = new JButton("Cancel");
		JButton ignoreBtn = new JButton("Ignore");
		
		c.add(okBtn);
		c.add(cancelBtn);
		c.add(ignoreBtn);
		
		//c.add(new JButton("OK");
		//c.add(new JButton("Cancel");
		//c.add(new JButton("Ignore");
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}