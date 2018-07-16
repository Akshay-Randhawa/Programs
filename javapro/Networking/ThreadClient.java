import java.io.*;
import java.net.*;
import java.util.*;
public class ThreadClient
{
Socket s;
DataInputStream din;
DataOutputStream dout;
public ThreadClient()
{
try
{
s= new Socket("localhost",10);
din = new DataInputStream(s.getInputStream());
dout = new DataOutputStream(s.getOutputStream());
clientChat();
}
catch(Exception e)
{
System.out.println(e);
}
}
public void clientChat()throws IOException
{
My m = new My(din);
Thread t1=new Thread(m);
t1.start();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1;
do
{
s1 = br.readLine();
dout.writeUTF(s1);
dout.flush();
}
while(!s1.equals("Stop"));
}
public static void main(String[] args)
{
new ThreadClient();
}
}
class My implements Runnable
{
DataInputStream din;
My(DataInputStream din)
{
this.din=din;
}
public void run()
{
String s2= " ";
do
{
try
{
s2=din.readUTF();
System.out.println(s2);
}
catch(Exception e)
{
}
}
while(!s2.equals("stop"));
}
}

