class Intern
{
public static void main (String args[])
{
String s1 = new String("Hello");//heap
String s2 = s1.intern();//pool
String s3 =new String ("Hello");
String s4 = s3.intern();
if(s2==s4)
{
System.out.println("Same");
}
}
}