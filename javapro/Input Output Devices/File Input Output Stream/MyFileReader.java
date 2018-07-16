import java.io.*;
class MyFileReader
{
public static void main(String args[])throws IOException
{
FileInputStream fr =new FileInputStream("lallu.txt");
//FileInputStream fw =new FileInputStream(new File("D:\\javapro\\Input Output Devices\\lallu2.txt"));
int i=0;
int j=fr.read();
System.out.println(j);
while((i=fr.read())!=-1)
System.out.print((char)i);
System.out.print(i);
fr.close();

}
}