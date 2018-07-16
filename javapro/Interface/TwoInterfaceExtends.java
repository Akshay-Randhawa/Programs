interface Inter
{
void show();
}
interface Inter2 extends Inter
{
void display();
//void show();
}
class InterfaceExptends implements Inter2
{
public void show()
{
System.out.println("Show");
}
public void display()
{
System.out.println("Display");
}
}
class TwoInterfaceExtends
{
public void register(Inter2 i)
{
i.show();
i.display();
}
public static void main(String[] args)
{
InterfaceExptends e = new InterfaceExptends();
TwoInterfaceExtends t = new TwoInterfaceExtends();
t.register(e);
}
}