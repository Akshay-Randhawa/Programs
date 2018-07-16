import java.util.*;
class Demo
{
int x=10;
int y=20;
public void finalize () throws Throwable
{
System.out.println("Jawan Sha");
}
static void show()
{
Demo d1 = new Demo();
display();
}
static void display()
{
Demo d2 = new Demo();
}
}
class FinalizeMethod3
{
public static void main(String[] args)
{
for(int i=1;i<=2000;i++)
{
new Demo();
}
}
}