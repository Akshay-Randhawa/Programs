import java.io.*;
class Base implements Serializable
{
int z;
}
class Emp extends Base implements Serializable
{
//private static final long serialVersionUID=1L;
transient int a;
static int b;
String name;
int age;
int salary;
Base b1=new Base();
Emp(String name,int age ,int a,int b,int z)
{
this.name=name;
this.age=age;
this.a=a;
this.b=b;
this.z=z;
}
}
class MyClient1
{
ObjectOutputStream dout;
MyClient1()
{
try
{
Emp e1 = new Emp("ducat noida ",1,5,20,100);
dout = new ObjectOutputStream(new FileOutputStream ("ducat3"));
dout.writeObject(e1);
dout.flush();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
new MyClient1();
}
}











