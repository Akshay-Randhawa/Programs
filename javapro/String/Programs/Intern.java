class Intern
{
public static void main(String[] args)
{
String str1 = new String ("Welcome To Tutuorial");
String str2 = new String ("welcome TO TUTORIAL OF STRING");
System.out.println("Canonical Representation");
System.out.println(str1.intern(str2));
System.out.println("Canonical Representation");
System.out.println(str2.intern());
}
}