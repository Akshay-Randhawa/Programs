 import java.util.*;
class Demo
{
static Demo z;
int x=10;
int y=20;
public void finalize () throws Throwable
{
z=this;
System.out.println(x);
System.out.println(y);
}
static void show()
{
Demo d1 = new Demo();
display();
}
static void display()
{
System.out.println(z.x);
}
}
class UnreachableObject
{
public static void main(String[] args)
{
for(int i=1;i<=2000;i++)
{
new Demo();
}
}
}