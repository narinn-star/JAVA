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
		setTitle("�޴��� ��� �̹��� �ε��ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		panel = new MyPanel();
		setContentPane(panel);
		
		setSize(400, 400);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("����");
		JMenuItem openItem = new JMenuItem("����");
		
		openItem.addActionListener(new OpenActionListener());		
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	
	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;
		
		public OpenActionListener() {
			chooser = new JFileChooser(); //���� ���̾�α� ����
		}
		
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"JPG Images", "jpg");
			
			chooser.setFileFilter(filter); //���� ���̾�α׿� ���� ���� ����
			
			int ret = chooser.showOpenDialog(null);
			if(ret == JFileChooser.APPROVE_OPTION) {
				String filePath = chooser.getSelectedFile().getPath(); //���� ��θ� ����
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