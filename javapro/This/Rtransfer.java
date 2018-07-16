class Rtransfer
{
int x=10;
void show(int x,Rtransfer r)
{
System.out.println(r.x);
System.out.println(x);
}
public static void main(String[] args)
{
Rtransfer r = new Rtransfer();
r.show(20,r);
}
}