import java.awt.*;
import java.awt.event.*;
class EventDemo4 implements ActionListener
{
 Frame f;
 Button b1,b2;
 TextField tf;
 EventDemo4(String s)
{
 f=new Frame(s);
 b1=new Button("ok");
 b2=new Button("cancel");
 b1.setBounds(20,100,40,40);
 b2.setBounds(80,100,40,40);
 b1.addActionListener(this);
 b2.addActionListener(this);
 f.add(b1);
 f.add(b2);
 tf=new TextField();
 tf.setBounds(20,40,100,40);
 tf.addKeyListener(new KeyEventListener());
 f.add(tf);
 f.setLayout(null);
 f.setSize(400,400);
 f.setVisible(true);
 f.addWindowListener(new WindowEventListner ());
f.addMouseListener(new MouseEventListener(this));
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
 new EventDemo4("Randhawa");
}
}
class WindowEventListner extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
class MouseEventListener extends MouseAdapter
	{
		EventDemo4 t;
		MouseEventListener(EventDemo4 t)
	{
		this.t=t;
	}
	public void mouseClicked(MouseEvent e)
	{
		t.tf.setText("Mouse Event");
		t.f.setBackground(Color.RED);
	}
	}
	class KeyEventListener extends KeyAdapter
	{
		public void keyTyped(KeyEvent e)
		{
			System.out.println(e.getKeyChar());
		}
	}
	
 
 