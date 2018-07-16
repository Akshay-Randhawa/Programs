import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class MyEditor  implements ActionListener
{
JFrame jf;
JTextField jtf;
JLabel jl;
JTextArea jta,jta1;
JButton jbCompile,jbRun;
JScrollPane jsp,jsp1;
String str=" ";
String fname=" ";
String result=" ";
String result1=" ";
Runtime r;
MyEditor()
{
jf=new JFrame("My Editor");
jf.setLayout(null);
jl= new JLabel("Enter the Java Class Name");
jl.setBounds(20,20,130,25);
jtf = new JTextField();
jtf.setBounds(180,20,230,25);
jf.add(jtf);
jta = new JTextArea(50,50);
jta1=new JTextArea(50,50);
jta.addFocusListener(new MyFocusListener(this));
jta.setFont(new Font("Varinda",Font.PLAIN,15));
jta1.setFont(new Font("Varinda",Font.PLAIN,15));
jsp = new JScrollPane(jta);
jsp1=new JScrollPane(jta1);
jsp.setBounds(50,60,400,180);
jsp1.setBounds(50,340,400,180);
jf.add(jsp);
jf.add(jsp1);
jbCompile = new JButton("Compile");
jbRun = new JButton("Run");
jbCompile.setBounds(120,260,80,25);
jbRun.setBounds(300,260,80,25);
jf.add(jl);
r=Runtime.getRuntime();
jf.add(jbRun);
jf.add(jbCompile);
jbCompile.addActionListener(this);
jbRun.addActionListener(this);
jf.setSize(550,550);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==jbCompile)
{
str =" ";
if(!jtf.getText().equals(" "))
{
try
{
fname =jtf.getText().trim()+".java";
FileWriter fw = new FileWriter(fname);
String s1=jta.getText();
PrintWriter pw=new PrintWriter(fw);
pw.println(s1);
pw.flush();
Process error = r.exec("C:\\Program Files\\Java\\jdk-9.0.1\\bin\\javac.exe-d"+fname);
BufferedReader err= new BufferedReader(new InputStreamReader(error.getErrorStream()));
while(true)
{
String temp=err.readLine();
if(temp!=null)
{
result+=temp;
result+="\n";
}
else break;
}
if(result.equals(" "))
{
jta1.setText("Compilation Successful"+" "+fname);
err.close();
}
else
jta1.setText(result);
}
catch(Exception e1)
{
System.out.println(e1);
}
}
else
jta1.setText("Please Enter The Java Program Name");
}
else if(e.getSource()==jbRun)
{
int start = 0;
try
{
String fn = jtf.getText().trim();
Process p = r.exec("C:\\Program Files\\Java\\jdk-9.0.1\\bin\\java"+fn);
BufferedReader output= new BufferedReader(new InputStreamReader(p.getInputStream()));
BufferedReader error= new BufferedReader(new InputStreamReader(p.getErrorStream()));
while(true)
{
String temp=output.readLine();
if(temp!=null)
{
result+=temp;
result+="\n";
}
else
{
break;
}
}
while(true)
{
String temp=error.readLine();
if(temp!=null)
{
result1+=temp;
result1+="\n";
}
else
{
break;
}
}
output.close();
error.close();
jta1.setText(result+"\n"+result1);
}
catch(Exception e2)
{
System.out.println(e);
}
}
}
public static void main(String[] args)
{
new MyEditor();
}
}
class MyFocusListener extends FocusAdapter
{
MyEditor e;
MyFocusListener(MyEditor e)
{
this.e=e;
System.out.println("Focus Listener ="+e);
}
public void focusGained(FocusEvent fe)
{
String str = e.jtf.getText().trim();
e.jta.setText("public class"+" "+str+"\n{\n public static void main(String[] args)\n{\n"+"                               "+"\n}\n} ");
}
}