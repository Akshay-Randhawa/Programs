class Super
{
int x=10;
}
class SuperThis extends Super
{
int y =20;
void show()
{
System.out.println(super.x);
System.out.println(y);
System.out.println(x);
System.out.println(y);
System.out.println(this.x);
System.out.println(y);
}
public static void main(String[] args)
{
SuperThis s =new SuperThis();
s.show();
}
}