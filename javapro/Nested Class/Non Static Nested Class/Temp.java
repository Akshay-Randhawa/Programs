class Outer
{
int x=10;
static int y=20;
class Inner
{
int x=50;
void show()
{
System.out.println(x);//local Variable
System.out.println(y);
}
}
}
class Temp extends Outer
{
public static void main(String[] args)
{
Temp o = new Temp();
Temp.Inner i = o.new Inner();
i.show();
}
}