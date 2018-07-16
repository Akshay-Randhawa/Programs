import java.io.*;
class UncheckedExceptions
{
	void show()
	{
		int x=10/0;
	}
	void display()
	{
		show();
	}
	void xyz()
	{
		display();
	}
	public static void main(String args[])
	{
		UncheckedExceptions u = new UncheckedExceptions();
		try
		{
			u.xyz();
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
		e.printStackTrace();
		}
		
	}
}
	