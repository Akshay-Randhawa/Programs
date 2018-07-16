class UpBase
{
void show()
{
System.out.println("Base");
}
}
class Upcasting extends UpBase
{
void show()
{
System.out.println("Child");
}
public static void main(String[] args)
{
UpBase u = new Upcasting();
u.show();
}
}
