import java.io.*;
class ThrowExample
{
	int age;
	void get(int age)
	{
		if(age<18)
		{
			try
			{
				throw new ArithmeticException ("invalid age");
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			this.age=age;
		}
	}
	public static void main (String[] args)
	{
		ThrowExample t = new ThrowExample();
		t.get(10);
	}
}