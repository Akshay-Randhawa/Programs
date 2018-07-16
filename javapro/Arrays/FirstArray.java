import java.util.*;
import java.io.*;
class FirstArray
{
public static void main(String[] args)
{

System.out.println("This is first Array Pro");
int a[] = new int[10];
System.out.println(a);
System.out.println(a.getClass().getName());
System.out.println(a.length);
int i;
for(i=0;i<a.length;i++)
{
a[i] = i+1;
}
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
for(i=0;i<a.length;i++)
{
a[i]=new Scanner(System.in).nextInt();
}
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}