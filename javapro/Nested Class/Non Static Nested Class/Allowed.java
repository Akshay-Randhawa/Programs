class Allowed
{
int x=10;
void show()
{
System.out.println(x);
System.out.println(this.x);
System.out.println(Allowed.this.x);//allowed in nonstatic function
}
public static void main(String[] args)
{
Allowed a = new Allowed();
a.show();
}
}