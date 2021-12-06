import java.awt.*;
import javax.swing.*;

public class PanelEx2 extends JFrame {
	private static final long serialVersionUID = 1L;
	public PanelEx2(){
//		Frame f = new Frame("Panel Test");
		super("Panel Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		setLayout(new GridLayout(2,1));
		p1.setBackground(Color.red);
		p2.setBackground(Color.yellow);

		p1.add(new JButton("»¡°­»ö"));
		p2.add(new JButton("³ë¶û»ö"));
		add(p1);
		add(p2);

		setSize(300, 800);
		setVisible(true);
	}
	public static void main(String[] args){
		new PanelEx2();
	}
}
