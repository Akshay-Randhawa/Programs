//Study Only
import java.awt.*;
class ButtonEvent
{
	Button b;
	Button Event (Button b)
	{
		this.b=b;
	}
	public ButtongetSource()
	{
		return b;
	}
}
interface ButtonListner
{
	public void clicked(ButtonEvent bl);
}
	
	class Button
{
	ButtonListner bl;
	public void register(ButtonListner bl)
	{
		this.bl=bl;
	}
	public void execute()
	{
		ButtonEvent bl = new ButtonEvent(this);
		b1.clicked();
	}
}

class EventHandling3Steps implements ButtonListner
{
	Frame f;
	Button b,b1;
	TextField tf;
	ButtonExample be =  new ButtonExample();
	EventHandling3Steps(String s)
	{
		f = new Frame(s);
		tf= new TextField();
		tf.setBounds(40,150,60,30);
		f.add(tf);
		b = new Button("ok");
		b.setBounds(40,200,60,30);
		b.register(this);
		b1 = new Button("Cancel");
		b1.setBounds(40,200,60,30);
		b1.register(this);
		f.add(b1);
		f.setLayout(null);
		f.setSize(400,100);
		f.setVisible(true);
	}
	public void clicked(ButtonEvent bl)
	{
		if(bl.getSource()==b)
		{
			tf.setText("Hello");
		}
		if(bl.getSource()==b1)
		{
			tf.setText("Cancel");
	}
	}
public static void main(String[] args)
{
	new EventHandling3Steps("Randhawa");
}	
}