interface My
{
int x=10;
}
interface Myy
{
int x=20;
}
class  FinalStaticInterface2 implements My,Myy
{
public static void main(String[] args)
{
//System.out.println(x);
System.out.println(My.x);
System.out.println(Myy.x);
//x=x+10;
}
}