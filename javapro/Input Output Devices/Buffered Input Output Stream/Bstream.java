//import java.io.BufferedInputStream;
//import java.io.FileInputStream;
import java.io.*;
class Bstream
{
public static void main(String args[])throws IOException
{
String srcFile="D:\\javapro\\Input Output Devices\\Buffered Input Output Stream\\lallu.txt";
try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile)))
{
byte bytedata;
while((bytedata=(byte)bis.read())!=-1)
{
System.out.println((char)bytedata);
}
}
catch(Exception e2)
{
e2.printStackTrace();
}
}
}