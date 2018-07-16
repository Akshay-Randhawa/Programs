import java.util.*;
class Temp
{
void sort(int b[])
{
int s;
for(int i =0 ; i<b.length-1;i++)
{
for(int j=i+1;j<b.length;j++)
{
if(b[i]>b[j])
{
s =b[i];
b[i]=b[j];
b[j]=s;
}
}
}
System.out.println("Sorted list");
for(int i =0 ; i<b.length;i++)
{
System.out.println(b[i]);
}
}
public static void main(String[] args)
{
Temp t = new Temp();
System.out.println("Enter The Size Of The Array");
int size = new Scanner(System.in).nextInt();
int a[] = new int[size];
System.out.println("Enter the Value of the Array");
for(int i=0;i<a.length;i++)
{
a[i]=new Scanner(System.in).nextInt();
}
t.sort(a);
}
}
