import java.util.*;
class AdvanceLoop
{
public static void main (String[] args)
{
System.out.println("Enter the size of array");
int a[];
int x =new Scanner(System.in).nextInt();
a= new int[x];
System.out.println("Enter the Value in array");
int i;
for(i =0;i<a.length;i++)
{
a[i] = new Scanner(System.in).nextInt();
}
for(int z:a)
{
System.out.println(z);
}
}
}