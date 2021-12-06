
import java.awt.*;
import javax.swing.JFrame;

public class MyBorderLayoutFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public MyBorderLayoutFrame() {
		super("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5, 7));
		add(new Button("坷弗率"), BorderLayout.EAST);
		add(new Button("哭  率"), BorderLayout.WEST);
		add(new Button("合  率"), BorderLayout.NORTH);
		add(new Button("巢  率"), BorderLayout.SOUTH);
		add(new Button("吝  居"), BorderLayout.CENTER);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyBorderLayoutFrame();
	}
}
