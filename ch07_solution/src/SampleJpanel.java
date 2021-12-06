import java.awt.*;

class Panel1 extends Panel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Panel1() {
		setBackground(Color.LIGHT_GRAY); // 배경색 설정
		setLayout(new GridLayout(3,1));
		add(new Button("Open")); // 현재 패널에 버튼 부착
		add(new Button("Read")); // 현재 패널에 버튼 부착
		add(new Button("Close")); // 현재 패널에 버튼 부착	 
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
		super("실습 예제"); // 타이틀

		setLayout(new GridLayout(1,2));
		add(new Panel1()); // Panel1을 프레임의 첫번째 영역에 부착한다.
		add(new Panel2()); // Panel2을 프레임의 두번째 영역에 부착한다.
		setSize(300,200);
		setVisible(true);
	}
		
	static public void main(String[] arg) {
		new SampleJpanel();
	}
}
