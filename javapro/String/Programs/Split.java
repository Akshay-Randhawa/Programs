class Split
{
public static void main(String[] args)
{
int i;
String str = new String ("Welcome-To-Tutuorial-Of-String");
System.out.println("Return Value");
String s[] = str.split("-",2);
for(i=0;i<s.length;i++)
{
System.out.println(s[i]);
}
System.out.println("   ");
System.out.println("Return Value");
s = str.split("-",3);
for(i=0;i<s.length;i++)
{
System.out.println(s[i]);
}
System.out.println("   ");
System.out.println("Return Value");
s= str.split("-",0);
for(i=0;i<s.length;i++)
{
System.out.println(s[i]);
}
System.out.println("   ");
System.out.println("Return Value");
s= str.split("-");
for(i=0;i<s.length;i++)
{
System.out.println(s[i]);
}
}
}