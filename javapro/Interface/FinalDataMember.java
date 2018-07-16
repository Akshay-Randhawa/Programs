class FinalDataMember
{
 int y=20;
public static void main(String[] args)
{
final int x= 10;
//x=x+20;//error
System.out.println(x);
final FinalDataMember f = new FinalDataMember();
//error//f = new FinalDataMember(); 
}
}