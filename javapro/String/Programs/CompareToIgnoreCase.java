class CompareToIgnoreCase
{
public static void main (String[] args)
{
String str1 = "STRINGS ARE IMMUTABLE";
String str2 = "strings are immutable";
String str3 = "Integers Are Not Immutable";
int result1 = str1.compareTo(str2);
System.out.println("CompareTo = " + result1);
int result2 = str1.compareToIgnoreCase(str2);
System.out.println("CompareToIgnoreCase = " + result2);
int result3 = str2.compareToIgnoreCase(str3);
System.out.println("CompareToIgnoreCase = " + result3);
int result4 = str3.compareToIgnoreCase(str1);
System.out.println("CompareToIgnoreCase = " + result4);

}
}