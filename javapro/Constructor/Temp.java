class Temp
{
void show()
{
System.out.println("Show");
}
Temp()
{
System.out.println("Default");
}
Temp(int x)
{
System.out.println(x);
}
public static void main (String[] args)
{
Temp t = new Temp();
t.show();
Temp t1 = new Temp(10);
}
}