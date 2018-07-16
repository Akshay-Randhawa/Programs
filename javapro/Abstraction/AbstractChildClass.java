abstract class Parent
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}
abstract void display();
void register(Parent p)
{
display();
}
}
class AbstractChildClass extends Parent
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}
void display()
{
System.out.println("Display");
}
public static void main(String[] args)
{
AbstractChildClass a = new AbstractChildClass();
a.get(10,20);
a.show();
a.register(a);
}
}
