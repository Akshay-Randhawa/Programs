import java.util.*;
class Temp
{
void sort(int b[][])
{
int s,y=0;
int x[]=new int [b.length*b.length];
for(int i =0 ; i<b.length;i++)
{
for(int j=0;j<b[i].length;j++)
{
x[y]=b[i][j];
y++;
}
}
for(int i =0 ; i<x.length-1;i++)
{
for(int j=i+1;j<x.length;j++)
{
if(x[i]>x[j])
{
s =x[i];
x[i]=x[j];
x[j]=s;
}
}
}
System.out.println("Sorted list");
for(int i =0 ; i<x.length;i++)
{
System.out.println(x[i]);
}
}
public static void main(String[] args)
{
Temp t = new Temp();
System.out.println("Enter The Size Of The 2 Dimensional Array ");
int size = new Scanner(System.in).nextInt();
int a[][] = new int[size][size];
System.out.println("Enter the Value of the Array");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j]=new Scanner(System.in).nextInt();
}
}
t.sort(a);
}
}
