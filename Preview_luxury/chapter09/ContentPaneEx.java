package chapter09;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		
		Container contentPane = getContentPane();	//컨텐트팬을 알아냄
		contentPane.setBackground(Color.ORANGE);	//컨텐트팬 색 오렌지
		contentPane.setLayout(new FlowLayout()); 	//컨텐트팬에 FlowLayout 배치관리자 달기
		
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