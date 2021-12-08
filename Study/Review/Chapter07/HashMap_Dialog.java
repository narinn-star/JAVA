package Chapter07;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.NullPointerException;

public class HashMap_Dialog extends JFrame {
	private HashMap<String, Integer> input = new HashMap<>();
	JButton btn = new JButton("입력 Dialog 띄우기");

	public HashMap_Dialog() {
		super("포인트 관리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String text = JOptionPane.showInputDialog("이름과 포인트 입력");
					String[] str = text.split(" ");
					String name = str[0];
					if (str[0].equals("그만"))
						System.exit(0);

					int point = Integer.parseInt(str[1]);
					Integer plus = input.get(name);

					if (plus != null) {
						point += plus;
					}
					input.put(name, point);

					Set<String> keys = input.keySet();
					Iterator<String> it = keys.iterator();
					while (it.hasNext()) {
						String res = it.next();
						System.out.print("(" + res + " " + input.get(res) + ")");
					}
					System.out.println();
				} catch (NullPointerException ee) {	}
			}
		});

		add(btn);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HashMap_Dialog();
	}
}