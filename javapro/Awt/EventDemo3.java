import java.awt.*;
import java.awt.event.*;
class EventDemo3 implements ActionListener
{
 Frame f;
 Button b1,b2;
 TextField tf;
 EventDemo3(String s)
{
 f=new Frame(s);
 b1=new Button("ok");
 b2=new Button("cancel");
 b1.setBounds(20,100,40,40);
 b2.setBounds(80,100,40,40);
 b1.addActionListener(this);
 b2.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e) 
 {
	 tf.setText("Inner ActionListner");
 }
 }
 );
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
 new EventDemo3("Randhawa");
}
}


 
 