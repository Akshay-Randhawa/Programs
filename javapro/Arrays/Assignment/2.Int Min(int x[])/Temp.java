import java.util.*;
class Temp
{
int mini(int b[])
{
int m=b[0];
for(int i =0 ; i<b.length;i++)
{
if(m>b[i])
{
m =b[i];
}
}
return m;
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
int find = t.mini(a);
System.out.println("Minimum value in Array ="+find);
}
}
