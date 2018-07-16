interface Temp2
{
void show();
}
class Temp
{
public void show()
{
System.out.println("Show");
}
}
class  InterfaceClass extends Temp implements Temp2
{
public static void main(String[] args)
{
Temp2 t = new InterfaceClass();
t.show();
}
}