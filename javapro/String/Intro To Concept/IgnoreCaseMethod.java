class IgnoreCaseMethod
{
public static void main(String[] args)
{
String e1 = "HELLO";
String e2 = new String("hello");
boolean b = e1.equalsIgnoreCase(e2);
System.out.println(b);
}
}