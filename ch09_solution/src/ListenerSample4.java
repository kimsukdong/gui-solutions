import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerSample4 extends JFrame {
	JButton btn1, btn2;
	JPanel pnl;
	JLabel lbl;
	MyActionListener4 listener;
		
	ListenerSample4() {
		setTitle("Action�̺�Ʈ  ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnl = new JPanel();
		
		btn1 = new JButton("��ũ");
		listener = new MyActionListener4(pnl); 
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
		new ListenerSample4 ();
	}
}
	
	class MyActionListener4 implements ActionListener { 
		JPanel jj;
		public MyActionListener4(JPanel jj) {
			this.jj = jj;
		}
		public void actionPerformed(ActionEvent e) { 
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("��ũ"))
				jj.setBackground(Color.PINK);
			if(btn.getText().equals("���"))
				jj.setBackground(Color.GREEN);
		}
	}



