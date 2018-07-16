class ThreadJoinExample
{
public static void main(String[] args)
{
Thread t1 = new Thread(new MyRunable(),"t1");
Thread t2 = new Thread(new MyRunable(),"t2");
Thread t3 = new Thread(new MyRunable(),"t3");
t1.start();
try
{
t1.join(2000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
t2.start();
try
{
t2.join();
}
catch(InterruptedException e)
{
e.printStackTrace();
}
t3.start();
try
{
t1.join();
t2.join();
t3.join();
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println("All Threads Are Dead Existing Main Thread");
}
}
class MyRunable implements Runnable
{
public void run()
{
System.out.println("Thread Started ::::"+Thread.currentThread().getName());
try
{
Thread.sleep(4000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println("Thread Started ::::"+Thread.currentThread().getName());
}
}
