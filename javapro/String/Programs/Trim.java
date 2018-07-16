class Trim
{
public static void main(String[] args)
{
String str = new String ("       Welcome To Tutuorial Of String      ");
System.out.println(str);
System.out.println("BeforeTrim"+str.length());
System.out.println("Return Value");
String z=str.trim();
System.out.println("After Trim " +z.length());

}
}