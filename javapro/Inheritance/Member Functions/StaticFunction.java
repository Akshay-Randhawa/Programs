class Static
{
static void show()
{
System.out.println("Base");
}
}
class StaticFunction extends Static
{
static void show()
{
System.out.println("Child");
}
public static void main(String[] args)
{
StaticFunction s= new StaticFunction();
s.show();
}
}
