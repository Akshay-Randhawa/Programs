interface MyFirst
{
void show();
}
class First implements MyFirst
{
public void show()
{
System.out.println("Show");
}
}
class Myregister
{
public void register(MyFirst m)
{
m.show();
}
public static void main(String[] args)
{
First f = new First();
Myregister m = new Myregister();
m.register(f);
}
}