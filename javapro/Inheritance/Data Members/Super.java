class Parent
{
int x=10;
}
class Super extends Parent
{
int x =20;
void show()
{
System.out.println(super.x);
System.out.println(x);
}
public static void main(String[] args)
{
Super s =new Super();
s.show();
}
}