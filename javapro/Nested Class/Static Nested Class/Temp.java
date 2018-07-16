class Outer
{
int x=10;
static int y=20;
static class Inner
{
static void show()
{
//System.out.println(x);//error
System.out.println(y);
}
}
}
class Temp
{
public static void main(String[] args)
{
Outer.Inner.show();
}
}
