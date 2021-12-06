
import java.awt.*;
import javax.swing.JFrame;

public class MyBorderLayoutFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public MyBorderLayoutFrame() {
		super("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5, 7));
		add(new Button("������"), BorderLayout.EAST);
		add(new Button("��  ��"), BorderLayout.WEST);
		add(new Button("��  ��"), BorderLayout.NORTH);
		add(new Button("��  ��"), BorderLayout.SOUTH);
		add(new Button("��  ��"), BorderLayout.CENTER);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyBorderLayoutFrame();
	}
}
