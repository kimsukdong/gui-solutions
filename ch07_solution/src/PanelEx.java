import java.awt.*;
import javax.swing.*;

public class PanelEx{

	public PanelEx(){
		JFrame f = new JFrame("Panel Test");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		p1.setBackground(Color.red);
  	p1.setSize(200, 200);
		f.add(p1);
		
		p2.setBackground(Color.green);
		p2.setSize(200, 200);
		f.add(p2);

		f.setSize(400, 200);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new PanelEx();
	}
}
