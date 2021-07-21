package chapter11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton [] radio = new JRadioButton[3];
	private String [] text = {"사과", "배", "체리"};
	private ImageIcon [] image = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")};
	private JLabel imageLabel = new JLabel(); //이미지가 출력될 레이블
	
	public RadioButtonItemEventEx() {
		setTitle("라디오버튼 Item Event 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel(); //3개의 라디오버튼을 부착할 패널
		radioPanel.setBackground(Color.gray);
		
		ButtonGroup g = new ButtonGroup(); //버튼 그룹 객체 생성
		for(int i = 0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener()); //라디오 버튼에 Item 리스너 등록
		}
		
		radio[2].setSelected(true);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(500, 300);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return; //해제된 경우 그냥 리턴
			if(radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else
				imageLabel.setIcon(image[2]);
		}
	}
	
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}
}