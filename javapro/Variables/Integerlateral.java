class Integerlateral
{ 
static void show(byte b)
{
System.out.println("Byte ="+b);
}
static void show(short s)
{
System.out.println("Short ="+s);
}
static void show(int i)
{
System.out.println("Int ="+i);
}
static void show(long l)
{
System.out.println("Long ="+l);
}
public static void main(String[] args)
{
show(10);
show(1000000000L);
show((byte)(20));
show((short )(240));
}
}