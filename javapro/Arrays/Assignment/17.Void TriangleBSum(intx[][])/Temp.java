import java.util.*;
class Temp
{
static void matrixtriangleBSum(int x[][])
{
int i,j,sum=0;
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++)
{
if(i>=j)
{
sum=sum+x[i][j];
}
}
}
System.out.println("Matrix");
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("  ");
}
System.out.println("  ");
}
System.out.println("Sum of Triangle B in Matrix = "+sum);
}
public static void main(String[] args)
{
int size,i,j;
System.out.println("Enter The Size Of  Array");
size=new Scanner(System.in).nextInt();
int a[][]= new int[size][size];
int b[][] = new int [size][size];
System.out.println("Enter the Elements of the  Array");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
a[i][j]=new Scanner(System.in).nextInt();
}
}
matrixtriangleBSum(a);
}
}