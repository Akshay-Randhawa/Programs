class Simplecall
{
int salary;
Simplecall()
{
salary=15000;
}
void show()
{
System.out.println(salary);
}
public static void main(String[] args)
{
new Simplecall().show();
System.out.println(new Simplecall());
}
}

