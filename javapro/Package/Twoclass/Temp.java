package p1;

class Temp1
{
Temp1()
{
System.out.println("Temp 1");
}
}
class Temp2
{
Temp2()
{
System.out.println("Temp 2");
}
}
class Temp
{
void show()
{
System.out.println("Temp");
}
public static void main(String[] args)
{
Temp t=new Temp();
t.show();
new Temp2();
new Temp1();
}
}