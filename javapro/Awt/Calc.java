import java.awt.*;
import java.awt.event.*;
class Calc implements ActionListener
{
Frame f;
TextField tf;
Label q;
String pad[]={"CLEAR","7","4","1","0","DEL","8","5","2","%","9","6","3",".","/","*","-","+","="};
Button b[] = new Button[pad.length];
int n= 180;
int o= 180;
int p = 180;
int l =180;
String s1,s2,s3,s4,s5;
Calc(String s)
{
f= new Frame(s);
q= new Label("           RANDHAWA");
q.setForeground(Color.red);
q.setBounds(20,40,390,30);
q.setFont(new Font("Arial",Font.BOLD,30));
q.setBackground(Color.black);
f.add(q);
tf= new TextField();
tf.setBounds(20,80,390,80);
 tf.setBackground(Color.RED);
  tf.setFont(new Font("Arial", Font.BOLD, 20));
f.add(tf);

for(int i=0;i<pad.length;i++)
{
	if(i<4)
	{	
	b[i] = new Button(" "+pad[i]+" ");
	b[i].setBounds(20,n,100,60);
	b[i].setBackground(Color.RED);
	f.add(b[i]);
	b[i].addActionListener(this);
	n=n+50;
	}
	else if(i==4)
	{	
	b[i] = new Button(" "+pad[i]+" ");
	b[i].setBounds(20,390,190,50);
	b[i].setBackground(Color.RED);
	f.add(b[i]);
	b[i].addActionListener(this);
		}
	
	else if(i<9)
	{
	b[i] = new Button(" "+pad[i]+" ");
	b[i].setBounds(110,o,100,60);
	b[i].setBackground(Color.RED);
	f.add(b[i]);
	b[i].addActionListener(this);
	o=o+50;
	
	}
else if(i<14)
	{
	b[i] = new Button(" "+pad[i]+" ");
	b[i].setBounds(210,p,100,60);
	b[i].setBackground(Color.RED);
	f.add(b[i]);
	b[i].addActionListener(this);
	p=p+50;
	}
	else 
	{
	b[i] = new Button(" "+pad[i]+" ");
	b[i].setBounds(310,l,100,60);
	b[i].setBackground(Color.RED);
	f.add(b[i]);
	b[i].addActionListener(this);
	l=l+50;
	}
	}

f.setLayout(null);
f.setSize(430,480);
f.setVisible(true);
f.setBackground(Color.BLACK);
f.addWindowListener(new WindowEventListner ());
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b[1])
	{
		s1=tf.getText();
		s2="7";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[2])
	{
		s1=tf.getText();
		s2="4";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[3])
	{
		s1=tf.getText();
		s2="1";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[4])
	{
		s1=tf.getText();
		s2="0";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[6])
	{
		s1=tf.getText();
		s2="8";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[7])
	{
		s1=tf.getText();
		s2="5";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[8])
	{
		s1=tf.getText();
		s2="2";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[10])
	{
		s1=tf.getText();
		s2="9";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[11])
	{
		s1=tf.getText();
		s2="6";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[12])
	{
		s1=tf.getText();
		s2="3";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[0])
	{
		tf.setText("   ");
	}
	if(e.getSource()==b[5])
	{
		 String tex = tf.getText();
		 char del[]=tex.toCharArray();
del[del.length-1]='\0';
tf.setText(new String(del));		 	
	}
	if(e.getSource()==b[9])
	{
		s1=tf.getText();
		s2="%";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[13])
	{
		s1=tf.getText();
		s2=".";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[14])
	{
		s1=tf.getText();
		s2="/";
		s3=s1+s2;
		tf.setText(s3);
	
	}
	if(e.getSource()==b[15])
	{
		s1=tf.getText();
		s2="*";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[16])
	{
		s1=tf.getText();
		s2="-";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[17])
	{
		s1=tf.getText();
		s2="+";
		s3=s1+s2;
		tf.setText(s3);
	}
	if(e.getSource()==b[18])
	{
	}

public static void main(String[] args)
{
new Calc("Calculator");
}
}
class WindowEventListner extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
