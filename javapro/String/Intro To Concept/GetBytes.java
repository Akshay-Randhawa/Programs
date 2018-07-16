class GetBytes
{
public static void main (String args[])
{
String s = new String("Randhawa");
byte b[] = s.getBytes();
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);
}
}
}