class Format
{
public static void main(String[] args)
{
float floatVar=2.4f;
int intVar=10;
String stringVar="Hindustan";
System.out.printf("Float Variable = %f,Integer Variable = %d,String = %s",floatVar,intVar,stringVar);
String fs = String.format("Float Variable = %f,Integer Variable = %d,String = %s",floatVar,intVar,stringVar);
System.out.println("    ");
System.out.println(fs);
}
}