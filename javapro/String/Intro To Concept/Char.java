class Char
{
public static void main (String args[])
{
char ch[]={'d','u','x','a','y'};
String s = new String(ch);
System.out.println(s);
String s2 = new String(ch,2,3);
System.out.println(s2);
byte b[] = {65,66,67,68,69,70};
String s3 = new String(b);
System.out.println(s3);
String s4 = new String(b,2,1);
System.out.println(s4);

}
}