interface MyFirst
{
void show();
}
interface MySecond
{
void display();
//void show();
}
class TwoInterface implements MyFirst,MySecond
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
class Tworegister
{
public void register(MyFirst m,MySecond m2)
{
m.show();
m2.display();
}
public static void main(String[] args)
{
TwoInterface t = new TwoInterface();
Tworegister m = new Tworegister();
m.register(t,t);
}
}