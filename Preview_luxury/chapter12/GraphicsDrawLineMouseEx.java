package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawLineMouseEx() {
		setTitle("drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}

	// 선을 그릴 수 있는 패널을 구현
	// 이 패널에 Mouse 리스너 구현
	class MyPanel extends JPanel {
		// 그려진 선을 모두 저장하기 위해 시작점은 vStart에 끝점은 vEnd 벡터에 각각 저장
		private Vector<Point> vStart = new Vector<>();
		private Vector<Point> vEnd = new Vector<>();

		public MyPanel() {
			// Mouse 리스너 등록
			// 마우스 버튼이 눌러지면 마우스 포인터(시작점)를 vStart 벡터에 저장
			// 마우스 버튼이 놓여지면 마우스 포인터(끝점)를 vEnd 벡터에 저장
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint(); // 마우스 포인터 알아내기
					vStart.add(startP); // 시작점을 vStart에 저장
				}

				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint(); // 마우스 포인터 알아내기
					vEnd.add(endP); // 끝점을 vEnd에 저장

					// 패널의 다시 그리기 요청
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.setColor(Color.blue);

			// 벡터 크기만큼 루프 돌며 선 그리기
			for (int i = 0; i < vStart.size(); i++) {
				Point s = vStart.elementAt(i); // 벡터에 들어있는 시작점 알아내기
				Point e = vEnd.elementAt(i); // 벡터에 들어있는 끝점 알아내기

				// 시작점에서 끝점까지 선 그리기
				g.drawLine((int) s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
			}
		}
	}
}