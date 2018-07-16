class ContentEquals
{
public static void main(String[] args)
{
String str1 = "Not Immutable";
String str2 = "Strings Are Immutable";
StringBuffer str3 = new StringBuffer("Not Immutable");
boolean result = str1.contentEquals(str3);
System.out.println("ContentEquals = " + result);
result = str2.contentEquals(str3);
System.out.println("ContentEquals = " + result);
}
}