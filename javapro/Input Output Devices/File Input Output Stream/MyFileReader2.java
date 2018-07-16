import java.io.*;
class MyFileReader2
{
public static void main(String args[])throws IOException
{
FileInputStream fr =new FileInputStream("lallu.txt");
byte b[] = new byte[fr.available()];
System.out.println(b);
fr.read(b);
String s = new String(b);
System.out.println(b);
}
}