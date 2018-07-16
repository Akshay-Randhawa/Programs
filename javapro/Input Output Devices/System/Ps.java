import java.io.*;
class Ps
{
public static void main (String[] args)throws Exception
{
FileOutputStream fout = new FileOutputStream("Chachi.txt");
PrintStream ps = new PrintStream(fout);
FileOutputStream fout1 = new FileOutputStream("Chacha.txt",true);
PrintStream ps1 = new PrintStream(fout1);
System.out.println("Before");
PrintStream ps4 = System.out;
System.setOut(ps);
System.setErr(ps1);
System.out.println("Chachi 420");
System.out.println("Chachi 840");
System.err.println("Chacha 420");
System.err.println("Chacha 840");
//System.out=ps4;
System.setOut(ps1);
System.out.println("Chachi 420");
System.setOut(ps4);
ps4.println("After");
System.out.println("Via actual Out");
}
}
