import java.io.*;
class SetOutAndErr
{
public static void main (String[] args)throws IOException
{
FileOutputStream fout = new FileOutputStream("abc.txt");
PrintStream ps = new PrintStream(fout);
System.out.println("Hello");
System.setOut(ps);
System.out.println("Hey");
FileOutputStream fout1 = new FileOutputStream("xyz.txt");
PrintStream ps1 = new PrintStream(fout1);
System.err.println("Hello");
System.setErr(ps1);
System.err.println("Hey");
}
}
