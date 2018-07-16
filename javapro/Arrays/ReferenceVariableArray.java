import java.util.*;
class ReferenceVariableArray
{
void show(int b[][])
{
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b[i].length;j++)
{
System.out.println(b[i][j]);
}
}
}
public static void main(String[] args)
{
ReferenceVariableArray a[] = new ReferenceVariableArray[10];
for(int i=0;i<a.length;i++)
{
a[i]=new ReferenceVariableArray();
}
for(int i=0;i<a.length;i++)
{
a[i].show(new int[][]{{10,20,30},{10,20,30,40},{10,20,30,40}});
}
}
}