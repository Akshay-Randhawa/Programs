class IndexOf
{
public static void main(String[] args)
{
String str = new String ("Welcome To Tutuorial");
String substr1 = new String ("Tutuorial");
String substr2 = new String ("Sutuorial");
System.out.print("Found Index = ");
System.out.println(str.indexOf('o'));
System.out.print("Found Index = ");
System.out.println(str.indexOf('o',5));
System.out.print("Found Index = ");
System.out.println(str.indexOf(substr1));
System.out.print("Found Index = ");
System.out.println(str.indexOf(substr1,15));
System.out.print("Found Index = ");
System.out.println(str.indexOf(substr2));
}
}