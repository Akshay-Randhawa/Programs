class MainFinal
{
final void show()
{
System.out.println("Base");
}
}
class Final extends MainFinal
{
 void show()
{
System.out.println("Child");
}
public static void main(String[] args)
{
Final f= new Final();
f.show();
}
}
