package Chapter08;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.lang.NullPointerException;

public class FileRead_FileDialog extends JFrame {
	JLabel la = new JLabel("파일 - 열기에서 텍스트 파일을 열기 - appended.txt 파일에 저장");
	
	public FileRead_FileDialog() {
		super("File Dialog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		
		add(la);
		setSize(400, 400);
		setVisible(true);
	}
	
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("파일");
		JMenuItem item = new JMenuItem("열기");
		menu.add(item);
		mb.add(menu);
		setJMenuBar(mb);
		
		item.addActionListener(new ActionListener() {
			private JFileChooser chooser = new JFileChooser();

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileNameExtensionFilter filter = new FileNameExtensionFilter("텍스트 파일(*.txt)", "txt");
					chooser.setFileFilter(filter);
					
					int ret = chooser.showOpenDialog(null);
					if(ret != JFileChooser.APPROVE_OPTION) {
						JOptionPane.showMessageDialog(null, "파일을 선택해주세요", "경고", JOptionPane.WARNING_MESSAGE);
					}
					String path = chooser.getSelectedFile().getPath();
					
					FileReader fr = new FileReader(path);
					FileWriter fw = new FileWriter("images/appended.txt", true);
					
					int c;
					while((c = fr.read()) != -1)
						fw.write((char)c);
					fr.close();
					fw.close();
					System.out.println("저장 완료");
				} catch(IOException ee) {
					System.out.println("오류");
				} catch(NullPointerException eee) { }
			}
		});
	}

	public static void main(String[] args) {
		new FileRead_FileDialog();
	}

}
