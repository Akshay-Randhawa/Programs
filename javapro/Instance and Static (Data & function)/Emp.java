class Emp
{
String name;
int salary;
void get(String s,int i)
{
name=s;
salary =i;
}
void show()
{
System.out.println(name);
System.out.println(salary);
}
public static void main (String[] args)
{
Emp e1 = new Emp();
e1.get("lalo",101);
e1.show();
Emp e2 = new Emp();
e2.get("raber",51);
e2.show();
}
}