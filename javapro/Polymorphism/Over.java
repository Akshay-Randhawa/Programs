class Over
{
static void show()
{
System.out.println("This is Blank");
}
static void show(byte b)
{
System.out.println(b);
}
static void show(byte b ,int i)
{
System.out.println(b+" "+i);
}
static void show(byte b ,int i,short s)
{
System.out.println(b+" "+i+" "+s);
}
static void show(byte b ,int i,short s,long l)
{
System.out.println(b+" "+i+" "+s+" "+l);
}
static void show(byte b ,int i,short s,long l ,float f)
{
System.out.println(b+" "+i+" "+s+" "+l+" "+f);
}
static void show(byte b ,int i,short s,long l ,float f,double d)
{
System.out.println(b+" "+i+" "+s+" "+l+" "+f+" "+d);
}
static void show(byte b ,int i,short s,long l ,float f,double d,char c)
{
System.out.println(b+" "+i+" "+s+" "+l+" "+f+" "+d+" "+c);
}
public static void main(String[] args)
{
show((byte)10,100,(short)1000,10000L,100000f,1000000,'R');
show((byte)10,100,(short)1000,10000L,100000f,1000000);
show((byte)10,100,(short)1000,10000L,100000f);
show((byte)10,100,(short)1000,10000L);
show((byte)10,100,(short)1000);
show((byte)10,100);
show((byte)10);
show();
}
}