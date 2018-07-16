import java.io.*;
class MultiResourceExample
{
private static void printFileJava()throws IOException
{
try(FileInputStream input = new FileInputStream("File.txt");BufferedInputStream bufferInput = new BufferedInputStream(input))
{
int data = bufferInput.read();
while(data!=-1)
{
System.out.println((char)data);
data = bufferInput.read();	
}
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main (String[] args)throws IOException
{
printFileJava();
}
}