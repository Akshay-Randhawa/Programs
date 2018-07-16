class Thisconstructor
{
int salary =15000;
Thisconstructor()
{
System.out.println(this+" "+"Contructor");
//if want put return;
}
public static void main(String[] args)
{
Thisconstructor t = new Thisconstructor();
System.out.println(t+" "+"Main");
}
}

