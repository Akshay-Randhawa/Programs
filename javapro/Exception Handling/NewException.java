class NewException
{
public static void main(String[] s)
{
try
{
int x=10/s.length;
System.out.println(x);
int z[] = new int[s.length];
z[10]=1000;
}
catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
{
System.out.println(e+"jajajaja");
}
catch(Exception e)//OneExceptionForAll
{
System.out.println(e);
}
catch(Error e)
{
System.out.println(e);
}
catch(Throwable e)
{
System.out.println(e);
}
}
}
