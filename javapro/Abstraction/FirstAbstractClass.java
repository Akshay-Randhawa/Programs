abstract class Base
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}
abstract void display();
}
class FirstAbstractClass extends Base
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
FirstAbstractClass f = new FirstAbstractClass();
f.get(10,20);
f.show();
f.display();
}
}
