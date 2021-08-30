package chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuAndColorChooserEx extends JFrame {
	private JLabel label = new JLabel("Hello");
	
	public MenuAndColorChooserEx() {
		setTitle("JColorChooserEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem colorMenuItem = new JMenuItem("Color");
		JMenu fileMenu = new JMenu("Text");
		
		//Color 메뉴 아이템에 Action 리스너 등록
		colorMenuItem.addActionListener(new MenuActionListener());
		
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	//Color 메뉴 아이템이 선택될 때 실행되는 Action 리스너
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand(); //메뉴 아이템의 이름 리턴
			if(cmd.equals("Color")) {//Color 메뉴아이템의 경우
				//컬러 다이얼로그를 출력하고 사용자가 선택한 색 알아오기
				Color selectedColor = JColorChooser.showDialog(null, "Color", Color.yellow);
				
				//취소 버튼을 누르거나 그냥 다이얼로그를 닫는 경우 selectedColor는 null
				if(selectedColor != null)
					label.setForeground(selectedColor);
			}
		}
	}

	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}
}