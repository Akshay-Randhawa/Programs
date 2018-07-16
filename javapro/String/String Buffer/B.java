class B
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer();
System.out.println(sb.length());
System.out.println(sb.capacity());
StringBuffer sb1=sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
System.out.println("After Append");
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("q");
System.out.println("After Second Append");
System.out.println(sb.length());
System.out.println(sb.capacity());
}
}