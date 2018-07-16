import java.awt.*;
class MyFrame extends Frame
{
MyFrame(String s)
{
super(s);
setSize(400,800);
setVisible(true);
}
public static void main(String[] args)
{
	new MyFrame("FF");
	new MyFrame("Sf");
}
}