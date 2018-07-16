class StaticBlockDemo
{
static StaticDemo s;
static
{
s=new StaticDemo();
}
}
class StaticDemo
{
void show(int x)
{
System.out.println(x);
}
}
class StaticBlockClasses
{
public static void main(String args[])
{
StaticBlockDemo.s.show(10);
}
}