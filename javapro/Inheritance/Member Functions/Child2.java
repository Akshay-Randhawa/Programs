class Father2
{
Father2 show()
{
System.out.println("Father");
return new Father2();
}
}
class Child2 extends Father2
{
Child2 show()
{
System.out.println("Child");
return new Child2();
}
public static void main(String[] args)
{
Child2 c = new Child2();
c.show();
}
}
