package Chapter14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class imageLoad extends JFrame {
	private ImageIcon icon;
	private Image img;
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	public imageLoad() {
		super("메뉴로 배경 이미지 로딩하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu();
		
		MyPanel panel = new MyPanel();
		setContentPane(panel);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	public void menu() {
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("파일");
		JMenuItem open = new JMenuItem("열기");
		
		mb.add(file);
		open.addActionListener(new OpenActionListener());
		file.add(open);
		setJMenuBar(mb);
	}
	
	class OpenActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif"); 
			chooser.setFileFilter(filter); 
			
			int ret = chooser.showOpenDialog(null);
			if(ret == JFileChooser.APPROVE_OPTION) {
				String pathName = chooser.getSelectedFile().getPath(); 	//완전 경로명
				icon = new ImageIcon(pathName);
				img = icon.getImage();
				repaint();
			}
			
		}
	}

	public static void main(String[] args) {
		new imageLoad();
	}
}