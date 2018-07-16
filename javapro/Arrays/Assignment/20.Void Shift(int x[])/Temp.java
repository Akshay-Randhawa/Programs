import java.util.*;
class Temp
{
static void shift(int b[])
{
int i;
int c[] = new int[b.length];
for(i=0;i<b.length;i++)
{
if(b[i]>0)
{
c[i]=b[i];
}
if(b[i]<0)
{
c[i]=b[i];
}
}
for(i=0;i<c.length;i++)
{
System.out.println(c[i]);
}
}
public static void main(String[] args)
{
System.out.println("Enter The Size Of The Array");
int size = new Scanner(System.in).nextInt();
int a[] = new int[size];
System.out.println("Enter the Value of the Array");
for(int i=0;i<a.length;i++)
{
a[i]=new Scanner(System.in).nextInt();
}
shift(a);
}
}
