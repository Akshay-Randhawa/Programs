import java.util.*;
class Temp
{
int mini(int b[][])
{
int m=b[0][0];
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b[i].length;j++)
{
if(m>b[i][j])
{
m =b[i][j];
}
}
}
return m;
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
int find = t.mini(a);
System.out.println("Minimum value in Array ="+find);
}
}
