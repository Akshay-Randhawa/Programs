class StringCapacity
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Hello");
System.out.println(sb.capacity());
System.out.println(sb.length());
sb.append("Hello");
sb.append("Hey");
System.out.println(sb.length());
}
}