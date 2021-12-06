
import java.awt.*;
import javax.swing.*;

public class TenButtonFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	public TenButtonFrame(){
		setTitle("Ten Buttons Frame");
		GridLayout grid = new GridLayout(1, 10);

		setLayout(grid);
		grid.setHgap(5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton [] btn = new JButton [10];
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			add(btn[i]);
		}

		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args){
		new TenButtonFrame();
	}
}
