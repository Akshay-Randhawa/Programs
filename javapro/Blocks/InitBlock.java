class InitBlock
{
//init block
{
System.out.println("Init Block");
}
InitBlock()
{
System.out.println("Default");
}
InitBlock(int x)
{
System.out.println(x);
}
//init block;
{
System.out.println("Init Block Second");
}
public static void main(String[] args)
{
new InitBlock();
new InitBlock(10);
new InitBlock();

}
}
