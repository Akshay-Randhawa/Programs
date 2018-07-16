#include<iostream.h>
#include<conio.h>
void main()
{
int a,b,c,tm;
float per;
clrscr();
cout<<"Enter The Three Subject Marks = ";
cin>>a>>b>>c;
tm =a+b+c;
per=tm*100/300;
cout<<"Total Marks ="<<tm<<endl;
cout<<"Percentage  =" <<per;
getch();
}
