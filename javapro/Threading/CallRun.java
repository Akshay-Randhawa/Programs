class Thread1 extends Thread
{
Thread1(String s)
{
super(s);
//start(s);
}
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println(getName()+"dead");
}
}
class Thread2 extends Thread
{
Thread2(String s)
{
super(s);
//start(s);
}
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println(getName()+"dead");
}
}
class Thread3 extends Thread
{
Thread3(String s)
{
super(s);
//start(s);
}
public void run()
{
for(int i=0;i<15;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println(getName()+"dead");
}
}
class CallRun 
{
public static void main(String[] args)
{
Thread t1 = new Thread1("Thread 1");
Thread t2 = new Thread1("Thread 2");
Thread t3 = new Thread1("Thread 3");
t1.run();
t2.run();
t3.run();
for(int i =0;i<20;i++)
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(1000);
}
catch(Exception e){}
}
System.out.println(Thread.currentThread().getName()+"dead");
}
}