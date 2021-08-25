package chapter14;

import javax.swing.*;
import java.awt.*;

public class ToolBarEx extends JFrame {
	private Container contentPane;
	
	public ToolBarEx() {
		setTitle("���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		createToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	
	//���ٸ� �����Ͽ� �������ҿ� �����Ѵ�.
	private void createToolBar() {
		//���� ����
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		//���ٿ� �޴��� ����� ������Ʈ�� ����
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		//���ĸ� ���������� NORTH�� ����
		contentPane.add(toolBar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolBarEx();
	}
}