import java.util.*;
class Temp
{
void mergesort(int x[],int y[])
{
int z[]= new int[x.length+y.length];
for(int i=0;i<x.length;i++)
{
z[i]=x[i];
}
int v = y.length;
for(int i=x.length;i<z.length;i++)
{
z[i]=y[y.length-v];
v--;
}
sort(z);
}
void sort(int c[])
{
int s;
for(int  i =0 ; i<c.length-1;i++)
{
for(int j=i+1;j<c.length;j++)
{
if(c[i]>c[j])
{
s =c[i];
c[i]=c[j];
c[j]=s;
}
}
}
System.out.println("Sorted list");
for(int i =0 ; i<c.length;i++)
{
System.out.println(c[i]);
}
}
public static void main(String[] args)
{
Temp t = new Temp();
System.out.println("Enter The Size Of The  First Array");
int size = new Scanner(System.in).nextInt();
int a[] = new int[size];
System.out.println("Enter the Value of the First Array");
for(int i=0;i<a.length;i++)
{
a[i]=new Scanner(System.in).nextInt();
}
System.out.println("Enter The Size Of The Second Array");
int size2 = new Scanner(System.in).nextInt();
int b[] = new int[size2];
System.out.println("Enter the Value of the First Array");
for(int i=0;i<b.length;i++)
{
b[i]=new Scanner(System.in).nextInt();
}
t.mergesort(a,b);
}
}
