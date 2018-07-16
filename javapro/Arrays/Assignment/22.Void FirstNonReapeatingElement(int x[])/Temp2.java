import java.util.*;
class Temp2
{
static void firstNonReapeatingElement(int b[])
{
int i,j,f=0;
for(i=0;i<b.length-1;i++)
{
for(j=0;j<b.length;j++)
{

if(b[i]!=b[j])
{
f=1;
break;
}
else
{

f=0;

}
if(f==1)
{
System.out.println("first non repeating element is "+b[i]);
}
}

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
firstNonReapeatingElement(a);
}
}
