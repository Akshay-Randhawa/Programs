class ConstructorChaining2
{
ConstructorChaining2()
{
System.out.println("Default");
}
ConstructorChaining2(int x)
{
this();
System.out.println(x);
}
ConstructorChaining2(int x,int y)
{
this(10);
System.out.println(x+y);
}
public static void main(String[] args)
{
new ConstructorChaining2(10,20);
}
}