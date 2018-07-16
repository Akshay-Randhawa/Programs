class Overtwo
{
static void show()
{
System.out.println("This is Blank");
}
static void show(byte b)
{
System.out.println(b);
}
static void show(int i)
{
System.out.println(i);
}
static void show(short s)
{
System.out.println(s);
}
static void show(long l)
{
System.out.println(l);
}
static void show(float f)
{
System.out.println(f);
}
static void show(double d)
{
System.out.println(d);
}
static void show(char c)
{
System.out.println(c);
}
public static void main(String[] args)
{
show('R');
show((double)1000000);
show(10000L);
show((short)1000);
show(100);
show((byte)10);
show();
}
}