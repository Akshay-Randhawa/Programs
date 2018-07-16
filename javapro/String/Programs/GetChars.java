class GetChars
{
public static void main(String[] args)
{
String str1 = new String ("Welcome To Tutuorial Of String");
char[] str2=new char[7];
char c [] = str1.toCharArray();
try
{
str1.getChars(2,9,str2,0);
System.out.println("Cp = ");
for(int i=0;i<str2.length;i++)
{
System.out.print(str2[i]);
System.out.print("   ");
}
System.out.println("   ");
for(int i=0;i<c.length;i++)
{
System.out.print(c[i]);
}
}
catch(Exception e)
{
System.out.println("Raised Exception");
}
}
}