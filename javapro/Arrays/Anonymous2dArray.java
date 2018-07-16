import java.util.*;
class Anonymous2dArray
{
void show(int a[][])
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.println(a[i][j]);
}
}
}
public static void main(String[] args)
{
Anonymous2dArray a = new Anonymous2dArray();
a.show(new int[][]{{10,20,30},{10,20,30,40},{10,20,30,40}});
}
}

