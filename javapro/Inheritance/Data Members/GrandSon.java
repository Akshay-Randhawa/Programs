class Father
{
int x=30;
}
class Son extends Father
{
int x=20;
}
class GrandSon extends Son
{
int x =10;
void show()
{
System.out.println(x);
System.out.println(super.x);
System.out.println(((Father)this).x);
System.out.println(((Son)this).x);
System.out.println(((GrandSon)this).x);
}
public static void main(String[] args)
{
GrandSon g =new GrandSon();
g.show();
System.out.println(((Father)g).x);
}
}