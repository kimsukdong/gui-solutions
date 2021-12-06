import java.awt.*;

class Panel1 extends Panel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Panel1() {
		setBackground(Color.LIGHT_GRAY); // ���� ����
		setLayout(new GridLayout(3,1));
		add(new Button("Open")); // ���� �гο� ��ư ����
		add(new Button("Read")); // ���� �гο� ��ư ����
		add(new Button("Close")); // ���� �гο� ��ư ����	 
	}
}

class Panel2 extends Panel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Panel2() {
				
		Label a = new Label("Java", Label.CENTER); 
		setLayout(new BorderLayout());
		add(a, BorderLayout.CENTER); 
	}		
}

public class SampleJpanel extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SampleJpanel() {
		super("�ǽ� ����"); // Ÿ��Ʋ

		setLayout(new GridLayout(1,2));
		add(new Panel1()); // Panel1�� �������� ù��° ������ �����Ѵ�.
		add(new Panel2()); // Panel2�� �������� �ι�° ������ �����Ѵ�.
		setSize(300,200);
		setVisible(true);
	}
		
	static public void main(String[] arg) {
		new SampleJpanel();
	}
}
