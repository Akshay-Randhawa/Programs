import java.io.*;
class DataStream
{
public static void main (String[] args)throws IOException
{
DataInputStream din = new DataInputStream(System.in); 
FileOutputStream fout = new FileOutputStream("Ducat4.txt");
DataOutputStream dout = new DataOutputStream(fout);
String s = " ";
while(!s.equals("stop"))
{
s =din.readLine();
System.out.println(s);
//dout.writeUTF(s);
//dout.writeBytes(s);
dout.writeChars(s);
dout.flush();
}
din.close();
}
}
