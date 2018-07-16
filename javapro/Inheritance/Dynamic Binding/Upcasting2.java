class UpBase
{
void show()
{
System.out.println("Base");
}
}
class Upcasting2 extends UpBase
{
void show()
{
System.out.println("Child");
}
void display()
{
System.out.println("Display");
}
public static void main(String[] args)
{
UpBase u = new Upcasting2();
u.show();
u.display();
}
}
