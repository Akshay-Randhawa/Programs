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
class PriorityThread 
{
public static void main(String[] args)
{
System.out.println(Thread.currentThread().getPriority());
System.out.println(Thread.currentThread().getPriority() +"Main");
Thread.currentThread().setPriority(10);
Thread1 t1 = new Thread1("Thread 1");
Thread2 t2 = new Thread2("Thread 2");
Thread3 t3 = new Thread3("Thread 3");
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
System.out.println(t3.getPriority());
t1.setPriority(1);
t2.setPriority(1);
t3.setPriority(1);
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
System.out.println(t3.getPriority());
}
}