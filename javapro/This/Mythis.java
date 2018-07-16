class Mythis
{
int x=10;
void get(Mythis this,int y)
{
System.out.println(this+"get");
System.out.println(this.x);
System.out.println(x);
System.out.println(y);
}
public static void main(String[] args)
{
Mythis m=new Mythis();
System.out.println(m+"main");
m.get(16);
}
}