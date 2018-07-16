import java.io.*;
class PrintStreamExample
{
public static void main (String[] args)throws IOException
{
FileOutputStream fout = new FileOutputStream("abc.txt");
PrintStream ps = new PrintStream(fout);
ps.println("hello");
ps.println("hey");
}
}
