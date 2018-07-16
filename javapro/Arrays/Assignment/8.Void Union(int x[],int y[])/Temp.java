import java.util.*;
class Temp
{
void union(int x[],int y[])
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
int u[] = new int[z.length];
int k=0,count =0;
//int num =u[0];
for(int i=0;i<z.length;i++)//z array
{
for(int j=0;j<u.length;j++)
{
if(z[i]==u[j])
{
count = count +1;
}
}
if(count ==0)
{
u[k]=z[i];
k++;
}
count=0;
}
System.out.println("Union");
for(int j=0;j<u.length;j++)
{
System.out.print(u[j]);
System.out.print(",");
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
t.union(a,b);
}
}
