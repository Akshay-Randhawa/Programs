abstract class AbBase
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}
}
class SimpleAbstractClass extends AbBase
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}
public static void main(String[] args)
{
SimpleAbstractClass s = new SimpleAbstractClass();
s.get(10,20);
s.show();
}
}
