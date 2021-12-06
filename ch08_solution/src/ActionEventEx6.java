
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class ActionEventEx6 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton b1;
	JTextField t1,t2,t3;
	JLabel s1,s2,s3,s4,s5;

	public ActionEventEx6()
	{
		setSize(300,200);
		setLayout(new BorderLayout());
		setTitle("ü�� ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	//	JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
	//	JPanel p4=new JPanel();		
		JPanel pg=new JPanel(new GridLayout(2,3));		

		s1 = new JLabel("Ű ��?");
		s2 = new JLabel("ü����?");
		s3 = new JLabel(" ��� ��� ");
		s4 = new JLabel(" cm ");
		s5 = new JLabel(" kg ");
		
		t1=new JTextField(10); 
		t2=new JTextField(10); 
		
		b1=new JButton("ü�� ���");
	
		b1.addActionListener(this);		

		pg.add(s1);
		pg.add(t1);
		pg.add(s4);
		
		pg.add(s2);
		pg.add(t2);
		pg.add(s5);

		p2.add(b1);

		p3.add(s3);

		add(pg,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
		{
		int height,weight;
		if(e.getSource()==b1) {
			height = Integer.parseInt(t1.getText());
			weight = Integer.parseInt(t2.getText());
			double stand = (height-100) * 0.9;
			s3.setOpaque(true);
			if(weight < stand) {
				s3.setBackground(Color.YELLOW);
				s3.setText("��ü���Դϴ�.");
			}
			else if(weight == stand){
				s3.setBackground(Color.GREEN);
				s3.setText("ǥ�� ü���Դϴ�.");
				}
			else{
				s3.setBackground(Color.RED);
				s3.setText("��ü���Դϴ�.");
				}
			}
		}


	public static void main(String[] arge)
	{
		new ActionEventEx6();
	}
}
