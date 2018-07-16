interface InterBody2
{
public default void show()
{
System.out.println("Show");
}
}
class MainBodyInterface implements InterBody2
{
public void show()
{
System.out.println("Show From Main");
}
public static void main(String[] args)
{
InterBody2 i = new MainBodyInterface();
i.show();
}
}