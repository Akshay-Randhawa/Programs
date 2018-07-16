import java.util.*;
class Temp
{
static void matrixtriangleBMin(int x[][])
{
int i,j,min=x[0][0];
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++)
{
if(i>=j)
{
if(x[i][j]<min)
{
min=x[i][j];
}
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
System.out.println("Min of Triangle B in Matrix = "+min);
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
matrixtriangleBMin(a);
}
}