package Chapter14;

import java.awt.*;
import javax.swing.*;

public class ToolBarEx extends JFrame {
	public ToolBarEx() {
		super("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createTool();

		setSize(400, 250);
		setVisible(true);
	}

	private void createTool() {
		JToolBar bar = new JToolBar("Kitae Menu");
		bar.setBackground(Color.LIGHT_GRAY);

		bar.add(new JButton("New"));
		bar.add(new JButton(new ImageIcon("images/open.jpg")));
		bar.addSeparator();
		bar.add(new JButton(new ImageIcon("images/save.jpg")));
		bar.add(new JLabel("Search"));
		bar.add(new JTextField("text field"));
		
		JComboBox<String> box = new JComboBox<>();
		box.addItem("Java");
		box.addItem("C#");
		box.addItem("C");
		box.addItem("C++");
		bar.add(box);
		add(bar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolBarEx();
	}
}