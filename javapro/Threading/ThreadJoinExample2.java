import java.util.Date;
class RunnableJob implements Runnable
{
public void run()
{
Thread thread = Thread.currentThread();
System.out.println("Runnable Job is Being Run By"+thread.getName()+"At"+new Date());
try
{
thread.sleep(1000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
class ThreadJoinExample2
{
public static void main(String args[])throws InterruptedException
{
RunnableJob runnable=new RunnableJob();
Thread thread1 = new Thread(runnable,"t1");
Thread thread2 = new Thread(runnable,"t2");
Thread thread3 = new Thread(runnable,"t3");
Thread thread4 = new Thread(runnable,"t4");
thread1.start();
thread1.join();
thread2.start();
thread2.join();
thread3.start();
thread3.join();
thread4.start();
thread4.join();
Thread thread5 = new Thread(runnable,"t5");
Thread thread6 = new Thread(runnable,"t6");
Thread thread7 = new Thread(runnable,"t7");
Thread thread8 = new Thread(runnable,"t8");
thread5.start();
thread6.start();
thread7.start();
thread8.start();
}
}