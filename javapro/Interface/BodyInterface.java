interface InterBody
{
public default void show()
{
System.out.println("Show");
}
}
class BodyInterface implements InterBody
{
public static void main(String[] args)
{
InterBody i = new BodyInterface();
i.show();
}
}