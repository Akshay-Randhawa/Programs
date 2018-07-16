class OuterDataShadowing
{
int x=10;
static int y=20;
class Inner
{
int x=50;
void show()
{
System.out.println(x);//local Variable
System.out.println(y);
}
}
public static void main(String[] args)
{
OuterDataShadowing o = new OuterDataShadowing();
System.out.println(o.x);
OuterDataShadowing.Inner i = o.new Inner();
i.show();
}
}