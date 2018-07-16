class EndsWith
{
public static void main(String[] args)
{
String str = new String("This is really not Immutable");
boolean retVal;
retVal= str.endsWith("Immutable");
System.out.println(retVal);
retVal= str.endsWith("Table");
System.out.println(retVal);
}
}