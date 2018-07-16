import java.util.*;
class Temp
{
void intersection(int x[],int y[])
{
int k=0,count=0;
int z [] = new int[x.length+y.length];
for(int i=0;i<x.length;i++)
{
for(int j=0;j<y.length;j++)
{
if(x[i]==y[j])
{
for(int e=0;e<z.length;e++)
{
if(x[i]==z[e])
{
count=count+1;
}
}
if(count==0)
{
z[k]=x[i];
k++;
}
count =0;
}
}
}
System.out.println("Intersection");
for(int i=0;i<z.length;i++)
{
System.out.print(z[i]);
System.out.print(" ");
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
System.out.println("Enter the Value of the Second Array");
for(int i=0;i<b.length;i++)
{
b[i]=new Scanner(System.in).nextInt();
}
t.intersection(a,b);
}
}
