class ParaCons
{
int x;
int y;
ParaCons (int x, int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String[] args)
{
ParaCons p= new ParaCons(10,20);
p.show();
ParaCons p2= new ParaCons(100,200);
p2.show();
}
}