
import java.awt.*;

class NorthPanel extends Panel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY); // 배경색 설정
		setLayout(new FlowLayout());
		add(new Button("Open")); // 현재 패널에 버튼 부착
		add(new Button("Read")); // 현재 패널에 버튼 부착
		add(new Button("Close")); // 현재 패널에 버튼 부착	 
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
		super("응용문제 2"); // 타이틀
		add(new NorthPanel(), BorderLayout.NORTH); 
		add(new CenterPanel(), BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
		
	static public void main(String[] arg) {
		new SimpleSwingFrame();
	}
}
