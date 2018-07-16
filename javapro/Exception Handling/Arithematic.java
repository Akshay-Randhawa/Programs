class Arithematic
{
public static void main(String[] args)
{
try
{
int x=10/0;
System.out.println(x);
}
catch(ArithmeticException e)
{ 
}
System.out.println("This will be Printed");
}
}
