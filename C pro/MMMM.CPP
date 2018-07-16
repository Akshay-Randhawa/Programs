#include<iostream.h>
#include<conio.h>
class abc
{
int x;
int y;
public:
void setvalue(int a,int b)
{
x=a;
y=b;
}
void display()
{
cout<<"x ="<<x<<endl;
cout<<"y ="<<y<<endl;
}
void change(abc t)
{
x=x+t.x ;
y=y+t.y;
}
};
void main()
{
clrscr();
abc q,w;
q.setvalue(10,20);
w.setvalue(5,7);
q.display();
q.change(w);
q.display();
w.display();
getch();
}