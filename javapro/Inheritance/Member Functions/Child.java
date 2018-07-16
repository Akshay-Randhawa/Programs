class Father
{
A show()
{
System.out.println("Father");
return new A();
}
}
class Child extends Father
{
B show()
{
System.out.println("Child");
return new B();
}
public static void main(String[] args)
{
Child c = new Child();
c.show();
}
}
class A
{
}
class B extends A
{
}