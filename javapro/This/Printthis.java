class Printthis
{
int x=10;
void show(int x)//(int x,Printthis this) background
{
System.out.println(this);
System.out.println(this.x);
System.out.println(x);
}
public static void main(String[] args)
{
Printthis p = new Printthis();
System.out.println(p);
p.show(20);//(20,p) background
System.out.println(p.x);
}
}