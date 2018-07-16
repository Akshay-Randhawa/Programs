interface Inter
{
void show();
}
interface Inter2 extends Inter
{
void display();
//void show();
}
interface Inter3 extends Inter,Inter2 
{
void play();
}
class InterfaceInheritance implements Inter3
{
public void show()
{
System.out.println("Show");
}
public void display()
{
System.out.println("Display");
}
public void play()
{
System.out.println("Play");
}
}
class MultipleInheritanceInterface
{
public void register(Inter3 i)
{
i.show();
i.display();
i.play();
}
public static void main(String[] args)
{
InterfaceInheritance e = new InterfaceInheritance();
MultipleInheritanceInterface t = new MultipleInheritanceInterface();
t.register(e);
}
}