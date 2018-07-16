class Defaultcons
{
int x,y;
Defaultcons()
{
x = 10;
y = 20;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String[] args)
{
Defaultcons d1 =new Defaultcons();
d1.show();
Defaultcons d2 =new Defaultcons();
d2.show();
}
}