class Shared
{
int x,y;
synchronized void show(String s ,int a)
{
x=a;
System.out.println("starting in method "+s+" "+x);
try
{
 Thread.sleep(2000);
}
catch(Exception e)
{
}
System.out.println("exit from method"+s+" "+x);
}
synchronized int add(int a,int b)
{
x=a;
y=b;
try
{ 
 Thread.sleep(2000);
}
catch(Exception e)
{
}
return x+y;
}
}
class CustomThread extends Thread 
{
 Shared s;
public CustomThread (Shared s ,String str)
{
 super (str);
 this.s=s;
start();
}
public void run()
{
 s.show(Thread.currentThread().getName(),10);
 //System.out.println("thread 1 sum of 10,20="s,add(10,20));
}
}
class CustomThread1 extends Thread 
{
 Shared s;
public CustomThread1 (Shared s ,String str)
{
 super (str);
 this.s=s;
start();
}
public void run()
{
 s.show(Thread.currentThread().getName(),20);
 //System.out.println("thread 2 sum of 100,200="s,add(100,200));
}
}
class CustomThread2 extends Thread 
{
 Shared s;
public CustomThread2 (Shared s ,String str)
{
 super (str);
 this.s=s;
start();
}
public void run()
{
 s.show(Thread.currentThread().getName(),30);
 //System.out.println("thread 3 sum of 1000,2000="s,add(1000,2000));
}
}
class RunSyn
{
public static void main(String[] args)
{
Shared st=new Shared();
CustomThread t1 =new CustomThread(st,"one");
CustomThread1 t2 =new CustomThread1(st,"two");
CustomThread2 t3 =new CustomThread2(st,"Three");
}
}