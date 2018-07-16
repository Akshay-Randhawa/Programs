class Defaultvalue
{
byte b;
short s;
int i;
long l;
float f;
double d;
char c;
boolean n;
void show()
{
System.out.println("Byte ="+" "+b);
System.out.println("Short ="+" "+s);
System.out.println("Int ="+" "+i);
System.out.println("Long ="+" "+l);
System.out.println("Float ="+" "+f);
System.out.println("Double ="+" "+d);
System.out.println("Character ="+" "+c);
System.out.println("Boolean ="+" "+n);
}
public static void main(String arg[])
{
Defaultvalue d= new Defaultvalue();
d.show();
}
}
