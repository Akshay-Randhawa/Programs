class ThreadOne extends Thread
{
ThreadOne(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println(getName());
}
}
}
class ThreadTwo extends Thread
{
ThreadTwo(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(getName());
}
}
}
class ThreadThree extends Thread
{
ThreadThree(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<15;i++)
{
System.out.println(getName());
}
}
}
class FirstRunningThread 
{
public static void main(String[] args)
{
Thread t1 = new ThreadOne("Thread One");
Thread t2 = new ThreadTwo("Thread Two");
Thread t3 = new ThreadThree("Thread Three");
t1.start();
t2.start();
t3.start();
for(int i =0;i<20;i++)
{
System.out.println(Thread.currentThread().getName());
}
}
}