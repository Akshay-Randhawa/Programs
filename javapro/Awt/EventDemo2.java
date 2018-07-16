import java.awt.*;
import java.awt.event.*;
class EventDemo2 implements ActionListener
{
 Frame f;
 Button b1,b2;
 TextField tf;
 EventDemo2(String s)
{
 f=new Frame(s);
 b1=new Button("ok");
 b2=new Button("cancel");
 b1.setBounds(20,100,40,40);
 b2.setBounds(80,100,40,40);
 Outer o = new Outer(this);
 b1.addActionListener(o);
 b2.addActionListener(this);
 f.add(b1);
 f.add(b2);
 tf=new TextField();
 tf.setBounds(20,40,100,40);
 f.add(tf);
 f.setLayout(null);
 f.setSize(400,400);
 f.setVisible(true);
}
 public void actionPerformed(ActionEvent e)
{
 if (e.getSource()==b1)
 tf.setText("ok");
 if (e.getSource()==b2)
 {
  tf.setText("cancle");
 }
}
public static void main(String args[])
{
	
 new EventDemo2("Randhawa");
 
}
}
class Outer implements ActionListener
{
	EventDemo2 f;
	Outer(EventDemo2 f)
	{
		this.f=f;
		System.out.println(f);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==f.b1)
 f.tf.setText("Lallu");
 if (e.getSource()==f.b2)
 {
  f.tf.setText("Rabari");
 }
}
}

 
 