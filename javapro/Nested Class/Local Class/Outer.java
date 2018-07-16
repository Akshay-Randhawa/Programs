class Outer
{
int x=10;
static int y=20;
void display()
{
class Inner
{
void show()
{
System.out.println(x);
System.out.println(y);
}
}
Inner i = new Inner();
i.show();
}
public static void main(String[] args)
{
Outer o = new Outer();
o.display();
}
}