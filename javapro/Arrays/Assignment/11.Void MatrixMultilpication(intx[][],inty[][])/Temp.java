import java.util.*;
class Temp
{
static void matrixMulti(int x[][],int y[][])
{
int i,j,k;
int z[][]=new int[x.length][x.length];
for(i=0;i<z.length;i++)
{
for(j=0;j<z.length;j++)
{
z[i][j]=0;
for(k=0;k<z.length;k++)
{
z[i][j]=z[i][j]+x[i][k]*y[k][j];
}
}
}
System.out.println ("Matrix One  ");
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("  ");
}
System.out.println("  ");
}
System.out.println("Matrix Second  ");
for(i=0;i<y.length;i++)
{
for(j=0;j<y[i].length;j++)
{
System.out.print(y[i][j]);
System.out.print("  ");
}
System.out.println("  ");
}
System.out.println("Matrix Multiplication ");
for(i=0;i<z.length;i++)
{
for(j=0;j<z[i].length;j++)
{
System.out.print(z[i][j]);
System.out.print("  ");
}
System.out.println("  ");
}
}
public static void main(String[] args)
{
int size,i,j;
System.out.println("Enter The Size Of  Arrays");
size=new Scanner(System.in).nextInt();
int a[][]= new int[size][size];
int b[][] = new int [size][size];
System.out.println("Enter the Elements of the First Array");
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
a[i][j]=new Scanner(System.in).nextInt();
}
}
System.out.println("Enter the Elements of the Second Array");
for(i=0;i<b.length;i++)
{
for(j=0;j<b[i].length;j++)
{
b[i][j]=new Scanner(System.in).nextInt();
}
}
matrixMulti(a,b);
}
}