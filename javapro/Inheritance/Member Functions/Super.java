class BaseSuper
{
void show()
{
System.out.println("BaseSuper");
}
}
class Super extends BaseSuper
{
void show()
{
System.out.println("Super");
super.show();
}
public static void main(String[] args)
{
Super s = new Super();
s.show();
}
}