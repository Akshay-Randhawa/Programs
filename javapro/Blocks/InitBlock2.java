class InitBlock2
{
int x;
//init block
{
x=10;//this.x=10; not Compulsory
System.out.println("Init Block");
}
InitBlock2()
{
System.out.println(x);
System.out.println("Default");
}
InitBlock2(int x)
{
System.out.println(x);
}
//init block;
{
System.out.println("Init Block Second");
}
public static void main(String[] args)
{
new InitBlock2();
new InitBlock2(20);
}
}
