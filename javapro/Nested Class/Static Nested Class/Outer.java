class Outer
{
int x=10;
static int y=20;
static class Inner
{
void show()
{
//System.out.println(x);//error
System.out.println(y);
}
}
public static void main(String[] args)
{
System.out.println(y);
Inner i = new Inner();
i.show();
}
}