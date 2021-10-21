package Chapter11;

import java.awt.*;
import javax.swing.*;

public class ListEx extends JFrame {
	public ListEx() {
		super("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };
		ImageIcon[] images = {new ImageIcon("images/icon1.png"), new ImageIcon("images/icon2.png"),
							  new ImageIcon("images/icon3.png"), new ImageIcon("images/icon4.png")};
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		JList<ImageIcon> imageList = new JList<ImageIcon>(images);
		c.add(imageList);
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ListEx();
	}
}