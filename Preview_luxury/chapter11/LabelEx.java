package chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelEx extends JFrame	{
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("images/beauty.jpg"); //이미지 로딩
		JLabel imageLabel = new JLabel(beauty); //이미지 레이블 생성
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); //이미지 로딩
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER); //레이블 생성
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
	}
}