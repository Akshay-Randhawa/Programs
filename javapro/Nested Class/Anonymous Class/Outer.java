interface My
{
void show();
}
class Outer
{
int x=10;
static int y=20;
My display()
{
return
(
new My()
{
public void show()
{
System.out.println(x);
System.out.println(y);
}
}
);
}
public static void main(String[] args)
{
Outer o = new Outer();
My z=o.display();
z.show();
}
}