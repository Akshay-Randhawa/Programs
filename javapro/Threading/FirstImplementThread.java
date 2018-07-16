class Thread1 implements Runnable
{
int x=10;
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(Thread.currentThread().getName());
}
}
}
class FirstImplementThread 
{
public static void main(String[] args)
{
Thread1 t1 = new Thread1();
Thread tt1 = new Thread(t1,"Thread 1");
tt1.start();
Thread tt2 = new Thread(t1,"Thread 2");
tt2.start();
}
}