interface My
{
void show();
}
class Hello
{
void display(My m)
{
m.show();
}
public static void main(String[] args)
{
Hello h = new Hello();
h.display
(
new My()
{
public void show()
{
System.out.println("Hello");
}
}
);
}
}