class Base
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}
}
class Simple extends Base
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}
public static void main(String[] args)
{
Simple s =new Simple();
s.get(10,20);
s.show();
}
}