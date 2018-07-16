import java.util.*;
class InputValue2dArray
{
public static void main(String[] args)
{
int a[][]=new int[3][3];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j]=new Scanner(System.in).nextInt();
}
}
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.println(a[i][j]);
}
}
}
}

