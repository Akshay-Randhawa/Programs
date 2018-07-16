interface My
{
void show();
}
interface My1
{
default void xyz()
{
class Local
{
void localdisplay()
{
System.out.println("Local Class In Interface");
}
} 
Local l = new Local();
l.localdisplay();
}
My z =new My()
{
public void show()
{
System.out.println("Annonymous");
}
};
class Inner
{
void display()
{
System.out.println("Static Nested Class In Interface");
}
}
}
class ClassInterface implements My1
{
public static void main(String[] args)
{
ClassInterface c = new ClassInterface();
c.xyz();
z.show();
Inner i=new Inner();
i.display();
}
}
class Temp extends My1.Inner
{
public static void main(String[] args)
{
new Temp().display();
}
}









