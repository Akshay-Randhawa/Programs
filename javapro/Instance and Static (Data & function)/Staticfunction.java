class Staticfunction
{
static int add(int x,int y)
{
return x+y;
}
public static void main (String[] args)
{
int z=add(10,20);
System.out.println(z);//Staticfunction.add(10,20); in other class
}
}