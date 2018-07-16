class Showthis
{
int x=10;
void show(Showthis this,int x)//Want see 'this' then put it at first argument
{
System.out.println(this);
System.out.println(this.x);
System.out.println(x);
}
public static void main(String[] args)
{
Showthis s = new Showthis();
System.out.println(s);
s.show(20);//(20,s) background
System.out.println(s.x);
}
}