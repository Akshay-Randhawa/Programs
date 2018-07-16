class LastIndexOf
{
public static void main(String[] args)
{
String str = new String ("Welcome To Tutuorial");
String substr1 = new String ("Tutuorial");
String substr2 = new String ("Sutuorial");
System.out.print("Found Last Index = ");
System.out.println(str.lastIndexOf('o'));
System.out.print("Found Last Index = ");
System.out.println(str.lastIndexOf('o',10));
System.out.print("Found Last Index = ");
System.out.println(str.lastIndexOf(substr1));
System.out.print("Found Last Index = ");
System.out.println(str.lastIndexOf(substr1,15));
System.out.print("Found Last Index = ");
System.out.println(str.lastIndexOf(substr2));
}
}