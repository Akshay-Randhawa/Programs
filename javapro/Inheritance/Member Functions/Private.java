class Parent
{
public void show()
{
System.out.println("Parent");
}
}
class Private extends Parent
{
protected void show()
{
System.out.println("Child");
}
public static void main(String[] args)
{
Private p = new Private();
p.show();
}
}
