import java.awt.*;
class MyFrame2 extends Frame
{
MyFrame2(String s)
{
Frame f = new Frame(s);
f.setSize(400,700);
f.setVisible(true);
}
public static void main(String[] args)
{
	new MyFrame("FF");
	new MyFrame("Sf");
}
}