import java.io.*;
class Ps1
{
public static void main (String[] args)throws IOException
{
FileOutputStream fout = new FileOutputStream("abc.txt");
PrintStream ps = new PrintStream(fout);
ps.println("hey");
ps.println("hello");
System.out.println("File Created");
}
}
