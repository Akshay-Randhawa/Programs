class Staticdata
{
static String cname ="TCS";
String name;
int salary;
void get(String s,int i)
{
name=s;
salary =i;
}
void show()
{
System.out.println(cname);
System.out.println(name);
System.out.println(salary);
}
public static void main (String[] args)
{
Staticdata s1 = new Staticdata();
s1.get("lalo",101);
s1.show();
Staticdata s2 = new Staticdata();
s2.get("raber",51);
s2.show();
}
}