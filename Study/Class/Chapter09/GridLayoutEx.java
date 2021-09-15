package Chapter09;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 2, 1, 5)); // 4x2 그리드로 분할, 좌우 수평간격 1, 상하 수직간격 5
		//GridLayout grid = new GridLayout(4, 2); // 4x2 그리드로 분할
		//grid.setVgap(5); //수직간격만 5 (수평간격은 Default_0)
		//Container c = getContentPane();
		//c.setLayout(grid);
		
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}
}