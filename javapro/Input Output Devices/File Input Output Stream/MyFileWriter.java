import java.io.*;
class MyFileWriter
{
public static void main(String args[])throws IOException
{
//FileOutputStream fw =new FileOutputStream("lallu.txt");//write mode
//FileOutputStream fw =new FileOutputStream("lallu.txt",true);
//FileOutputStream fw =new FileOutputStream(new File("D:\\javapro\\Input Output Devices\\lallu.txt"));
FileOutputStream fw =new FileOutputStream(new File("D:\\javapro\\Input Output Devices\\lallu2.txt"),true);
String s="India IS a Good Country556454";
byte ch[]= s.getBytes();
//fw.write(ch);
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);
fw.close();
System.out.println("File Created Sucessfully");
}
}