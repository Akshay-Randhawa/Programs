class FinalStaticDataMember
{
final static int y=20;
public static void main(String[] args)
{
final int x= 10;
//error//y=y+20;
System.out.println(x);
System.out.println(y);
}
}