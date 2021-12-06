

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class ActionEventEx5 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3;

	public ActionEventEx5()
	{
		setSize(350,200);
		setLayout(new BorderLayout());
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
	//	JPanel p3=new JPanel(new GridLayout(1,4,20,5));
		JPanel p4=new JPanel();
		JPanel pg1=new JPanel();
		JPanel pg2=new JPanel();
	
		pg1.setLayout(new BorderLayout());
		pg2.setLayout(new BorderLayout());

		JLabel label1=new JLabel("첫번째 수 : ");
		JLabel label2=new JLabel("두번째 수 : ");
		JLabel label3=new JLabel("연산식 : ");
		JLabel label4=new JLabel("수식 결과 : ");

		t1=new JTextField(10); 
		t2=new JTextField(10); 
		t3=new JTextField(20);
		
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		t3.setEditable(false);
		
		p1.add(label1);
		p1.add(t1);

		p2.add(label2);
		p2.add(t2);
	
		p3.add(label3);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		
		p4.add(label4);
		p4.add(t3);

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
		String m, result;
		m=e.getActionCommand();
		if(e.getSource()==b1) {
//		if(m.equals("+"))		{
				int k1=Integer.parseInt(t1.getText());
				int k2=Integer.parseInt(t2.getText());
				int k3 = k1+k2;
				result = k1 + " + " + k2 + " = " + k3;
				t3.setText(result);
			}else if(m.equals("-"))		{
				int k1=Integer.parseInt(t1.getText());
				int k2=Integer.parseInt(t2.getText());
				int k3 = k1-k2;
				result = k1 + " - " + k2 + " = " + k3;
				t3.setText(result);
			}if(m.equals("*"))		{
				int k1=Integer.parseInt(t1.getText());
				int k2=Integer.parseInt(t2.getText());
				int k3 = k1*k2;
				result = k1 + " * " + k2 + " = " + k3;
				t3.setText(result);
			}if(m.equals("/"))		{
				int k1=Integer.parseInt(t1.getText());
				int k2=Integer.parseInt(t2.getText());
				double k5 = (double)k1/k2;
				int k4 = (int)(k5*100.0);
				double k3 = k4/100.0;
				result = k1 + " / " + k2 + " = " + k3;
				t3.setText(result);
			}
		}


	public static void main(String[] arge)
	{
		new ActionEventEx5();
	}
}