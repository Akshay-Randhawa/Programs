import java.io.*;
class SetIn
{
public static void main (String[] args)throws IOException
{
FileInputStream fin = new FileInputStream("abc.txt");
System.setIn(fin);
int x =System.in.read();
System.out.println(x);
}
}
