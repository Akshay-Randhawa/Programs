class FinalClasslevelDataMember
{
final int y=20;
public static void main(String[] args)
{
FinalClasslevelDataMember f = new FinalClasslevelDataMember();
final int x= 10;
//f.y=f.y+20;//error
System.out.println(x);
System.out.println(f.y);
}
}