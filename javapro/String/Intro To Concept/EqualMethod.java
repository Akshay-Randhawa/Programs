/*boolean equals(object o)
{
t1==t2;
}*/
class EqualMethod
{
public static void main(String[] args)
{
EqualMethod e1 = new EqualMethod();
EqualMethod e2 = new EqualMethod();
boolean b = e1.equals(e2);
System.out.println(b);
}
}