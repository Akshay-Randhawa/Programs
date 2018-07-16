class Call
{
public static void main(String... s)
{
System.out.println("Call to Second Main");
}
}
class Callmain
{
public static void main(String[] args)
{
System.out.println("Call to First Main");
Call.main();
}
}