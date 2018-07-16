class Classone
{
static void  call()
{
System.out.println("Hello Class One");
}
}
class Classtwo
{
public static void main (String... s)//arg just a name can be change and also (String... s) is allowed 
{
Classone.call();
System.out.println("Hello Class Two");
}
}