import java.io.*;
class DataStream
{
public static void main(String args[])throws IOException
{
FileOutputStream fout = new FileOutputStream("Ducat.txt");
DataOutputStream dout = new DataOutputStream(fout);
dout.writeInt(10);
dout.writeLong(10l);
dout.writeBoolean(true);
dout.writeDouble(10.9);
dout.close();
FileInputStream fin = new FileInputStream("Ducat.txt");
DataInputStream din = new DataInputStream(fin);
int i=din.readInt();
long l = din.readLong();
boolean b = din.readBoolean();
double d = din.readDouble();
System.out.println(i);
System.out.println(l);
System.out.println(b);
System.out.println(d);
}
}