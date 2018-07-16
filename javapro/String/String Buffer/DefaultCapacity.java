class DefaultCapacity
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity());
System.out.println(sb.length());
sb.append("Hello");
sb.append("Hey");
}
}