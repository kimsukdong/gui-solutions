
import java.awt.*;
import javax.swing.*;

public class CalculatorFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CalculatorFrame() {
		super("���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new SouthPanel(), BorderLayout.SOUTH);
		add(new Cp(), BorderLayout.CENTER);
		add(new Np(), BorderLayout.NORTH);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CalculatorFrame();
	}

}

class SouthPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SouthPanel() {
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout()); // JPanel�� ����Ʈ�� FlowLayout������, Ȯ���� �ϱ� ����
		add(new JLabel("��� ���"));
		add(new JTextField(15));
	}
}
class Cp extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b [] = { new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/") };
	public Cp() {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(4,4,5,5)); // GridLayout ��ġ������
		for(int i=0; i<10; i++) {
			JButton b = new JButton(Integer.toString(i));
			add(b);
		}
		add(new JButton("CE"));
		add(new JButton("���"));

		for(int i=0; i<b.length; i++) {
			b[i].setBackground(Color.CYAN);
			add(b[i]);
		}
	}
}
class Np extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Np() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout()); // JPanel�� ����Ʈ�� FlowLayout������, Ȯ���� �ϱ� ����		
		add(new JLabel("�����Է�"));
		add(new JTextField(16));
	}
}
