package Chapter09;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 2, 1, 5)); // 4x2 �׸���� ����, �¿� ���򰣰� 1, ���� �������� 5
		//GridLayout grid = new GridLayout(4, 2); // 4x2 �׸���� ����
		//grid.setVgap(5); //�������ݸ� 5 (���򰣰��� Default_0)
		//Container c = getContentPane();
		//c.setLayout(grid);
		
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ����"));
		c.add(new JTextField(""));
		
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}
}