
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class ActionEventEx4 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton b1,b2,b3;
	JTextField t1;
	JTextField t2;
	public ActionEventEx4()
	{
		setSize(400,200);
		setLayout(new BorderLayout());
		setTitle("마일<->킬로미터로 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel pg1=new JPanel();
		JPanel pg2=new JPanel();
		
		pg1.setLayout(new BorderLayout());
		pg2.setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("거리를 입력하시오");
		JLabel label2=new JLabel("마일->미터로 변환 버튼 ");
		JLabel label3=new JLabel("미터->마일로 변환 버튼 ");
		
		t1=new JTextField(5); 
		t2=new JTextField(25);
		t2.setEditable(false);
		
		b1=new JButton("변환1");
		b2=new JButton("변환2");
		b3=new JButton("종료");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		t1.setText("1");
		
		t2.setEditable(false);
		p1.add(label1);
		p1.add(t1);
		p2.add(label2);
		p2.add(b1);
		p3.add(label3);
		p3.add(b2);
		p4.add(t2);
		p4.add(b3);

		pg1.add(p1,BorderLayout.NORTH);
		pg1.add(p2,BorderLayout.CENTER);
		pg2.add(p3,BorderLayout.CENTER);
		pg2.add(p4,BorderLayout.SOUTH);
		
		add(pg1,BorderLayout.NORTH);
		add(pg2,BorderLayout.SOUTH);

		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
		{
		String m;
		m=e.getActionCommand();
		if(e.getSource() == b3) {
			System.exit(0);
		}
		if(m.equals("변환1"))
		{
			int t=Integer.parseInt(t1.getText());
			double k=t*1.609344;
			int j = (int)(k*100.0);
			k=j/100.0;
			t2.setText(t+" 마일은 "+k+" 킬로미터입니다.");
		}else if(m.equals("변환2"))
		{
			int t=Integer.parseInt(t1.getText());
			double k=t/1.609344;
			int j = (int)(k*100.0);
			k=j/100.0;
			t2.setText(t+" 킬로미터는 "+k+" 마일입니다.");
		}

		}


	public static void main(String[] arge)
	{
		new ActionEventEx4();
	}
}
