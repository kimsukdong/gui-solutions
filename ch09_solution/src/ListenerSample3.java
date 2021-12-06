
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerSample3 extends JFrame {
	JButton btn1, btn2;
	JPanel pnl;
	JLabel lbl;
	MyActionListener3 listener;
		
	ListenerSample3() {
		setTitle("Action�̺�Ʈ  ����Ŭ���� ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnl = new JPanel();
		
		btn1 = new JButton("��ũ");
		listener = new MyActionListener3(); // ���� Ŭ���� ȣ��
		btn1.addActionListener(listener);
		pnl.add(btn1);
		
		btn2 = new JButton("���");
		btn2.addActionListener(listener);
		pnl.add(btn2);
		
		add(pnl);
		
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ListenerSample3 ();
	}
	
	class MyActionListener3 implements ActionListener { 
		public void actionPerformed(ActionEvent e) { 
			if(e.getSource()== btn1)
				pnl.setBackground(Color.PINK);
			else if(e.getSource()== btn2)
				pnl.setBackground(Color.GREEN);
		}
	}

} 
