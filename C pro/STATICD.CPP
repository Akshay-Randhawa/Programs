
#include<iostream.h>
#include<conio.h>

class abc
{
public:
int x,y;
static int z;
};
int abc::z;
void main()
{
clrscr();
abc ob1,ob2;
ob1.x=10;
ob2.x=20;
ob1.y=30;
ob2.y=40;
abc::z=100;
cout<<ob1.x<<"\t"<<ob1.y<<endl;
cout<<ob2.x<<"\t"<<ob2.y<<endl;
cout<<abc::z;
getch();
}