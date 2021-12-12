package Chapter14;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class MenuAndFileDialogEx extends JFrame {
	private JLabel image = new JLabel();
	
	public MenuAndFileDialogEx() {
		super("Menu와 FileChooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(image);
		createMenu();
		
		setSize(350, 200);
		setVisible(true);
	}
	
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("Open");
		menu.add(item);
		mb.add(menu);
		setJMenuBar(mb);
		
		item.addActionListener(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener{
		private JFileChooser chooser;
		
		public MyActionListener() {
			chooser = new JFileChooser();
		}
		
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
			chooser.setFileFilter(filter);
			
			int ret = chooser.showOpenDialog(null);
			
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
			String path = chooser.getSelectedFile().getPath();
			image.setIcon(new ImageIcon(path));
			pack();	//이미지의 크기에 맞추어 프레임 크기 조절
		}
	}

	public static void main(String[] args) {
		new MenuAndFileDialogEx();
	}
}