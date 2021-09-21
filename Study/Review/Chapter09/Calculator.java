package Chapter09;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	public Calculator() {
		super("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JPanel tf = new JPanel();
		JPanel num = new JPanel();
		JPanel res = new JPanel();
		
		tf.setBackground(Color.LIGHT_GRAY);
		num.setLayout(new GridLayout(4, 4, 2, 2));
		res.setBackground(Color.YELLOW);
		
		c.add(tf, BorderLayout.NORTH);
		c.add(num);
		c.add(res, BorderLayout.SOUTH);
		
		String[] btn = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE",
				"계산", "+", "-", "x", "/"};
		
		JLabel la1 = new JLabel("수식입력");
		JTextField input = new JTextField(20);
		tf.add(la1);
		tf.add(input);
		
		for(int i = 0; i < 16; i++) {
			JButton button = new JButton();
			num.setSize(10, 30);
			button.setText(btn[i]);
			if(i > 11)
				button.setBackground(Color.cyan);
			num.add(button);
			c.add(num);
		}
		
		JLabel la2 = new JLabel("계산 결과");
		JTextField output = new JTextField(20);
		res.add(la2);
		res.add(output);
			
		setSize(350, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}
}