
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
		setTitle("체중 계산");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	//	JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
	//	JPanel p4=new JPanel();		
		JPanel pg=new JPanel(new GridLayout(2,3));		

		s1 = new JLabel("키 는?");
		s2 = new JLabel("체중은?");
		s3 = new JLabel(" 결과 출력 ");
		s4 = new JLabel(" cm ");
		s5 = new JLabel(" kg ");
		
		t1=new JTextField(10); 
		t2=new JTextField(10); 
		
		b1=new JButton("체중 계산");
	
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
				s3.setText("저체중입니다.");
			}
			else if(weight == stand){
				s3.setBackground(Color.GREEN);
				s3.setText("표준 체중입니다.");
				}
			else{
				s3.setBackground(Color.RED);
				s3.setText("과체중입니다.");
				}
			}
		}


	public static void main(String[] arge)
	{
		new ActionEventEx6();
	}
}
