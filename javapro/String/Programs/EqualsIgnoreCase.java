class EqualsIgnoreCase
{
public static void main(String[] args)
{
String str1 = new String("This is really not Immutable");
String str2 = str1;
String str3 = new String("This is really not immutable");
String str4 = new String("This is Really not Immutable");
boolean retVal;
retVal= str1.equals(str2);
System.out.println(retVal);
retVal= str1.equals(str3);
System.out.println(retVal);
retVal= str1.equalsIgnoreCase(str4);
System.out.println(retVal);

}
}