interface My
{
void show();
}
class Outer2
{
int x=10;
static int y=20;
My display()
{
class Inner implements My
{
public void show()
{
System.out.println(x);
System.out.println(y);
}
}
Inner i = new Inner();
return i;
}
public static void main(String[] args)
{
Outer2 o = new Outer2();
My z=o.display();
z.show();
}
}