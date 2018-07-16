class B
{
final int x = getx();
int getx()
{
System.out.println(x+"via Get function");
return 10;
}
B()
{
System.out.println(this.x);
}
public static void main(String[] args)
{
new B();
}
}