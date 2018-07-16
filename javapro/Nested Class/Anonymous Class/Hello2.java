interface My
{
void show();
}
class Hello2
{
void display(My m)
{
m.show();
}
public static void main(String[] args)
{
Hello2 h = new Hello2();
My z =new My()
{
public void show()
{
System.out.println("Hello");
}
};
z.show();
}
}