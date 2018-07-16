import java.util.*;
class AnonymousArray
{
void show(int a[])
{
for(int z:a)
System.out.println(z);
}
public static void main(String[] args)
{
AnonymousArray a = new AnonymousArray();
a.show(new int[]{10,20,30});
}
}

