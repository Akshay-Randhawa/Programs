import java.util.*;
class Temp
{
static void frequencyCount(int b[])
{
int i,j,count,max;
max=0;
for(i=0;i<b.length;i++)
{
 count=0;
for(j=0;j<b.length;j++)
{

if(b[i]==b[j])
{
 count++;
}
if(count>max)
{
 max=count;
}
}
}
System.out.print("The maximum Frequency is =  ");
System.out.println(max);
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
frequencyCount(a);
}
}
