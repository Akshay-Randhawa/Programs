class Datashadowing
{
int x=10;
void show(int x)
{
System.out.println(x);
System.out.println(x);
}
public static void main(String[] args)
{
Datashadowing d = new Datashadowing();
d.show(20);
}
}