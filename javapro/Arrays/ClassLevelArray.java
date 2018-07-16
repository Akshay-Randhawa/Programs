import java.util.*;
class ClassLevelArray
{
int a[];
public static void main(String[] args)
{
System.out.println("Enter the size of array");
int size=new Scanner(System.in).nextInt();
ClassLevelArray c= new ClassLevelArray();
c.a=new int[size];
System.out.println("Enter the Value of array");
for(int i=0;i<c.a.length;i++)
{
c.a[i]=new Scanner(System.in).nextInt();
}
for(int z:c.a)
{
System.out.println(z);
}
}
}

