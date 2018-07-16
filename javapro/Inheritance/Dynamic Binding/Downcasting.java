class DownBase
{
int x=50;
void show()
{
System.out.println("Base");
}
}
class Downcasting extends DownBase
{
int x=20;
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
DownBase d = new Downcasting();
d.show();
System.out.println(d.x);
Downcasting d2 =(Downcasting)d;
d2.display();
}
}
