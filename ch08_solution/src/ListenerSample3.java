import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerSample3 extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton btn1, btn2;
	JPanel pnl;
	JLabel lbl;
	MyActionListener3 listener;
		
	ListenerSample3() {
		setTitle("Action이벤트  내부클래스 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnl = new JPanel();
		
		btn1 = new JButton("핑크");
		listener = new MyActionListener3(); //  클래스 호출
		btn1.addActionListener(listener);
		pnl.add(btn1);
		
		btn2 = new JButton("녹색");
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
			String cmd = e.getActionCommand();
			if(cmd.equals("핑크"))
				pnl.setBackground(Color.PINK);
			else if(cmd.equals("녹색"))
				pnl.setBackground(Color.GREEN);
		}
	}
}
