import java.util.*;
class Temp
{
static void firstNonReapeatingElement(int b[])
{
int i,j,d=0,count =0;
outer:
for(i=0;i<b.length;i++)
{
for(j=0;j<b.length;j++)
{
if(i!=j)
{
if(b[i]==b[j])
{
count = count +1;
}
}
}
if(count==0)
{
d=b[i];
break outer;
}
count=0;
}
System.out.print("The First Non Reapeating Element is =  ");
System.out.println(d);
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
firstNonReapeatingElement(a);
}
}
