interface InterBodyOne
{
public default void show()
{
System.out.println("Show From Body One");
}
}
interface InterBodyTwo extends InterBodyOne
{
public default void show()
{
System.out.println("Show From Body Two");
}
}
class TwoBodyInterface implements InterBodyTwo
{
public void show()
{
System.out.println("Show From Main");
}
public static void main(String[] args)
{
InterBodyTwo i = new TwoBodyInterface();
i.show();
}
}