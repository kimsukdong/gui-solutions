import java.awt.*;
import javax.swing.*;

public class TenColorButtonFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	public TenColorButtonFrame(){
		setTitle("Ten Color Buttons Frame");
		GridLayout grid = new GridLayout(1, 10);
		JButton [] btn = new JButton [10];
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY}; 
		setLayout(grid);
		grid.setHgap(5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setBackground(color[i]);
			add(btn[i]);
		}

		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args){
		new TenColorButtonFrame();
	}
}