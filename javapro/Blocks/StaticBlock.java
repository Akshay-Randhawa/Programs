class StaticBlock
{
static int x;
static int y;
static
{
x=20;
try
{
int y=System.in.read();
}
catch(Exception e)
{
}
}
}
class StaticClassOne
{
public static void main(String args[])
{
System.out.println(StaticBlock.x);
System.out.println(StaticBlock.y);
}
}
class StaticClassTwo
{
public static void main(String args[])
{
System.out.println(StaticBlock.x);
System.out.println(StaticBlock.y);
}
}