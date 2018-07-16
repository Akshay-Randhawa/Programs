class IfConditionInException
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
catch(Exception e)//OneExceptionForAll
{
if(e instanceOf ArithmeticException )
{ 
System.out.println(ArithmeticException);
}
if (e instanceOf ArrayIndexOutOfBoundsException )
{
System.out.println(ArrayIndexOutOfBoundsException);
}
}
}
}
