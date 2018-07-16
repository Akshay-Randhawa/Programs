import java.util.*;
class Temp
{
static void matrixTranspose(int x[][])
{
int i,j,k;
System.out.println("Nomal Matrix");
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++)
{
System.out.print(x[i][j]);
System.out.print("  ");
}
System.out.println("  ");
}

System.out.println("Matrix Transpose ");
for(i=0;i<x.length;i++)
{
for(j=0;j<x[i].length;j++)
{
System.out.print(x[j][i]);
System.out.print("  ");
}
System.out.println("  ");
}
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
matrixTranspose(a);
}
}