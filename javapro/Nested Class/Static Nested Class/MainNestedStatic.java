class Outer
{
int x=10;
static int y=20;
static class MainNestedStatic
{
static void show()
{
//System.out.println(x);//error
System.out.println(y);
}
public static void main(String[] args)
{
System.out.println(y);
MainNestedStatic.show();
}
}
}