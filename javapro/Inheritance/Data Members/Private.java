class BasePrivate
{
private int x=10;
void show()
{
System.out.println(x);
}
}
class Private extends BasePrivate
{
public static void main(String[] args)
{
BasePrivate b =new BasePrivate();
b.show();
}
}