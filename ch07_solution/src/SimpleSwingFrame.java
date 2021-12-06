
import java.awt.*;

class NorthPanel extends Panel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY); // ���� ����
		setLayout(new FlowLayout());
		add(new Button("Open")); // ���� �гο� ��ư ����
		add(new Button("Read")); // ���� �гο� ��ư ����
		add(new Button("Close")); // ���� �гο� ��ư ����	 
	}
}


class CenterPanel extends Panel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CenterPanel() {
//		setLayout(null); 
		Label a = new Label("Java"); 
//		a.setSize(100,20);
//		a.setLocation(120, 50); 
		add(a); 
	}		
}

public class SimpleSwingFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SimpleSwingFrame() {
		super("���빮�� 2"); // Ÿ��Ʋ
		add(new NorthPanel(), BorderLayout.NORTH); 
		add(new CenterPanel(), BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
		
	static public void main(String[] arg) {
		new SimpleSwingFrame();
	}
}
