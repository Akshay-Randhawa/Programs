import java.util.*;
import java.io.*;
class Demo
{
	int div(int x, int y)throws ArithmeticException
	{
		return x/y;
	}
}
class ThrowsIntro
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		Demo d = new Demo();
		int r = d.div(a,b);
		System.out.println(r);
	}
	}
	