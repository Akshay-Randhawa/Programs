interface MyString
{
void show();
}
class  InterfaceString implements MyString
{
public void show()
{
System.out.println("Show");
}
public String toString()
{
return"Hello";
}
public static void main(String[] args)
{
MyString m =new InterfaceString();
String s = m.toString();
System.out.println(s);
}
}