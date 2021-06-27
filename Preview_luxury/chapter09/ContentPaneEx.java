package chapter09;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//������ �����츦 ������ ���α׷��� �����ϵ��� ����
		
		Container contentPane = getContentPane();	//����Ʈ���� �˾Ƴ�
		contentPane.setBackground(Color.ORANGE);	//����Ʈ�� �� ������
		contentPane.setLayout(new FlowLayout()); 	//����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ�
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}