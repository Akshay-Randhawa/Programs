class Outer
{
int x=10;
static int y=20;
static class Inner
{
/*static optional */ void show()
{
//System.out.println(x);//error
System.out.println(y);
}
}
}
class Temp1
{
public static void main(String[] args)
{
Outer.Inner i = new Outer.Inner();
i.show();
}
}
