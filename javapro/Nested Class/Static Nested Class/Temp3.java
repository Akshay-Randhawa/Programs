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
class Temp3 extends Outer.Inner
{
public static void main(String[] args)
{
Temp3 i = new Temp3();
i.show();
}
}
