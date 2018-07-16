class B1
{
final int x;
B1(int z)
{
//System.out.println(x);
x=z;
System.out.println(x);
}
public static void main(String[] args)
{
B1 b = new B1(10);
//b.x=6000;//error
B1 b2 = new B1(100);
}
}