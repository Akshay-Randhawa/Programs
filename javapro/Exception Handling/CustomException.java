import java.util.*;
import java.io.*;
class AgeException extends Exception
{
AgeException(String s)
{
	super(s);
}
}
class CustomException
{
	int age;
	void get(int age)throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("Invalid age");
		}
		else
		{
			this.age=age;
		}
	}
public static void main (String[] args)
{
	CustomException c = new CustomException();
	try
	{
	c.get(10);
	}
	catch(AgeException e)
	{
		System.out.println(e);
	}
}
}
	