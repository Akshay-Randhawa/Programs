import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
class ChatApp 
{
 JFrame jf;
 JLabel jl,jl1,jl2;;
 JTextField jtf;
 JTextArea jta,jta1;
 JButton jenter,jsend ;
 JScrollPane jsp,jsp1;
 ChatApp()
 {
  jf=new JFrame("chat box");
  jf.setLayout(null);
  jl=new JLabel("enter name ");
  jl.setBounds(10,20,130,25);
  jtf=new JTextField();
  jtf.setBounds(80,20,230,25);
  jenter=new JButton(" login");
  jenter.setBounds(350,20,100,25);
  jta=new JTextArea();
  jta.setBounds(80,80,230,300);
  jta1=new JTextArea();
  jta1.setBounds(350,80,150,200);
  jl1=new JLabel("Chat box");
  jl2=new JLabel("client connected");
  jl1.setBounds(80,40,60,60);
  jl2.setBounds(350,40,100,60);
  jf.add(jl2);
  jf.add(jl1);
  jf.add(jta1);
  jf.add(jta);
  jf.add(jenter);
  jf.add(jl);
  jf.add(jtf);
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  jf.setSize(550,550);
  jf.setVisible(true);
 }
public static void main(String [] args)
{
 new ChatApp();
 
}
}
