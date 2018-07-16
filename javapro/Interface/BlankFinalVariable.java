class BlankFinalVariable
{
final int x;
BlankFinalVariable(int x)
{
this.x=x;
}
public static void main(String[] args)
{
BlankFinalVariable b = new BlankFinalVariable(10);
System.out.println(b.x);
//b.x=b.x+10;//error
BlankFinalVariable b2 = new BlankFinalVariable(40);
System.out.println(b2.x);
}
}