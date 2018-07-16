class ComparsionPool
{
public static void main(String[] args)
{
Integer i1 = new Integer(10);
Integer i2 = new Integer(20);
boolean r = i1 == i2;
System.out.println(r);
Integer i3 = 127;//128
Integer i4 = 127;//128
r = i3 == i4;
System.out.println(r);
}
}