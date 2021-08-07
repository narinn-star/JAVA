package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawLineMouseEx() {
		setTitle("drawing Line by Mouse ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}

	// ���� �׸� �� �ִ� �г��� ����
	// �� �гο� Mouse ������ ����
	class MyPanel extends JPanel {
		// �׷��� ���� ��� �����ϱ� ���� �������� vStart�� ������ vEnd ���Ϳ� ���� ����
		private Vector<Point> vStart = new Vector<>();
		private Vector<Point> vEnd = new Vector<>();

		public MyPanel() {
			// Mouse ������ ���
			// ���콺 ��ư�� �������� ���콺 ������(������)�� vStart ���Ϳ� ����
			// ���콺 ��ư�� �������� ���콺 ������(����)�� vEnd ���Ϳ� ����
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint(); // ���콺 ������ �˾Ƴ���
					vStart.add(startP); // �������� vStart�� ����
				}

				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint(); // ���콺 ������ �˾Ƴ���
					vEnd.add(endP); // ������ vEnd�� ����

					// �г��� �ٽ� �׸��� ��û
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.setColor(Color.blue);

			// ���� ũ�⸸ŭ ���� ���� �� �׸���
			for (int i = 0; i < vStart.size(); i++) {
				Point s = vStart.elementAt(i); // ���Ϳ� ����ִ� ������ �˾Ƴ���
				Point e = vEnd.elementAt(i); // ���Ϳ� ����ִ� ���� �˾Ƴ���

				// ���������� �������� �� �׸���
				g.drawLine((int) s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
			}
		}
	}
}