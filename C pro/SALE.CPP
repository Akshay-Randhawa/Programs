#include<iostream.h>
#include<conio.h>
class shop
{
char pname[20];
float sale,comm;
public:
void input()
{
cout<<"enter the Product name and sale";
cin>>pname>>sale;
}
void display()
{
comm =sale*5/100;
cout<<"commision="<<comm;
}
}s;
void main()
{clrscr();
s.input();
s.display();
getch();
}