import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx1{

	public PanelEx1(){
		JFrame f = new JFrame("Panel Test");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		f.setLayout(new GridLayout(2,1));
		p1.setBackground(Color.red);
		p2.setBackground(Color.yellow);
		
		f.add(p1);
		f.add(p2);

		f.setSize(200, 400);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new PanelEx1();
	}
}
