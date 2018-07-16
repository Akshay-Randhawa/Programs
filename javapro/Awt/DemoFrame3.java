import java.awt.*;
class DemoFrame3
{
	Frame f;
	TextField tf;
	Button b;
	Label l;
	DemoFrame3(String s)
	{
		f=new Frame(s);
		l = new Label("Enter The No.");
		l.setBounds(40,100,100,50);
		f.add(l);
		tf = new TextField();
		tf.setBounds(40,150,60,30);
		f.add(tf);
		b = new Button("OK");
		b.setBounds(40,200,60,30);
		f.add(b);
	    Toolkit t = f.getToolkit();
		Dimension screensize = t.getScreenSize();
		int width = screensize.width*8/10;
		int height = screensize.height*8/10;
		f.setBounds(width/8,height/8,width,height);
		//f.setBounds(400,200,600,400);
		f.setLayout(null);
		f.setVisible(true);
	
	}
	public static void main(String[] args)
	{
		new DemoFrame3(" ");
	}
}