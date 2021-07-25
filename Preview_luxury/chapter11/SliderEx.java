package chapter11;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
	public SliderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0,200, 100); //수평 슬라이더를 생성
																	  //0 ~ 200 범위에서 선택 가능하며 현재 선택된 값은 100
		slider.setPaintLabels(true);
		slider.setPaintTicks(true); 
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10); //JSlider의 메소드를 호출하여 슬라이더의 모양을 제어 (Line 15~19)
		c.add(slider);
		
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SliderEx();
	}
}