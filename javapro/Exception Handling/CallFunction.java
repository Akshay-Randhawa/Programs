class CallFunction
{
static int show()
{
try
{
return 20;
}
catch(Exception e)
{
System.out.println(e);
System.out.println(e);
}
finally
{
System.exit(0);
int x=10/0;
return 40;
}
}
public static void main (String[] args)
{
int x= show();
System.out.println(x);
}
}