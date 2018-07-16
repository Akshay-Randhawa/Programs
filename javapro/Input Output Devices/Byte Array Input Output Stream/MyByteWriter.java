import java.io.*;
class MyByteWriter
{
public static void main(String[] args)throws IOException
{
ByteArrayOutputStream fw =new ByteArrayOutputStream();
String s = "India Is Great Country";
byte ch[] = s.getBytes();
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);
fw.writeTo(new FileOutputStream("raberi 11.txt"));
fw.writeTo(new FileOutputStream("raberi 12.txt"));
System.out.println(fw.toString()+"fw");
byte z[]=fw.toByteArray();
ByteArrayInputStream fr = new ByteArrayInputStream(z);
int i =0;
while((i = fr.read())!=-1)
System.out.println((char)i);
}
} 