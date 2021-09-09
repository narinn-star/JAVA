package chapter14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
import javax.swing.*;

public class q14_02 extends JFrame {
	private MyPanel panel;
	ImageIcon icon;
	Image img;
	
	public q14_02() {
		setTitle("메뉴로 배경 이미지 로딩하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		panel = new MyPanel();
		setContentPane(panel);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
		JMenuItem openItem = new JMenuItem("열기");
		
		openItem.addActionListener(new OpenActionListener());		
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	
	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;
		
		public OpenActionListener() {
			chooser = new JFileChooser(); //파일 다이얼로그 생성
		}
		
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"JPG Images", "jpg");
			
			chooser.setFileFilter(filter); //파일 다이얼로그에 파일 필터 설정
			
			int ret = chooser.showOpenDialog(null);
			if(ret == JFileChooser.APPROVE_OPTION) {
				String filePath = chooser.getSelectedFile().getPath(); //파일 경로명 리턴
				icon = new ImageIcon(filePath + "/");
				img = icon.getImage();
				
				repaint();
			}
		}
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new q14_02();
	}
}