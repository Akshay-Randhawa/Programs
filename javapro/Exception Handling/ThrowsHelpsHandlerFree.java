import java.util.*;
import java.io.*;
class Demo
{
	int div()throws ArithmeticException,IOException
	{
		int a= System.in.read();
		int b= System.in.read();
		int z=a/b;
		return z;
	}
}
class ThrowsHelpsHandlerFree 
{
	public static void main (String[] args)throws IOException
	{
     	Demo d = new Demo();
		int r = d.div();
		System.out.println(r);
	}
	}
	