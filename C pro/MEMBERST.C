#include<iostream.h>
#include<conio.h>
class abc
{
int x;
static int y;
public:
void setvalue(int a)
{
x=a;
}
void display()
{
cout<<"x ="<<x<<endl;
cout<<"y ="<<y<<endl;
}
static void change()
{
y++;
}
};
int abc::y;
void main()
{
abc q,w;
q.setvalue(10);
w.setvalue(20);
q.display();
abc::change();
w.display();
getch();
}