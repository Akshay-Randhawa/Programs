class Referencevariable
{
String name;
public static void main (String[] args)
{
Referencevariable r1 = new Referencevariable();
System.out.println(r1);
r1.name="lalu";
System.out.println(r1.name+"via r1");
Referencevariable r2 = r1;
System.out.println(r2);
System.out.println(r2.name+"via r2");
r2.name ="bhalu";
System.out.println(r1.name+"via r1");
if(r1==r2)
{
System.out.println("Same");
}
}
}